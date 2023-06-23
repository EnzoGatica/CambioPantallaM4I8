package com.example.cambiopantallam4i8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initListener();
    }

    private void initListener(){

        Button btnPrimera = findViewById(R.id.btnPrimera);

        btnPrimera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(activity2);

            }
        });

    }

}