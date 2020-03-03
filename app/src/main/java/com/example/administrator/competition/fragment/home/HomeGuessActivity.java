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

public class HomeGuessActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_king_title)
    TextView tvKingTitle;
    @BindView(R.id.tv_king_content)
    TextView tvKingContent;
    @BindView(R.id.tv_trumpet_title)
    TextView tvTrumpetTitle;
    @BindView(R.id.tv_trumpet_content)
    TextView tvTrumpetContent;

    @Override
    protected int getView() {
        return R.layout.activity_home_guess;
    }

    @Override
    public void init() {
        tvTitle.setText("全民竞猜");
    }

    @OnClick({R.id.iv_back, R.id.rl_number_race, R.id.rl_king_mode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.rl_number_race:
                break;
            case R.id.rl_king_mode:
                skipActivity(HomeRecordActivity.class);
                break;
        }
    }
}
