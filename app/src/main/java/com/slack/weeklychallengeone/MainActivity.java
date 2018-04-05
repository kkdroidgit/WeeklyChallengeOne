package com.slack.weeklychallengeone;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;
import com.slack.weeklychallengeone.Utils.Model;
import com.slack.weeklychallengeone.Utils.MyAdapter;
import com.slack.weeklychallengeone.Utils.VerticalViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> mArrayList;
    private MyAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        loadData();
        ShimmerTextView shimmerTextView = findViewById(R.id.tv_name);
        Shimmer shimmer = new Shimmer();
        shimmer.start(shimmerTextView);

    }


    private void initViews(){
        mRecyclerView = findViewById(R.id.recyler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }






  private void loadData(){

        mArrayList = new ArrayList<>();


        mArrayList.add(new Model("Constraint Layout"));
        mArrayList.add(new Model("Linear Layout"));
        mArrayList.add(new Model("Relative Layout"));
        mArrayList.add(new Model("Card View"));
        mArrayList.add(new Model("Scroll Views"));
        mArrayList.add(new Model("Grid View"));



        mAdapter = new MyAdapter(mArrayList,this);
        mRecyclerView.setAdapter(mAdapter);

    }



}
