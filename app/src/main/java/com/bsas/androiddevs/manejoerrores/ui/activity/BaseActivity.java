package com.bsas.androiddevs.manejoerrores.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bsas.androiddevs.manejoerrores.presenter.BasePresenter;
import com.bsas.androiddevs.manejoerrores.ui.view.BaseView;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.presenter = this.createPresenter();
    }

    @Override
    public void displayErrorMessage(String message) {
        //TODO
    }

    @Override
    public void displayErrorMessage(int message) {
        //TODO
    }

    @Override
    public void displayWarningMessage(String message) {
        //TODO
    }

    @Override
    public void displayWarningMessage(int stringId) {
        //TODO
    }

    protected abstract T createPresenter();

}
