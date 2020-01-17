package com.example.apk_staff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button add, vieww ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(Button)findViewById(R.id.btnadd);
        vieww=(Button)findViewById(R.id.btnvw);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goinput=new Intent(MainActivity.this,InputData.class);
                startActivity(goinput);
            }
        } );


        vieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotampil=new Intent(MainActivity.this,TampilData.class);
                startActivity(gotampil);
            }
        } );



    }
}
