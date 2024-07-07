package com.example.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.navigationdemo.databinding.FragmentSecondBinding;

public class MainActivity extends AppCompatActivity implements secondFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnFragmentInteraction(Uri uri) {

    }
}