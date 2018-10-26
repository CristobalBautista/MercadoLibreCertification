package com.mercadolibre.certification.exceptions;

public class SelectionOutOfBound extends AssertionError {
	
	private static final long serialVersionUID = 1L;
	public static final String SELECTION_OUT_OF_BOUND_MESSAGE = "The selected product is out of bound from the list of products. It should be a lower number";
	
	public SelectionOutOfBound(String message, Throwable cause) {
        super(message, cause);
    }
}
