package com.example.administrator.competition.fragment.home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeConfrontationSureActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_first_nick)
    TextView tvFirstNick;
    @BindView(R.id.tv_first_phone)
    TextView tvFirstPhone;
    @BindView(R.id.tv_first_number)
    TextView tvFirstNumber;
    @BindView(R.id.tv_second_nick)
    TextView tvSecondNick;
    @BindView(R.id.tv_second_phone)
    TextView tvSecondPhone;
    @BindView(R.id.tv_second_number)
    TextView tvSecondNumber;
    @BindView(R.id.tv_confrontation_sure)
    TextView tvConfrontationSure;

    @Override
    protected int getView() {
        return R.layout.activity_home_confrontation_sure;
    }

    @Override
    public void init() {
        tvTitle.setText("对抗确认");
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
    }

    @OnClick({R.id.iv_back, R.id.tv_confrontation_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_confrontation_sure:
                break;
        }
    }
}
