package com.example.cisc.muenchaua3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button googleButton;
    private Button mesaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        googleButton = (Button) findViewById(R.id.googleButton);
        googleButton.setOnClickListener(this);
        mesaButton = (Button) findViewById(R.id.mesaButton);
        mesaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.googleButton:
                Intent g;
                g = new Intent(this, googleActivity.class);
                startActivity(g);
                break;
            case R.id.mesaButton:
                Intent m;
                m = new Intent(this, mesaActivity.class);
                startActivity(m);
                break;
        }
    }

    /*private final View.OnClickListener googleButtonListener =
            new View.OnClickListener() {
                public void onClick(View v) {
                    Intent g;
                    g = new Intent(this, googleActivity.class);
                    startActivity(g);
                }
            };

    private final View.OnClickListener mesaButtonListener =
            new View.OnClickListener() {
                public void onClick(View v) {
                    //??
                }
            };*/

}
