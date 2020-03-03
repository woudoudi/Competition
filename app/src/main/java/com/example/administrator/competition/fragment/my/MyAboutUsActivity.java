package com.example.administrator.competition.fragment.my;

import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;

import butterknife.BindView;
import butterknife.OnClick;

public class MyAboutUsActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_version)
    TextView tvVersion;

    @Override
    protected int getView() {
        return R.layout.activity_my_about_us;
    }


    @Override
    public void init() {
        tvTitle.setText("关于我们");

    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
    }
}
