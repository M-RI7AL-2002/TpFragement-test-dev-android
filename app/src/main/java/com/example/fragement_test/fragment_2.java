package com.example.fragement_test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class fragment_2 extends Fragment {
    Button button;
    public fragment_2(){
        super(R.layout.fragment_2);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        button=view.findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Suiiiii ", Toast.LENGTH_LONG).show();
        });
    }

}