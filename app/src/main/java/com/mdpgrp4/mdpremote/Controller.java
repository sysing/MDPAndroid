package com.mdpgrp4.mdpremote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class Controller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
        Button strafeLeft = (Button) findViewById(R.id.ctrStrafeLeft);

        strafeLeft.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        Button strafeLeft = (Button) findViewById(R.id.ctrStrafeLeft);
                        strafeLeft.setText("Hi");
                    }
                }
        );
        /**
        reverse = (Button) findViewById(R.id.reverse);
        left = (Button) findViewById(R.id.left);
        right = (Button) findViewById(R.id.right);
        path = (Button) findViewById(R.id.path);
        explore = (Button) findViewById(R.id.explore);
        path = (Button) findViewById(R.id.path);
        strafeLeft = (Button) findViewById(R.id.strafeLeft);
        strafeRight = (Button) findViewById(R.id.strafeRight);
        **/
    }
}
