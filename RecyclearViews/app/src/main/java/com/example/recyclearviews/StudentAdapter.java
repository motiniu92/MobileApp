package com.example.recyclearviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_user_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student= studentList.get(position);

        holder.nameTv.setText(student.getName());
        holder.idTv.setText(String.valueOf(student.getId()));
        holder.emailTv.setText(student.getEmail());
        holder.phoneTv.setText(student.getPhoneNO());
        holder.profileIV.setImageResource(student.getProfileImage());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView profileIV;
        private TextView nameTv, emailTv, idTv, phoneTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTv = itemView.findViewById(R.id.nameTV);
            emailTv = itemView.findViewById(R.id.emailTV);
            idTv = itemView.findViewById(R.id.idTV);
            phoneTv = itemView.findViewById(R.id.phoneNoTV);
            profileIV = itemView.findViewById(R.id.profileIV);
        }
    }
}
