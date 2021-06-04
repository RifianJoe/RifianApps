package com.rifiandev.rifianapps;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rifiandev.rifianapps.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link walkthrough2#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class walkthrough2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_walkthrough2,container, false);

        return rootView;
    }
}