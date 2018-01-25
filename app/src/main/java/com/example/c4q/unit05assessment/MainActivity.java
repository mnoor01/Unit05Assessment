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
    private List<People> peopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peopleList= new ArrayList<>();
        retroFitStuff();

    }
    public void retroFitStuff(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final PeopleService peopleService=retrofit.create(PeopleService.class);
        Call<List<People>> info=peopleService.getModel(20);
        info.enqueue(new Callback<List<People>>() {
            @Override
            public void onResponse(Call<List<People>> call, Response<List<People>> response) {
                peopleList=response.body();
                Log.d("mainactivity",peopleList.get(0).getName());
            }

            @Override
            public void onFailure(Call<List<People>> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }


}
//this will be my first commit to the master branch
