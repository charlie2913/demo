package software.architecture.demo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import software.architecture.demo.dto.ResponseDto;

@ControllerAdvice
public class Controller {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseDto> zeroException(IllegalArgumentException e) {
        ResponseDto responseDto = new ResponseDto(null, e.getMessage(), false);
        return ResponseEntity.badRequest().body(responseDto);
    }
}
