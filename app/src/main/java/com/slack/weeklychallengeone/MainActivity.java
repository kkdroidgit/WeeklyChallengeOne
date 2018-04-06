package com.slack.weeklychallengeone.Utils;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.slack.weeklychallengeone.R;

import java.util.ArrayList;

import static android.view.FocusFinder.getInstance;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Model> mArrayList;


    public MyAdapter(ArrayList<Model> mArrayList) {
        this.mArrayList = mArrayList;
    }
    private View view;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mArrayList.get(position).getName());
        if(position %2 == 0) {
            holder.tv_name.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.list_color1));
        } else {
            holder.tv_name.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.list_color2));
        }

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        MyViewHolder(View view) {
            super(view);

            tv_name =  view.findViewById(R.id.tv_name);

        }
    }


}
