package com.example.recyclerview_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    final String[] data1;
    final String[] data2;
    final int[] images;
    final Context context;

    public MyAdapter(Context ct, String[] s1, String[] s2, int[] img) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.student_group_txt.setText(data1[position]);
        holder.description_txt.setText(data2[position]);
        holder.myImageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        final TextView student_group_txt;
        final TextView description_txt;
        final ImageView myImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            student_group_txt = itemView.findViewById(R.id.student_group_txt);
            description_txt = itemView.findViewById(R.id.description_txt);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }
}
