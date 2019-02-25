package com.dynatic.data.model;

import com.dynatic.domain.model.Ad;
import com.dynatic.domain.model.LoadParam;

public class Mapper {
    public static AdRequest transform(LoadParam loadParam) {
        return new AdRequest();
    }

    public static Ad transform(AdResponse adResponse) {
        return new Ad();
    }
}
