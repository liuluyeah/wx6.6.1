package com.lu.wx.job;

import android.view.accessibility.AccessibilityEvent;

import com.lu.wx.IStatusBarNotification;
import com.lu.wx.QiangHongBaoService;

/**
 *
 * <p>Reference codeboy's blog</p>
 *
 */
public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    void onNotificationPosted(IStatusBarNotification service);
    boolean isEnable();
}
