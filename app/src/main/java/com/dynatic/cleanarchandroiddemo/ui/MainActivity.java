package com.dynatic.cleanarchandroiddemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dynatic.cleanarchandroiddemo.R;
import com.dynatic.cleanarchandroiddemo.presentation.MainContract;
import com.dynatic.cleanarchandroiddemo.presentation.MainPresenter;
import com.dynatic.data.datasource.AdNetworkDatasource;
import com.dynatic.data.repository.AdRepositoryImpl;
import com.dynatic.domain.model.Ad;
import com.dynatic.domain.usecase.LoadAdUsecase;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this, new LoadAdUsecase(new AdRepositoryImpl(new AdNetworkDatasource())));

        textView = findViewById(R.id.text);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadAd(1);
            }
        });
    }

    @Override
    public void dispatchAd(Ad ad) {
        textView.setText(ad.title);
    }
}
