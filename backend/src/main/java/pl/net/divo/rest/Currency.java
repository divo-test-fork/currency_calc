package pl.net.divo.rest;

import lombok.Getter;

@Getter
public class Currency {

    private final long id;
    private final String key;
    private final String name;

    public Currency(long id, String key, String name) {
        this.id = id;
        this.key = key;
        this.name = name;
    }
}