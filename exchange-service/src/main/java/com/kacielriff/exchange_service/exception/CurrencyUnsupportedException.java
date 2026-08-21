package com.kacielriff.exchange_service.exception;

public class CurrencyUnsupportedException extends RuntimeException {
    public CurrencyUnsupportedException(String message) {
        super(message);
    }
}
