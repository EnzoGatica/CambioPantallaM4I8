package com.example.cambiopantallam4i8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initListener();
    }

    private void initListener(){

        Button btnSitio = findViewById(R.id.btnSitio);
        Button btnVolver = findViewById(R.id.btnVolver);

        btnSitio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sitioweb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(sitioweb);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent activity = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(activity);
            }
        });



    }
}