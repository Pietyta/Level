package com.tn.smartapp.level;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
int l1=0;
int s1=0;

    Button add ;
    TextView level,score ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button add =findViewById(R.id.adding);

         level =(TextView) findViewById(R.id.level);
         score =(TextView) findViewById(R.id.score);

    }


public void go (View x ){

s1++;

    if (s1 ==10) ;
    {
        s1=0;
                l1++;

    }

    level.setText(l1);
    score.setText(s1);

}


}
