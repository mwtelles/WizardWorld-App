package com.mwtelles.hogwartshouses.model.dao;

import com.mwtelles.hogwartshouses.model.entity.Students;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class StudentsDao {

    private List<Students> studentsList;
    private String responseBody;

    public StudentsDao() {
        this.studentsList = new ArrayList<>();
        this.getFromApi();
        this.getStudentsList();
    }

    public void getFromApi() {
        Request.Builder builder = new Request.Builder();
        Request request = builder
                .url("https://hp-api.herokuapp.com/api/characters/students")
                .get()
                .build();
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        try {
            Response response = client.newCall(request).execute();
            assert response.body() != null;
            this.responseBody = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Students> getStudentsList() {
        try {
            JSONArray jsonArray = new JSONArray(responseBody);

            for(int i=0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = i;
                String name = jsonObject.getString("name");
                String house = jsonObject.getString("house");

                studentsList.add(new Students(id, name, house));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.studentsList;
    }

    public Students getStudentsById(int id) {
        for (Students students : this.studentsList) {
            if(students.getId() == id) {
                return students;
            }
        }
        return null;
    }

}
