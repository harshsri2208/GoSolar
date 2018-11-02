package com.example.lenovo.solarssave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Result extends AppCompatActivity {

    TextView ans1,ans2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ans1=(TextView)findViewById(R.id.ans1);
        ans2=(TextView)findViewById(R.id.ans2);

        s1=getIntent().getExtras().getString("val1");
        s2=getIntent().getExtras().getString("val2");

        ans1.setText(s1);
        ans2.setText(s2);

    }
}
