package com.dynatic.data.datasource;

import com.dynatic.data.model.AdRequest;
import com.dynatic.data.model.AdResponse;

public interface AdDatasource {
    void loadAd(AdRequest adRequest, Callback callback);

    interface Callback {
        void onLoaded(AdResponse adResponse);
    }
}
