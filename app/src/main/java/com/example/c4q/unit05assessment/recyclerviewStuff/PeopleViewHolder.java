package com.example.c4q.unit05assessment.recyclerviewStuff;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.unit05assessment.R;
import com.example.c4q.unit05assessment.model.People;
import com.squareup.picasso.Picasso;

/**
 * Created by c4q on 1/24/18.
 */

public class PeopleViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private TextView location;
    private TextView email;
    private TextView dob;
    private ImageView pic;
    private Context context;
    public PeopleViewHolder(View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        location=itemView.findViewById(R.id.location);
        email=itemView.findViewById(R.id.email);
        dob=itemView.findViewById(R.id.dob);
        pic=itemView.findViewById(R.id.pix);
        context= itemView.getContext();
    }
    public void onBind(People people){
        name.setText(people.getName());
        Picasso.with(context).load(people.getPicture()).into(pic);
    }
}
