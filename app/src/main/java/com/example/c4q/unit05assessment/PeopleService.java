package com.example.c4q.unit05assessment;

import com.example.c4q.unit05assessment.model.People;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c4q on 1/24/18.
 */

public interface PeopleService {
    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<People> getModel();


}
