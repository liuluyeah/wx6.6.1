package com.lu.wx;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * <p>Reference codeboy's blog</p>
 *
 */
public class BaseSettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPreferenceManager().setSharedPreferencesName(Config.PREFERENCE_NAME);
    }
}
