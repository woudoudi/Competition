package com.example.administrator.competition.login;

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

public class LoginAnchorThirdActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_live_title)
    TextView tvLiveTitle;
    @BindView(R.id.tv_good_hero)
    TextView tvGoodHero;
    @BindView(R.id.tv_win_rate)
    TextView tvWinRate;
    @BindView(R.id.iv_live_cover)
    ImageView ivLiveCover;

    @Override
    protected int getView() {
        return R.layout.activity_login_anchor_third;
    }

    @Override
    public void init() {
        tvTitle.setText("我要直播");
    }

    @OnClick({R.id.iv_back, R.id.tv_start_live})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_start_live:
                break;
        }
    }
}
