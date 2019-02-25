package com.dynatic.cleanarchandroiddemo.presentation;

import com.dynatic.domain.model.Ad;

public interface MainContract {
    interface Presenter {
        void loadAd(int id);
    }

    interface View {
        void dispatchAd(Ad ad);
    }
}
