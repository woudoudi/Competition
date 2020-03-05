package com.example.tbs_live_lib.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.tbs_live_lib.R;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.yidao.module_lib.base.BaseView;
import com.yidao.module_lib.manager.PermissionManager;
import com.yidao.module_lib.manager.ViewManager;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginAnchorThirdActivity extends BaseView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_live_title)
    TextView tvLiveTitle;
    @BindView(R.id.tv_good_hero)
    TextView tvGoodHero;
    @BindView(R.id.tv_win_rate)
    TextView tvWinRate;
    @BindView(R.id.iv_live_cover)
    ImageView ivLiveCover;



    @Override
    protected int getView() {
        return R.layout.activity_login_anchor_third;
    }

    @Override
    public void init() {
        tvTitle.setText("我要直播");
    }

    @OnClick({R.id.iv_back, R.id.tv_start_live})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                ViewManager.getInstance().finishView();
                break;
            case R.id.tv_start_live:
                PermissionManager.getInstance().setIPermissionLiatener(new PermissionManager.IPermissionListener() {
                    @Override
                    public void getPermissionSuccess() {

                        TXLivePusher mLivePusher = new TXLivePusher(getCtx());
                        TXLivePushConfig mLivePushConfig = new TXLivePushConfig();
                        mLivePusher.setConfig(mLivePushConfig);


                        String rtmpUrl = "rtmp://2157.livepush.myqcloud.com/live/xxxxxx";
                        mLivePusher.startPusher(rtmpUrl);
                        mLivePusher.startScreenCapture();


                        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N && !Settings.canDrawOverlays(LoginAnchorThirdActivity.this)) {
                            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + LoginAnchorThirdActivity.this.getPackageName()));
                            startActivityForResult(intent, 11);
                        }


                    }
                });
                PermissionManager.getInstance().requestPermissions(this);
                break;
        }
    }
}
