package com.dynatic.data.repository;

import com.dynatic.data.datasource.AdDatasource;
import com.dynatic.data.model.AdResponse;
import com.dynatic.data.model.Mapper;
import com.dynatic.domain.model.LoadParam;
import com.dynatic.domain.repository.AdRepository;

public class AdRepositoryImpl implements AdRepository {

    private AdDatasource adDatasource;

    public AdRepositoryImpl(AdDatasource adDatasource) {
        this.adDatasource = adDatasource;
    }

    @Override
    public void loadAd(LoadParam loadParam, final Callback callback) {
        adDatasource.loadAd(Mapper.transform(loadParam), new AdDatasource.Callback() {
            @Override
            public void onLoaded(AdResponse adResponse) {
                callback.onLoaded(Mapper.transform(adResponse));
            }
        });
    }
}
