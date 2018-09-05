package com.espinosa.shstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spinner extends AppCompatActivity {
    private String[] students = {
            "ABM",
            "BSIT",
            "BSCoe",
            "BSTM",
            "MSIT",
            "MSCS"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shs__student__reg);

        getSupportActionBar().setTitle("ABM");
    }
}
