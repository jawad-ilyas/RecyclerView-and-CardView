package com.example.recyclerviewandcardview;

import android.app.Person;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdaptor extends RecyclerView.Adapter<PersonAdaptor.ViewHolder> {



    ArrayList<Person> person;

    public  PersonAdaptor(Context context , ArrayList<Person> list)
    {
        person = list;
    }

        public class ViewHolder  extends  RecyclerView.ViewHolder{
            ImageView ivPref;
            TextView tvDesc , tvName;
        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            ivPref =   itemView.findViewById(R.id.ivPref);
            tvName =   itemView.findViewById(R.id.tvName);
            tvDesc =   itemView.findViewById(R.id.tvDesc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.list_item , parent , false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(person.get(position));

        holder.tvName.setText(person.get(position).getName());
        holder.tvDesc.setText("getDescription : "+person.get(position).getDescription());

        if(person.get(position).getPreference().equals("bus"))
        {
            holder.ivPref.setImageResource(R.drawable.bus);
        }
        else if(person.get(position).getPreference().equals("car"))
        {
            holder.ivPref.setImageResource(R.drawable.car);
        }
    }



    @Override
    public int getItemCount() {
        return person.size();
    }
}
