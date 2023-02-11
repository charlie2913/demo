package software.architecture.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.architecture.demo.bl.CurrencyBl;
import java.math.BigDecimal;
import java.util.Map;


@RestController
@RequestMapping("api/v1/currency")
public class CurrencyApi {
    private CurrencyBl currencyBl;

    public CurrencyApi(CurrencyBl currencyBl) {
        this.currencyBl = currencyBl;
    }
    @GetMapping("/recieve")
    public String recieve(@RequestHeader Map<String, String> headers) throws Exception {
        String from = headers.get("from");
        String to = headers.get("to");
        BigDecimal amount = headers.get("amount") != null ? new BigDecimal(headers.get("amount")) : null;
        currencyBl.recieve(from, to, amount);
        return "Hello World";
    }
}
