package com.moringaschool.motormax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mDiscoverMotorButton;
    private EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mDiscoverMotorButton =(Button)findViewById(R.id.discoverMotorButton);

        mDiscoverMotorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = mLocationEditText.getText() .toString();
                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, MotorMaxActivity.class);
                startActivity(intent);
            }
        });
    }
}