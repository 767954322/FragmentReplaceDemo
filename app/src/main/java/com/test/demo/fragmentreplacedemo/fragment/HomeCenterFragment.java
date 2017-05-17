package com.test.demo.fragmentreplacedemo.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.test.demo.fragmentreplacedemo.R;
import com.test.demo.fragmentreplacedemo.base.BaseFragment;

@SuppressLint("ValidFragment")
public class HomeCenterFragment extends BaseFragment {

    private FragmentManager fragmentManager;

    public HomeCenterFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_center_pic;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

}
