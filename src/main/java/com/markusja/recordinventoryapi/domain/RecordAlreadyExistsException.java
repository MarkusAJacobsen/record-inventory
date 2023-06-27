package com.markusja.recordinventoryapi.domain;

public class RecordAlreadyExistsException extends RuntimeException {
    public RecordAlreadyExistsException(String recordTitle) {
        super("A record with title " + recordTitle + " already exists");
    }
}
