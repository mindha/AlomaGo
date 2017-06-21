package com.studio.illiyin.alomagoindonesia.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studio.illiyin.alomagoindonesia.R;

/**
 * Created by Mindha on 16/06/2017.
 */

public class Registration extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_registration,container,false);
        Tampilkan();
        return myView;
    }

    public void Tampilkan(){
        FragmentDua first = new FragmentDua();
        FragmentTransaction fragment = getActivity().getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.container, first);
        fragment.commit();
    }
}
