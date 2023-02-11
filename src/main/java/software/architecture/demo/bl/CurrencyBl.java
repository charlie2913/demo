package software.architecture.demo.bl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
@Service
public class CurrencyBl {
    public static void recieve(String from, String to, BigDecimal amount) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request req = new Request.Builder()
                .url("https://api.apilayer.com/currency_data/convert?to=BOB&from=USD&amount=1000")
                .addHeader("apikey", "7kFsNWgEr4jIYz7i9I7l3TkzmvG572Wd")
                .method("GET", null)
                .build();
        System.out.println("hola");
        Response response = client.newCall(req).execute();
        System.out.println(response.body().string());
    }
}
