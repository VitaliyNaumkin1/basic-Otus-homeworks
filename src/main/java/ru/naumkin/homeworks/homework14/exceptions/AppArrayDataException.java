package ru.naumkin.homeworks.homework14.exceptions;

public class AppArrayDataException extends RuntimeException {
    private final int rowIndexOfArray;
    private final int columnIndexOfArray;

    @Override
    public String getMessage() {
        return "Неверное содержание ячейки,строку ячейки невозможно преобразовать в число, содержание ячейки:" + super.getMessage() +
                ", координаты ячейки: " + "[" + rowIndexOfArray + "]" + "[" + columnIndexOfArray + "]";
    }

    public AppArrayDataException(String message, int rowIndexOfArray, int columnIndexOfArray) {
        super(message);
        this.rowIndexOfArray = rowIndexOfArray;
        this.columnIndexOfArray = columnIndexOfArray;
    }
}
