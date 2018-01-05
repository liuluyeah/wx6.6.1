package com.lu.wx;

import android.app.Notification;

/**
 * <p>Reference codeboy's blog</p>
 *
 */
public interface IStatusBarNotification {

    String getPackageName();
    Notification getNotification();
}
