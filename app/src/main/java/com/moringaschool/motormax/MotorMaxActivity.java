package com.moringaschool.motormax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MotorMaxActivity extends AppCompatActivity {
    private Button mSelectModeButton;
    private ListView mListView;
    private TextView mLocationTextView;
    private final String [] motorModel = new String[] {"Toyota", "Ferrari", "Honda", "Ford", "BMW", "Chevrolet", "Volskswagen", "Audi", "Mercedes-Benz", "Hyundai Motor Company", "Mazda", "Mitsubishi", "Lexus", "Jeep" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor_max);

        mSelectModeButton =(Button)findViewById(R.id.selectModelButton);
        mSelectModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MotorMaxActivity.this, "PASH UKO", Toast.LENGTH_LONG).show();
            }
        });

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, motorModel);
        mListView.setAdapter(adapter);

        Intent intent =getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Car Models: " + location);

    }
}