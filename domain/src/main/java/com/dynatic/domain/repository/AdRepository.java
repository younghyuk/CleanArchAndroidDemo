package com.dynatic.domain.repository;

import com.dynatic.domain.model.Ad;
import com.dynatic.domain.model.LoadParam;

public interface AdRepository {
    void loadAd(LoadParam loadParam, Callback callback);

    interface Callback {
        void onLoaded(Ad ad);
    }
}
