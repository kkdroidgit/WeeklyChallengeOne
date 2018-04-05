package com.slack.weeklychallengeone.Utils;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.slack.weeklychallengeone.R;

import java.util.ArrayList;

import static com.slack.weeklychallengeone.R.color.cardview_shadow_end_color;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    private ArrayList<Model> mArrayList;
    public Context mContext;
    public LayoutInflater mLayoutInflater;




    public MyAdapter(ArrayList<Model> mArrayList,Context context) {
        this.mArrayList = mArrayList;
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        holder.currentItem=mArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }



        class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;

            public Model currentItem;
        MyViewHolder(final View view) {
            super(view);

            tv_name = view.findViewById(R.id.tv_name);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/results?search_query="+currentItem.getName()));
                    mContext.startActivity(intent);


                }
            });

        }
    }



}
