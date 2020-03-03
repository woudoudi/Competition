package com.example.administrator.competition.fragment.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.base.scanlistlibrary.scanlist.ScanVideoPlayView;
import com.example.administrator.competition.R;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFreeConfrontationActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.scan_free_confrontation)
    ScanVideoPlayView scanFreeConfrontation;

    @Override
    protected int getView() {
        return R.layout.activity_home_free_confrontation;
    }

    @Override
    public void init() {
        tvTitle.setText("自由对抗");
        ivRight.setImageResource(R.mipmap.add_free);
    }

    @OnClick({R.id.iv_back, R.id.iv_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.iv_right:
                skipActivity(HomeAddConfrontationActivity.class);
                break;
        }
    }
}
