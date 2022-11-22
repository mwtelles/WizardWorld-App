package com.mwtelles.hogwartshouses.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mwtelles.hogwartshouses.R;
import com.mwtelles.hogwartshouses.controller.StudentsActivity;
import com.mwtelles.hogwartshouses.controller.adapters.StudentsAdapter;
import com.mwtelles.hogwartshouses.databinding.FragmentDashboardBinding;
import com.mwtelles.hogwartshouses.databinding.FragmentHomeBinding;
import com.mwtelles.hogwartshouses.model.dao.StudentsDao;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StudentsDao studentsDao = new StudentsDao();

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ListView listView = (ListView) root.findViewById(R.id.studentsListView);
        listView.setAdapter(new StudentsAdapter(studentsDao.getStudentsList()));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity().getApplicationContext(), StudentsActivity.class);

                intent.putExtra("student_id", studentsDao.getStudentsList().get(i).getId());
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}