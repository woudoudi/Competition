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

public class MySettingActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_right)
    TextView tvRight;

    @BindView(R.id.iv_head)
    ImageView ivHead;

    @BindView(R.id.tv_name)
    TextView tvName;

    @Override
    protected int getView() {
        return R.layout.activity_my_setting;
    }

    @Override
    public void init() {
        tvTitle.setText("设置");
        tvRight.setText("确定");
    }

    @OnClick({R.id.iv_back, R.id.tv_right, R.id.rl_clear, R.id.rl_about_us, R.id.tv_logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_right:
                break;
            case R.id.rl_clear:
                break;
            case R.id.rl_about_us:
                skipActivity(MyAboutUsActivity.class);
                break;
            case R.id.tv_logout:
                break;
        }
    }
}
