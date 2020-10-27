package org.example.impl;

import org.example.api.IDemoApi;

public class DemoApiImpl implements IDemoApi {
    private final String samoParameter;

    public DemoApiImpl(String samoParameter) {
        this.samoParameter = samoParameter;
    }

    public String someMethod() {
        return getClass().getCanonicalName().concat("_").concat(samoParameter);
    }
}
