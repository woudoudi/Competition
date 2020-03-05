package com.example.tbs_live_lib.activity;

import android.widget.EditText;
import android.widget.ImageView;

import com.example.tbs_live_lib.R;
import com.yidao.module_lib.base.BaseView;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginAnchorFirstActivity extends BaseView {

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.iv_next)
    ImageView ivNext;

    @Override
    protected int getView() {
        return R.layout.activity_login_anchor_first;
    }


    @Override
    public void init() {

    }


    @OnClick(R.id.iv_next)
    public void onViewClicked() {
        skipActivity(LoginAnchorSecondActivity.class);
    }
}
