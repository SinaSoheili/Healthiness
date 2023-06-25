package net.sinasoheili.healthiness.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandlerImpl {

    @ExceptionHandler({ConstraintViolationException.class})
    ResponseEntity<String> expHandler(ConstraintViolationException exp) {
        StringBuilder sb = new StringBuilder();
        exp.getConstraintViolations().forEach(obj -> sb.append(obj.getMessage()).append(System.lineSeparator()));
        return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    ResponseEntity<String> expHandler1(MethodArgumentNotValidException exp) {
        StringBuilder sb = new StringBuilder();
        exp.getBindingResult().getAllErrors().forEach(obj -> sb.append(obj.getDefaultMessage()).append(System.lineSeparator()));
        return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
    }
}
