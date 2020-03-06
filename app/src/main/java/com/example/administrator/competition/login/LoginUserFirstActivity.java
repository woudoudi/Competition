package com.example.administrator.competition.login;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.base.http.ResponseBean;
import com.yidao.module_lib.utils.PhoneUtils;
import com.yidao.module_lib.utils.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginUserFirstActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.iv_next)
    ImageView ivNext;
    @BindView(R.id.tv_forget_pwd)
    TextView tvForgetPwd;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.tv_third_tip)
    TextView tvThirdTip;
    @BindView(R.id.iv_back)
    ImageView ivBack;

    @Override
    protected int getView() {
        return R.layout.activity_login_user_first;
    }

    @Override
    public void init() {
        ivBack.setVisibility(View.GONE);
        tvTitle.setText("登录");

        etPwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(PhoneUtils.isPhone(etPhone.getText().toString()) && !TextUtils.isEmpty(s.toString())){
                    ivNext.setSelected(true);
                } else {
                    ivNext.setSelected(false);
                }
            }
        });
    }

    @OnClick({R.id.iv_next, R.id.iv_third_login, R.id.tv_forget_pwd, R.id.tv_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_next:
                String phone = etPhone.getText().toString();
                if (!PhoneUtils.isPhone(phone)) {
                    ToastUtil.showShortToast("请输入正确的手机号");
                    return;
                }
                if (TextUtils.isEmpty(etPwd.getText())) {
                    ToastUtil.showShortToast("请先输入密码");
                    return;
                }
                break;
            case R.id.iv_third_login:
                skipActivity(BindPhoneUserActivity.class);
                break;
            case R.id.tv_forget_pwd:
                skipActivity(UpdateUserActivity.class);
                break;
            case R.id.tv_register:
                skipActivity(RegisterUserActivity.class);
                break;
        }
    }

    @Override
    public void onResponse(boolean success, Class requestCls, ResponseBean responseBean) {
        super.onResponse(success, requestCls, responseBean);
    }
}
