package com.markusja.recordinventoryapi.domain;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(Integer id) {
        super("A record with ID " + id + " was not found");
    }
}
