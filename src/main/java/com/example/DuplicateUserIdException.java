package com.example;

public class DuplicateUserIdException extends RuntimeException {
    public DuplicateUserIdException(Throwable cause){
        super(cause);
    }
}
