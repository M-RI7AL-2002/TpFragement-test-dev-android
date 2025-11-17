package com.example.fragement_test;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button messi;
    Button ronaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        messi=findViewById(R.id.fragement1);
        ronaldo= findViewById(R.id.fragement2);
        if(savedInstanceState==null){
            replaceFragment(new fragement_1(),false);
        }

        messi.setOnClickListener(v -> replaceFragment(new fragement_1(),true));
        ronaldo.setOnClickListener(v-> replaceFragment(new fragment_2(),true));


    }

    private void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragement, fragment);

        if (addToBackStack) {
            ft.addToBackStack(null); // permet de revenir en arrière avec le bouton back
        }

        ft.commit(); // exécute la transaction
    }
}