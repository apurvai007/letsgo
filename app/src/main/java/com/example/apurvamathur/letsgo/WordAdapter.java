package com.example.apurvamathur.letsgo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<description> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of ArrayAdapter objects to display in a list
     */

    public WordAdapter(Activity context, ArrayList<description> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0 , (ArrayList<description>) words);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        description currentword = getItem(position);

        //to set miwok translation

        TextView miwok = (TextView)listItemView.findViewById(R.id.miwok);
        miwok.setText(currentword.getmNameOfPlace());
        //to set english translation

        TextView english = (TextView)listItemView.findViewById(R.id.english);
        english.setText(currentword.getmDescription());

        //to set image
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image1);
        imageView.setImageResource(currentword.getmImage());



        return listItemView;

    }
}


