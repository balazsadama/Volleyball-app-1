package com.example.android.volleyball1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    // Buttons for the different rotations
    private Button rot1, rot2, rot3, rot4,  rot5, rot6;

    // ViewSwitcher to switch between the views
    private ViewSwitcher switcher;
    private static final int REFRESH_SCREEN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        switcher = (ViewSwitcher) findViewById(R.id.profileSwitcher);
        //startScan(); ???
        //switcher.getChildCount();


        // Set the rot1 button's onClick to change the ContentView to layout_rotation1
        rot1 = (Button) findViewById(R.id.rot1);
        rot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.layout_rotation1);
            }
        });


        // Set the rot2 button's onClick to change the ContentView to layout_rotation2
        rot2 = (Button) findViewById(R.id.rot2);
        rot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.layout_rotation2);
            }
        });


    }

    public void changeName(View view) {
        Button button = (Button) view;
        button.setText("something else");
    }

}
