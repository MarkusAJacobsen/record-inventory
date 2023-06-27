package com.markusja.recordinventoryapi.web;

public record Problem(String title, String detail) {
    public static Problem of(String title, String detail) {
        return new Problem(title, detail);
    }
}
