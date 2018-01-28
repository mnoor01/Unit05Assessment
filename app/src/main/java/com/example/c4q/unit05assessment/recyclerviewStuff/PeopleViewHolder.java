package com.example.c4q.unit05assessment.recyclerviewStuff;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.unit05assessment.R;
import com.example.c4q.unit05assessment.SecondActivity;
import com.example.c4q.unit05assessment.model.People;
import com.example.c4q.unit05assessment.model.Results;
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
    public void onBind(final Results results){
        name.setText(results.getName().getFirst()+" "+ results.getName().getLast());
        location.setText(results.getLocation().getCity()+" "+results.getLocation().getState());
        email.setText(results.getEmail());
        dob.setText(results.getDob());
        Picasso.with(context).load(results.getPicture().getLarge()).into(pic);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(itemView.getContext(),SecondActivity.class);
                intent.putExtra("location",location.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("dob",dob.getText().toString());
                context.startActivity(intent);

            }
        });
    }
}
