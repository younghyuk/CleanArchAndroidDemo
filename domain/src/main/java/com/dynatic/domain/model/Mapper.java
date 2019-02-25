package com.dynatic.domain.model;

public class Mapper {
    public static LoadParam transform(LoadParam loadParam) {
        return new LoadParam();
    }

    public static Ad transform(Ad ad) {
        return new Ad();
    }
}
