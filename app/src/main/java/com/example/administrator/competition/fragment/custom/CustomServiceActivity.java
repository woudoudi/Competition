package com.example.administrator.competition.fragment.custom;

import android.widget.TextView;

import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class CustomServiceActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected int getView() {
        return R.layout.activity_custom;
    }

    @Override
    public void init() {
        tvTitle.setText("客服");
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        ViewManager.getInstance().finishView();
    }
}
