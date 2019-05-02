package com.example.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mIntButton;
    private Button mStrButton;
    String[] mStrings = {"ok", "ok", "1", "something", "hello", "java", "hello"};
    Integer[] mIntegers = {1, 2, 5, 2, 4, 5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mIntButton.setOnClickListener(this);
        mStrButton.setOnClickListener(this);
    }

    private <T> void findDuplicateFromArray(T[] array){
        ArrayList<T> result = new ArrayList<>();
        HashSet<T> set = new HashSet<>();
        for(T element : array){
            if( !set.add(element)){
                result.add(element);
            }
        }
        Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
    }

    private void init(){
        mIntButton = findViewById(R.id.intButton);
        mStrButton = findViewById(R.id.strButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.intButton:{
                findDuplicateFromArray(mIntegers);
            }
            break;
            case R.id.strButton:{
                findDuplicateFromArray(mStrings);
            }
            break;
        }
    }
}
