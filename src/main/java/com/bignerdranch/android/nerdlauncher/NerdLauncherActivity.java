package com.bignerdranch.android.nerdlauncher;


import android.app.Fragment;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
        // here's a change
    }

}
