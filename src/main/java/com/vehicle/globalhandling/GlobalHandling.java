package com.vehicle.globalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vehicle.customexception.BrandNotFoundException;
import com.vehicle.customexception.InvalidBoardException;
import com.vehicle.customexception.NoValueException;

@RestControllerAdvice
public class GlobalHandling {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object> brandHandler() {
		return new ResponseEntity<>("brand not here",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(InvalidBoardException.class)
	public ResponseEntity<Object> boardHandler() {
		return new ResponseEntity<>("not valid",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoValueException.class)
	public ResponseEntity<Object> idHandler() {
		return new ResponseEntity<>("Unvalid data",HttpStatus.BAD_REQUEST);
	}
}
