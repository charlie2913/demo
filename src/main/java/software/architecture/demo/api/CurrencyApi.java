package software.architecture.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import software.architecture.demo.bl.CurrencyBl;
import software.architecture.demo.dto.CurrencyDto;
import software.architecture.demo.dto.ResponseDto;
import java.math.BigDecimal;


@RestController
@RequestMapping("api/v1/currency")
public class CurrencyApi {
    private CurrencyBl currencyBl;

    public CurrencyApi(CurrencyBl currencyBl) {
        this.currencyBl = currencyBl;
    }
    @GetMapping("/exchange")
    public ResponseEntity<ResponseDto<CurrencyDto>> exchange(@RequestParam String from, @RequestParam String to, @RequestParam BigDecimal amount) throws Exception {
        CurrencyDto currencyDto = currencyBl.exchange(from, to, amount);
        ResponseDto<CurrencyDto> responseDto = new ResponseDto<CurrencyDto>(currencyDto,"Success", true);
        return ResponseEntity.ok(responseDto);
    }
}
