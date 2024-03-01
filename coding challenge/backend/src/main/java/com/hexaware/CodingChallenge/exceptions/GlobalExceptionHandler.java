package com.hexaware.CodingChallenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//	@ExceptionHandler(illegalEntryException.class)
//	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "validations are missing")
//	public void handleExp() {
//       
//	}
//}

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(illegalEntryException.class)
    public ResponseEntity<String> handleExp(illegalEntryException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Player not found");
    }
}