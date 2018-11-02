package com.example.lenovo.solarssave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name1,quantity1,use1,rating1;
    EditText name2,quantity2,use2,rating2;
    EditText name3,quantity3,use3,rating3;
    Button submit;

    String s1,s2,s3;
    double d1,d2,d3,p;
    int x,y;
    String ans1,ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1=(EditText)findViewById(R.id.name1);
        quantity1=(EditText)findViewById(R.id.quantity1);
        use1=(EditText)findViewById(R.id.use1);
        rating1=(EditText)findViewById(R.id.rating1);

        name2=(EditText)findViewById(R.id.name2);
        quantity2=(EditText)findViewById(R.id.quantity2);
        use2=(EditText)findViewById(R.id.use2);
        rating2=(EditText)findViewById(R.id.rating2);

        name3=(EditText)findViewById(R.id.name3);
        quantity3=(EditText)findViewById(R.id.quantity3);
        use3=(EditText)findViewById(R.id.use3);
        rating3=(EditText)findViewById(R.id.rating3);

        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,Result.class);
                s1=quantity1.getText().toString();
                s2=use1.getText().toString();
                s3=rating1.getText().toString();

                d1=Double.parseDouble(s1);
                d2=Double.parseDouble(s2);
                d3=Double.parseDouble(s3);

                p+=(d1*d2*d3);

                s1=quantity2.getText().toString();
                s2=use2.getText().toString();
                s3=rating2.getText().toString();

                d1=Double.parseDouble(s1);
                d2=Double.parseDouble(s2);
                d3=Double.parseDouble(s3);

                p+=(d1*d2*d3);

                s1=quantity3.getText().toString();
                s2=use3.getText().toString();
                s3=rating3.getText().toString();

                d1=Double.parseDouble(s1);
                d2=Double.parseDouble(s2);
                d3=Double.parseDouble(s3);

                p+=(d1*d2*d3);

                x=(int)p*365/1000;

                y=50000*x;

                ans1=Integer.toString(x);
                ans2=Double.toString(y);

                i.putExtra("val1",ans1);
                i.putExtra("val2",ans2);

                startActivity(i);
                finish();

            }
        });

    }
}
