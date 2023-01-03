package com.example.expviewmodel;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    String data1;
    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }



}
