package com.nelioalves.cursomc.services.exceptions;

public class ObjectNotFoundExeception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundExeception(String message) {
		super(message);
	}

	public ObjectNotFoundExeception(String message, Throwable cause) {
		super(message, cause);
	}
}
