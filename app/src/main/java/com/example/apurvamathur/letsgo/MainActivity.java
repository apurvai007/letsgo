package com.example.apurvamathur.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //click listner to open activity
        Button clickHere = (Button) findViewById(R.id.clickHere);
        clickHere.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Intent to open number activity
                Intent i = new Intent(view.getContext(), quiz.class);
                startActivity(i);

            }
        });
    }
}
