package ru.asocial.testlib;

public class StringHelper implements IStringHelper{
    @Override
    public boolean startsWith(String input, String startsWith) {
        if (input == null) {
            throw new NullPointerException("input is null");
        }
        if (startsWith == null) {
            throw new NullPointerException("startsWith is null");
        }

        if (input.isEmpty()) {
            throw new IllegalArgumentException("empty strings are not allowed");
        }

        return input.startsWith(startsWith);
    }
}
