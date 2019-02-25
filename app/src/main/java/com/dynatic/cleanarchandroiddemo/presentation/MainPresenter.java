package com.dynatic.cleanarchandroiddemo.presentation;

import com.dynatic.domain.model.Ad;
import com.dynatic.domain.model.LoadParam;
import com.dynatic.domain.usecase.LoadAdUsecase;
import com.dynatic.domain.usecase.Usecase;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final LoadAdUsecase usecase;

    public MainPresenter(MainContract.View view, LoadAdUsecase usecase) {
        this.view = view;
        this.usecase = usecase;
    }

    @Override
    public void loadAd(int id) {
        usecase.execute(new LoadParam(1), new Usecase.Callback<Ad>() {
            @Override
            public void onCallback(Ad output) {
                view.dispatchAd(output);
            }
        });
    }
}
