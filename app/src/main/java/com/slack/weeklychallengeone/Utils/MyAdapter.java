package com.slack.weeklychallengeone.Utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.slack.weeklychallengeone.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Model> mArrayList;


    public MyAdapter(ArrayList<Model> mArrayList) {
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mArrayList.get(position).getName());
        holder.tv_desc.setText(mArrayList.get(position).getDescription());
    }


    @Override
    public int getItemCount() {
        return mArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_desc;
        MyViewHolder(View view) {
            super(view);

            tv_name = view.findViewById(R.id.tv_name);
            tv_desc = view.findViewById(R.id.tv_desc);

        }
    }


}
