package com.jayma.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Josh on 4/23/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
