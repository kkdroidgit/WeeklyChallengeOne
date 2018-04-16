package com.slack.weeklychallengeone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.slack.weeklychallengeone.Utils.Model;
import com.slack.weeklychallengeone.Utils.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> mArrayList;
    private MyAdapter mAdapter;
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        loadData();

    }


    private void initViews(){
        mRecyclerView = findViewById(R.id.recyler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }




    private void loadData(){

        mArrayList = new ArrayList<>();

        mArrayList.add(new Model( getString(R.string.constraintlayout), getString(R.string.constraintlayout_desc)));
        mArrayList.add(new Model(getString(R.string.linearlayout), getString(R.string.linearlayout_desc)));
        mArrayList.add(new Model(getString(R.string.relativelayout), getString(R.string.relativelayout_desc)));
        mArrayList.add(new Model(getString(R.string.cardview), getString(R.string.cardview_desc)));
        mArrayList.add(new Model(getString(R.string.scrollview), getString(R.string.scrollview_desc)));
        mArrayList.add(new Model(getString(R.string.gridview), getString(R.string.gridview_desc)));



        mAdapter = new MyAdapter(mArrayList);
        mRecyclerView.setAdapter(mAdapter);

    }



}
