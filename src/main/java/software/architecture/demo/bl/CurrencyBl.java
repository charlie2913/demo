package software.architecture.demo.bl;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import software.architecture.demo.dto.CurrencyDto;

import java.io.IOException;
import java.math.BigDecimal;

@Service
public class CurrencyBl {
    public CurrencyDto exchange(String from, String to, BigDecimal amount) throws IOException {
        if(amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request req = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?to="+to+"&from="+from+"&amount="+amount)
                .addHeader("apikey", "7kFsNWgEr4jIYz7i9I7l3TkzmvG572Wd")
                .build();
        Response response = client.newCall(req).execute();
        String json = response.body().string();


        ObjectMapper mapper = new ObjectMapper();
        CurrencyDto currencyDto = mapper.readValue(json, CurrencyDto.class);
        return currencyDto;
}}

