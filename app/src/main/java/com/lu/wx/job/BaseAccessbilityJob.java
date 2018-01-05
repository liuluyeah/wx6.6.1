package com.lu.wx.job;

import android.content.Context;

import com.lu.wx.Config;
import com.lu.wx.QiangHongBaoService;

/**
 *
 * <p>Reference codeboy's blog</p>
 *
 */
public abstract class BaseAccessbilityJob implements AccessbilityJob {

    private QiangHongBaoService service;

    @Override
    public void onCreateJob(QiangHongBaoService service) {
        this.service = service;
    }

    public Context getContext() {
        return service.getApplicationContext();
    }

    public Config getConfig() {
        return service.getConfig();
    }

    public QiangHongBaoService getService() {
        return service;
    }
}
