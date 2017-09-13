package com.example.admin.week3mondayhw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 9/12/2017.
 */

public class CustomVHListAdapter extends ArrayAdapter<Animal> {

    private static final String TAG = "CustomTAG";

    public CustomVHListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Animal> animalList) {
        super(context, resource, animalList);
    }

    public class ViewHolder {


        private TextView tvAnimalName;
        private TextView tvAnimalType;
        private TextView tvAnimalAge;
        private TextView tvAnimalWeight;
        private ImageView imageDisplay;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view = convertView;
/*
        //inflate the view if is null
        if(view==null)
            view = LayoutInflater.
                    from(parent.getContext()).
                    inflate(R.layout.custom_listview_item,null);

        //bind
        ViewHolder holder = new ViewHolder();
        holder.tvAnimalName = view.findViewById(R.id.tvName);
        holder.tvAnimalType = view.findViewById(R.id.tvType);
        holder.tvAnimalAge = view.findViewById(R.id.tvAge);
        holder.tvAnimalWeight = view.findViewById(R.id.tvWeight);
*/
        Animal animal = getItem(position);
        if(animal != null){
            Log.d(TAG, "getView: "+ animal.Name.toString() + " " + animal.getWeight());
            if(animal.getWeight()>200 ) {
                view = LayoutInflater.
                        from(parent.getContext()).
                        inflate(R.layout.custom_listview_item, null);
                Log.d(TAG, "Listview: "+1);
            }
            else if(animal.getWeight()>100 ) {
                view = LayoutInflater.
                        from(parent.getContext()).
                        inflate(R.layout.custom_listview_item2, null);
                Log.d(TAG, "Listview: "+2);
            }
            else if(animal.getWeight()<100 ) {
                view = LayoutInflater.
                        from(parent.getContext()).
                        inflate(R.layout.custom_listview_item3, null);
                Log.d(TAG, "Listview: "+2);
            }
            //bind
            ViewHolder holder = new ViewHolder();
            holder.tvAnimalName = view.findViewById(R.id.tvName);
            holder.tvAnimalType = view.findViewById(R.id.tvType);
            holder.tvAnimalAge = view.findViewById(R.id.tvAge);
            holder.tvAnimalWeight = view.findViewById(R.id.tvWeight);
            holder.imageDisplay = view.findViewById(R.id.imageDisplay);

            holder.tvAnimalName.setText(animal.getName());
            holder.tvAnimalType.setText(animal.getType());
            holder.tvAnimalAge.setText(String.valueOf(animal.getAge()));
            holder.tvAnimalWeight.setText(String.valueOf(animal.getWeight()));

       //     Drawable res = getContext().getResources().getDrawable(animal.getImageId());
            //mageView.setImageDrawable(res);
            holder.imageDisplay.setImageResource(animal.getImageId());
            holder.imageDisplay.setMaxHeight(100);
            view.setTag(holder);
        }
        return view;
    }
}


