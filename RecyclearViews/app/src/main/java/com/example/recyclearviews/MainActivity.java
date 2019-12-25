package com.example.recyclearviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Student> studentList;
    private RecyclerView recyclerView;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        recyclerView = findViewById(R.id.studentRecyclearViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(adapter);

        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));
        studentList.add(new Student("Mashrafe", 1, "manik@gmail.com", "0164588712", R.drawable.mashrafe));

        adapter.notifyDataSetChanged();

    }
}
