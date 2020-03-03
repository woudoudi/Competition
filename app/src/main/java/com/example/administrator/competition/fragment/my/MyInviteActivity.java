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

public class MyInviteActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_qrCode)
    ImageView ivQrCode;
    @BindView(R.id.tv_invite_code)
    TextView tvInviteCode;
    @BindView(R.id.iv_right)
    ImageView ivRight;

    @Override
    protected int getView() {
        return R.layout.activity_my_invite;
    }

    @Override
    public void init() {
        tvTitle.setText("邀请");
        ivRight.setImageResource(R.mipmap.invite_share);
    }


    @OnClick({R.id.iv_back,R.id.iv_right})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.iv_right:
                break;
        }
    }
}
