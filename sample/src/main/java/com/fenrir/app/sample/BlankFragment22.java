package com.fenrir.app.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import indi.yume.tools.fragmentmanager.BaseManagerFragment;

/**
 * Created by yume on 16-4-21.
 */
public class BlankFragment22 extends BaseManagerFragment {


    public BlankFragment22() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println(this.getClass().getSimpleName() + ": onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment22, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        System.out.println(this.getClass().getSimpleName() + ": onViewCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println(this.getClass().getSimpleName() + ": onResume");
    }

    @Override
    protected void onShow() {
        super.onShow();
        System.out.println(this.getClass().getSimpleName() + ": onShow");
    }

    @Override
    protected void onHide() {
        super.onHide();
        System.out.println(this.getClass().getSimpleName() + ": onHide");
    }
}