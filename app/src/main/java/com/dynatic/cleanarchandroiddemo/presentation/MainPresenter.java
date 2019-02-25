package com.dynatic.cleanarchandroiddemo.presentation;

import com.dynatic.data.repository.AdRepositoryImpl;
import com.dynatic.domain.model.Ad;
import com.dynatic.domain.model.LoadParam;
import com.dynatic.domain.repository.AdRepository;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final AdRepositoryImpl adRepository;

    public MainPresenter(MainContract.View view, AdRepositoryImpl adRepository) {
        this.view = view;
        this.adRepository = adRepository;
    }

    @Override
    public void loadAd(int id) {
        adRepository.loadAd(new LoadParam(1), new AdRepository.Callback() {
            @Override
            public void onLoaded(Ad ad) {
                view.dispatchAd(ad);
            }
        });
    }
}
