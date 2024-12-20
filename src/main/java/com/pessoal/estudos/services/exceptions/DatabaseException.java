package com.pessoal.estudos.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseException(String mss) {
        super(mss);
    }
}
