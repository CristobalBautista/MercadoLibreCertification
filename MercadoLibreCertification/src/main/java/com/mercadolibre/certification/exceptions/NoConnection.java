package com.mercadolibre.certification.exceptions;

public class NoConnection extends AssertionError {

	private static final long serialVersionUID = 1L;
	public static final String PAGE_NOT_LOADED_MESSAGE = "There is no connection. The page could not be loaded";
	
	public NoConnection(String message, Throwable cause) {
        super(message, cause);
    }

}
