package com.example.digitaltajbihapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    AppCompatButton Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


                    Start =findViewById(R.id.buttonStart);
                    Start.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent MainActivity2;
                            Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                           startActivity(intent);
                        }
                    });


    }
}