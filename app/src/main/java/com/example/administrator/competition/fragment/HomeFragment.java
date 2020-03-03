package com.example.administrator.competition.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.example.administrator.competition.fragment.home.HomeGuessActivity;
import com.example.administrator.competition.fragment.home.HomeKindActivity;
import com.yidao.module_lib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.iv_head)
    ImageView ivHead;

    @BindView(R.id.tv_integral)
    TextView tvIntegral;

    @BindView(R.id.tv_trumpet)
    TextView tvTrumpet;

    @BindView(R.id.tv_king_title)
    TextView tvKingTitle;

    @BindView(R.id.tv_king_content)
    TextView tvKingContent;

    @BindView(R.id.tv_trumpet_title)
    TextView tvTrumpetTitle;

    @BindView(R.id.tv_trumpet_content)
    TextView tvTrumpetContent;

    @Override
    protected int getLayoutId() {
        return R.layout.framelayout_home;
    }

    @Override
    protected void initPress() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.iv_add, R.id.iv_custom, R.id.rl_king_mode, R.id.rl_guess_mode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_add:
                break;
            case R.id.iv_custom:
                break;
            case R.id.rl_king_mode:
                skipActivity(HomeKindActivity.class);
                break;
            case R.id.rl_guess_mode:
                skipActivity(HomeGuessActivity.class);
                break;
        }
    }
}
