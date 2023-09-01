package com.soulcode.goserviceapp.service.exceptions;

public class DataInvalidaException extends RuntimeException{
	public DataInvalidaException ()
	{super("Data inválida.");}
	public DataInvalidaException (String message)
	{super(message);}
}
