package com.mwtelles.hogwartshouses.controller.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mwtelles.hogwartshouses.R;
import com.mwtelles.hogwartshouses.model.entity.Students;

import java.util.List;

public class StudentsAdapter extends BaseAdapter {

    private List<Students> studentsList;

    public StudentsAdapter(List<Students> spellsList) {
        this.studentsList = spellsList;
    }

    @Override
    public int getCount() {
        return this.studentsList.size();
    }
    @Override
    public Object getItem(int position) {
        return this.studentsList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return this.studentsList.get(position).getId();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.students_item, parent, false);
        }

        Students students = (Students) getItem(position);
        TextView textViewName = convertView.findViewById(R.id.studentName);
        TextView textViewEffect = convertView.findViewById(R.id.studentHouse);

        textViewName.setText(students.getName());
        textViewEffect.setText(students.getHouse());

        return convertView;
    }
}
