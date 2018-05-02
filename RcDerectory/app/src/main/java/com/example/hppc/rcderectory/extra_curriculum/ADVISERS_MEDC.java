package com.example.hppc.rcderectory.extra_curriculum;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.rcderectory.R;

/**
 * Created by HP PC on 1/9/2017.
 */

public class ADVISERS_MEDC extends Fragment {

    View v3_medc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v3_medc = inflater.inflate(R.layout.fragment_medc_advisors, container, false);
        return v3_medc;
    }
}
