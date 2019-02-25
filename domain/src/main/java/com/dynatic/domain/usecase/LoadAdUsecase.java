package com.dynatic.domain.usecase;

import com.dynatic.domain.model.Ad;
import com.dynatic.domain.model.LoadParam;
import com.dynatic.domain.model.Mapper;
import com.dynatic.domain.repository.AdRepository;

public class LoadAdUsecase implements Usecase<LoadParam, Ad> {

    private AdRepository adRepository;

    public LoadAdUsecase(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    public void execute(LoadParam loadParam, final Callback<Ad> output) {
        adRepository.loadAd(Mapper.transform(loadParam), new AdRepository.Callback() {
            @Override
            public void onLoaded(Ad ad) {
                output.onCallback(Mapper.transform(ad));
            }
        });
    }
}