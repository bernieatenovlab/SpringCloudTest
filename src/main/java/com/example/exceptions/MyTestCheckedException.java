package com.example.exceptions;

public class MyTestCheckedException extends Exception {
    public MyTestCheckedException() {
        super();
    }

    public MyTestCheckedException(String message) {
        super(message);
    }

    public MyTestCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyTestCheckedException(Throwable cause) {
        super(cause);
    }

    public MyTestCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
