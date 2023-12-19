package ru.asocial.testlib;

import ru.asocial.lib2.Library;

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

        Library lib = new Library();
        lib.foo();

        return input.startsWith(startsWith);
    }
}
