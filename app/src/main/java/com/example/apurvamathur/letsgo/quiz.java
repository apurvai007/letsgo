package com.example.apurvamathur.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //click listner to open activity


        Button display = (Button) findViewById(R.id.display);
        display.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //sending data to other activity
                RadioButton budget1 = (RadioButton) findViewById(R.id.budget1);
                RadioButton budget2 = (RadioButton) findViewById(R.id.budget2);
                RadioButton budget3 = (RadioButton) findViewById(R.id.budget3);
                RadioButton budget4 = (RadioButton) findViewById(R.id.budget4);
                RadioButton distance1 = (RadioButton) findViewById(R.id.distance1);
                RadioButton distance2 = (RadioButton) findViewById(R.id.distance2);
                RadioButton distance3 = (RadioButton) findViewById(R.id.distance3);
                RadioButton howLong1 = (RadioButton) findViewById(R.id.howLong1);
                RadioButton howLong2 = (RadioButton) findViewById(R.id.howLong2);
                RadioButton howLong3 = (RadioButton) findViewById(R.id.howLong3);
                RadioButton partners1 = (RadioButton) findViewById(R.id.partners1);
                RadioButton partners2 = (RadioButton) findViewById(R.id.partners2);
                RadioButton partners3 = (RadioButton) findViewById(R.id.partners3);
                RadioButton Climate1 = (RadioButton) findViewById(R.id.Climate1);
                RadioButton Climate2 = (RadioButton) findViewById(R.id.Climate2);
                RadioButton Climate3 = (RadioButton) findViewById(R.id.Climate3);
                RadioButton TypeOfHoliday1 = (RadioButton) findViewById(R.id.TypeOfHoliday1);
                RadioButton TypeOfHoliday2 = (RadioButton) findViewById(R.id.TypeOfHoliday2);
                RadioButton TypeOfHoliday3 = (RadioButton) findViewById(R.id.TypeOfHoliday3);




                Intent i = new Intent(view.getContext(), display.class);
                Bundle b = new Bundle();
                b.putBooleanArray("radioButtons",new boolean[]{budget1.isChecked(),
                        budget2.isChecked(),budget3.isChecked(),budget4.isChecked(),
                        distance1.isChecked(), distance2.isChecked(),distance3.isChecked()
                        ,howLong1.isChecked(),howLong2.isChecked(),howLong3.isChecked()
                        ,partners1.isChecked(),partners2.isChecked(),partners3.isChecked()
                        ,Climate1.isChecked(),Climate2.isChecked(),Climate3.isChecked()
                        ,TypeOfHoliday1.isChecked(),TypeOfHoliday2.isChecked(),TypeOfHoliday3.isChecked()});
                i.putExtras(b);
                //Intent to open number activity

                startActivity(i);

            }
        });




        }

    }


