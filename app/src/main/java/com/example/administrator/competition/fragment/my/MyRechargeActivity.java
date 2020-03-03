package com.example.administrator.competition.fragment.my;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyRechargeActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_qrCode)
    ImageView ivQrCode;

    @Override
    protected int getView() {
        return R.layout.activity_my_recharge;
    }

    @Override
    public void init() {
        tvTitle.setText("充值");
    }


    @OnClick({R.id.iv_back,R.id.iv_save})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.iv_save:
                break;
        }
    }
}
