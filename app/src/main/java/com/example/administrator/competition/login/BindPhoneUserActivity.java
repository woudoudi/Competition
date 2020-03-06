package com.example.administrator.competition.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.base.http.ResponseBean;
import com.yidao.module_lib.manager.ViewManager;
import com.yidao.module_lib.utils.PhoneUtils;
import com.yidao.module_lib.utils.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BindPhoneUserActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_vCode)
    EditText etVCode;
    @BindView(R.id.tv_get_vCode)
    TextView tvGetVCode;
    @BindView(R.id.iv_next)
    ImageView ivNext;

    @Override
    protected int getView() {
        return R.layout.activity_bind_phone_user;
    }


    @Override
    public void init() {
        tvTitle.setText("绑定手机号");
    }


    @OnClick({R.id.iv_back, R.id.tv_get_vCode, R.id.iv_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_get_vCode:
                break;
            case R.id.iv_next:
                String phone = etPhone.getText().toString();
                if (!PhoneUtils.isPhone(phone)) {
                    ToastUtil.showShortToast("请输入正确的手机号");
                    return;
                }
                if (TextUtils.isEmpty(etVCode.getText())) {
                    ToastUtil.showShortToast("请先输入验证码");
                    return;
                }
                break;
        }
    }

    @Override
    public void onResponse(boolean success, Class requestCls, ResponseBean responseBean) {
        super.onResponse(success, requestCls, responseBean);
    }
}
