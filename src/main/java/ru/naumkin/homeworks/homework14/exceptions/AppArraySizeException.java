package ru.naumkin.homeworks.homework14.exceptions;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
