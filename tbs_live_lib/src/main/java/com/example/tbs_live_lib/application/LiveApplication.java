package com.example.tbs_live_lib.application;

import com.tencent.rtmp.TXLiveBase;
import com.yidao.module_lib.base.BaseApplication;

public class LiveApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        TXLiveBase.setConsoleEnabled(true);

        String licenceURL = "http://license.vod2.myqcloud.com/license/v1/87b8fdcd59521322e145c56c95bc2f86/TXLiveSDK.licence"; // 获取到的 licence url
        String licenceKey = "8fcf2e2eaaa1af4cd26ca831f11ccf0d"; // 获取到的 licence key
        TXLiveBase.getInstance().setLicence(this, licenceURL, licenceKey);
    }
}
