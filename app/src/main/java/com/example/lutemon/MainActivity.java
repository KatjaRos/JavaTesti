package com.example.lutemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listLutemons = findViewById(R.id.listLutemonsMain);
        Button createLutemon = findViewById(R.id.addNewLutemon);
        Button trainLutemon = findViewById(R.id.trainLutemon);
        Button fightLutemons = findViewById(R.id.fightLutemon);

        listLutemons.setOnClickListener(listener);
        createLutemon.setOnClickListener(listener);
        trainLutemon.setOnClickListener(listener);
        fightLutemons.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = null;

            switch(view.getId()){
                case R.id.listLutemonsMain:
                    fragment = new ListLutemons();
                    break;
                case R.id.addNewLutemon:
                    fragment = new chooseNewLutemon();
                    break;
                case R.id.trainLutemon:
                    fragment = new trainLutemon();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();



        }
    };
}