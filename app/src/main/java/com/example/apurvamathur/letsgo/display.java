package com.example.apurvamathur.letsgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.Collections;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        description bali = new description(getString(R.string.bali),getString(R.string.baliD),R.mipmap.bali);
        description shirdi = new description(getString(R.string.shridi),getString(R.string.shridiD),R.mipmap.shiridi);
        description golden = new description(getString(R.string.goldenTemple),getString(R.string.goldenTempleD),R.mipmap.golden);
        description  goa= new description(getString(R.string.goa),getString(R.string.goaD),R.mipmap.goa);
        description  manali= new description(getString(R.string.manali),getString(R.string.manaliD),R.mipmap.manali);
        description  kedarnath= new description(getString(R.string.kedarnath),getString(R.string.kedarnathD),R.mipmap.kedarnath);
        description  shimla= new description(getString(R.string.shimla),getString(R.string.shimlaD),R.mipmap.shimla);
        description  switzerland= new description(getString(R.string.switzerland),getString(R.string.switzerlandD),R.mipmap.switzerland);
        description  chennai= new description(getString(R.string.chennai),getString(R.string.chennaiD),R.mipmap.chennai);
        description  darjeeling= new description(getString(R.string.darjeeling),getString(R.string.darjeelingD),R.mipmap.darjeeling);
        description  ganktonk= new description(getString(R.string.ganktonk),getString(R.string.ganktonkD),R.mipmap.ganktonk);


        //bundle of boolean array
        Bundle b = this.getIntent().getExtras();
        boolean[] array=b.getBooleanArray("radioButtons");

        if(array[0]==true){
            bali.update();
            chennai.update();
        }
        if (array[17]==true){
            bali.update();
        }

        ArrayList<description> words = new ArrayList<description>();

        words.add(bali);
        words.add(golden);
        words.add(shirdi);
        words.add(shimla);
        words.add(goa);
        words.add(kedarnath);
        words.add(manali);
        words.add(switzerland);
        words.add(darjeeling);
        words.add(chennai);
        words.add(ganktonk);


        Collections.sort(words);

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
