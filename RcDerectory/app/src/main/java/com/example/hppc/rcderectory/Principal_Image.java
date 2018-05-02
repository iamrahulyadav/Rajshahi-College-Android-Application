package com.example.hppc.rcderectory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP PC on 11/20/2016.
 */

public class Principal_Image extends Fragment{

    View v;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_principal_image, container, false);

        return v;
    }
}
