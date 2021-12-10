package com.example.electric.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.electric.model.ErrorMessage;

@Component
@ControllerAdvice
public class GlobalApiException {

	@ExceptionHandler(value = IllegalStateException.class)
	public ResponseEntity<ErrorMessage> handleError(IllegalStateException exp){
		ErrorMessage message = new ErrorMessage();
		message.setErrorMessage(exp.getMessage());
		message.setSeverity("E");
		message.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	}
}
