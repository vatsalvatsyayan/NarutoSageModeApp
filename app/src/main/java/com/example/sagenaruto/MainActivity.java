package com.example.sagenaruto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView naruto = (ImageView) findViewById(R.id.naruto);
        ImageView narutoSage = (ImageView) findViewById(R.id.sage);
        narutoSage.setAlpha(0f);
        naruto.animate().alpha(0f).setDuration(2000);

        narutoSage.animate().alpha(1f).setDuration(2000);


    }

    public void fadeSage(View view){
        ImageView naruto = (ImageView) findViewById(R.id.naruto);
        ImageView narutoSage = (ImageView) findViewById(R.id.sage);

        narutoSage.animate().alpha(0f).setDuration(2000);

        naruto.animate().alpha(1f).setDuration(2000);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}