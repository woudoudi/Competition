package com.example.administrator.competition.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.competition.R;
import com.example.administrator.competition.fragment.my.MyBetActivity;
import com.example.administrator.competition.fragment.my.MyIntegralActivity;
import com.example.administrator.competition.fragment.my.MyInviteActivity;
import com.example.administrator.competition.fragment.my.MyRechargeActivity;
import com.example.administrator.competition.fragment.my.MySettingActivity;
import com.yidao.module_lib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class MyFragment extends BaseFragment {

    @BindView(R.id.iv_head)
    ImageView ivHead;

    @BindView(R.id.tv_name)
    TextView tvName;

    @Override
    protected int getLayoutId() {
        return R.layout.framelayout_my;
    }

    @Override
    protected void initPress() {
    }

    @Override
    protected void init() {
    }

    @OnClick({R.id.rl_integral, R.id.rl_recharge,  R.id.rl_invite, R.id.rl_bet,R.id.rl_setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_integral:
                skipActivity(MyIntegralActivity.class);
                break;
            case R.id.rl_recharge:
                skipActivity(MyRechargeActivity.class);
                break;
            case R.id.rl_invite:
                skipActivity(MyInviteActivity.class);
                break;
            case R.id.rl_bet:
                skipActivity(MyBetActivity.class);
                break;
            case R.id.rl_setting:
                skipActivity(MySettingActivity.class);
                break;
        }
    }
}
