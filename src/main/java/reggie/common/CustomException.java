package reggie.common;

import org.springframework.web.bind.annotation.ExceptionHandler;


public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }

}
