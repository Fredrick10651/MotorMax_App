package com.moringaschool.motormax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mDiscoverMotorButton;
//    private TextView mLocationTextView;

    @BindView(R.id.discoverMotorButton) Button mDiscoverMotorButton;
    @BindView(R.id.appNameTextView) TextView mLocationTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mDiscoverMotorButton =(Button)findViewById(R.id.discoverMotorButton);
        mDiscoverMotorButton.setOnClickListener(this);
//        mDiscoverMotorButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MotorMaxActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        if (view == mDiscoverMotorButton) {
            Intent intent = new Intent(MainActivity.this, MotorMaxActivity.class);
            startActivity(intent);
        }

    }
}