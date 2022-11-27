package com.mwtelles.hogwartshouses.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mwtelles.hogwartshouses.R;
import com.mwtelles.hogwartshouses.model.dao.StudentsDao;
import com.mwtelles.hogwartshouses.model.entity.Students;

public class StudentsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_content);

        Intent intent = getIntent();
        int student_id = (int) intent.getSerializableExtra("student_id");

        StudentsDao studentsDao = new StudentsDao();
        Students students = studentsDao.getStudentsById(student_id);

        TextView studentName = (TextView) findViewById(R.id.studentName);
        TextView studentHouse = (TextView) findViewById(R.id.studentHouse);
        TextView studentActor = (TextView) findViewById(R.id.studentActor);

        ImageView studentImage = (ImageView) findViewById(R.id.studentImage);

        studentName.setText(students.getName());
        studentHouse.setText(students.getHouse());
        studentActor.setText(students.getActor());

        Glide.with(this).load(students.getImage()).into(studentImage);
    }
}
