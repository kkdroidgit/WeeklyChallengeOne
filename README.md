<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:gravity="center"
    android:layout_centerHorizontal="true"


    tools:context="com.example.android.practice.MainActivity">

   
    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"
        android:text="@string/Constraint_Layout"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />
    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"
        android:text="@string/Linear_Layout"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />
    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"
        android:text="@string/Relative_Layout"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />
    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"
        android:text="@string/Card_View"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />
    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"
        android:text="@string/Scroll_View"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />

    <TextView

        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:textStyle="bold"
        android:textColor="#000000"

        android:text="@string/Grid_View"
        android:textSize="30sp"

        android:layout_marginTop="10dp"
        />

</LinearLayout>
  
  
  
  
  //for main.xml
  package com.example.android.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
