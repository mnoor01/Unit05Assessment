package com.example.c4q.unit05assessment.recyclerviewStuff;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.unit05assessment.R;
import com.example.c4q.unit05assessment.model.People;
import com.example.c4q.unit05assessment.model.Results;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 1/24/18.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder>{
    private List<Results> resultsList=new ArrayList<>();

    public PeopleAdapter(List<Results> resultsList) {
        this.resultsList = resultsList;
    }

    @Override
    public PeopleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView= LayoutInflater.from(parent.getContext()).inflate(R.layout.people_itemview, parent, false);
        return new PeopleViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(PeopleViewHolder holder, int position) {
        holder.onBind(resultsList.get(position));

    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }
}
