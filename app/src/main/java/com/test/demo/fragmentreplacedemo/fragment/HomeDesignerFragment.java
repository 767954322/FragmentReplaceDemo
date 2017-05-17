package com.test.demo.fragmentreplacedemo.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.test.demo.fragmentreplacedemo.R;
import com.test.demo.fragmentreplacedemo.base.BaseFragment;

@SuppressLint("ValidFragment")
public class HomeDesignerFragment extends BaseFragment {

    private FragmentManager fragmentManager;

    public HomeDesignerFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_designer_pic;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

}
