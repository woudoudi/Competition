package com.example.administrator.competition.fragment.my;

import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyIntegralActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_integral)
    TextView tvIntegral;
    @BindView(R.id.tv_bet_time)
    TextView tvBetTime;
    @BindView(R.id.tv_bet_total)
    TextView tvBetTotal;
    @BindView(R.id.tv_recharge_time)
    TextView tvRechargeTime;
    @BindView(R.id.tv_recharge_total)
    TextView tvRechargeTotal;

    @Override
    protected int getView() {
        return R.layout.activity_my_integral;
    }


    @Override
    public void init() {
        tvTitle.setText("积分");
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        ViewManager.getInstance().finishView();
    }
}
