package com.mercadolibre.certification.exceptions;

public class InvalidQuantity extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	public static final String INVALID_QUANTITY = "Too many units requested. It should be a smaller quantity";
	
	public InvalidQuantity(String message, Throwable cause) {
        super(message, cause);
    }
}
