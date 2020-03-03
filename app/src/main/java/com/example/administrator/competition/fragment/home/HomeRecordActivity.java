package com.example.administrator.competition.fragment.home;

import android.widget.TextView;

import com.base.scanlistlibrary.scanlist.ScanVideoPlayView;
import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeRecordActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.scan_record)
    ScanVideoPlayView scanRecord;

    @Override
    protected int getView() {
        return R.layout.activity_home_record;
    }

    @Override
    public void init() {
        tvTitle.setText("录播回放");
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        ViewManager.getInstance().finishView();
    }
}
