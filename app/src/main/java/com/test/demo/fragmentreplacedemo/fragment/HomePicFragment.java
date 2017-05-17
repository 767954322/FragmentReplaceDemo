package com.test.demo.fragmentreplacedemo.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.test.demo.fragmentreplacedemo.R;
import com.test.demo.fragmentreplacedemo.base.BaseFragment;

@SuppressLint("ValidFragment")
public class HomePicFragment extends BaseFragment {

    private FragmentManager fragmentManager;

    public HomePicFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_home_pic;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

}
