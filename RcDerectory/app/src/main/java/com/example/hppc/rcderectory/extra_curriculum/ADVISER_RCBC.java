package com.example.hppc.rcderectory.extra_curriculum;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.rcderectory.R;

/**
 * Created by HP PC on 1/8/2017.
 */

public class ADVISER_RCBC extends Fragment {

    View v3_rcbc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v3_rcbc = inflater.inflate(R.layout.fragment_rcbc_advisor, container, false);

        return v3_rcbc;
    }
}
