package com.example.c4q.unit05assessment;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.c4q.unit05assessment.model.People;
import com.example.c4q.unit05assessment.recyclerviewStuff.PeopleAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private People peopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peopleList=new People();
        retroFitStuff();

    }
    public void retroFitStuff(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final PeopleService peopleService=retrofit.create(PeopleService.class);
        Call<People> infos=peopleService.getModel();
        infos.enqueue(new Callback<People>() {
            @Override
            public void onResponse(Call<People> call, Response<People> response) {
                peopleList=response.body();
                Log.d("mainactivity",peopleList.getResults().get(0).getName());


            }

            @Override
            public void onFailure(Call<People> call, Throwable t) {

            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recyclerView();
            }
        },5000);

    }
    public void recyclerView(){
        RecyclerView recyclerView=findViewById(R.id.peoplerecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        PeopleAdapter adapter= new PeopleAdapter(peopleList.getResults());
        recyclerView.setAdapter(adapter);
    }


}
//this will be my first commit to the master branch
