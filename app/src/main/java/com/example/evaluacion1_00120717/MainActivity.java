package com.example.evaluacion1_00120717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    View v1,v2,v3,v4,v5,v6,v7,v8,v9;
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9;
    Button btn_send;
    EditText user,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.vw1);
        v2 = findViewById(R.id.vw2);
        v3 = findViewById(R.id.vw3);
        v4 = findViewById(R.id.vw4);
        v5 = findViewById(R.id.vw5);
        v6 = findViewById(R.id.vw6);
        v7 = findViewById(R.id.vw7);
        v8 = findViewById(R.id.vw8);
        v9 = findViewById(R.id.vw9);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);
        v4.setOnClickListener(this);
        v5.setOnClickListener(this);
        v6.setOnClickListener(this);
        v7.setOnClickListener(this);
        v8.setOnClickListener(this);
        v9.setOnClickListener(this);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);

        user = findViewById(R.id.user);
        email = findViewById(R.id.email);
        btn_send = findViewById(R.id.send);
    }

    @Override
    public void onClick(View v) {

        Intent mIntent = new Intent(MainActivity.this,ShareActivity.class);


        switch (v.getId()){
            case R.id.vw1:
                p1.setText(Integer.toString(Integer.parseInt(p1.getText().toString())+1));
                break;
            case R.id.vw2:
                p2.setText(Integer.toString(Integer.parseInt(p2.getText().toString())+1));
                break;
            case R.id.vw3:
                p3.setText(Integer.toString(Integer.parseInt(p3.getText().toString())+1));
                break;
            case R.id.vw4:
                p4.setText(Integer.toString(Integer.parseInt(p4.getText().toString())+1));
            case R.id.vw5:
                p5.setText(Integer.toString(Integer.parseInt(p5.getText().toString())+1));
                break;
            case R.id.vw6:
                p6.setText(Integer.toString(Integer.parseInt(p6.getText().toString())+1));
                break;
            case R.id.vw7:
                p7.setText(Integer.toString(Integer.parseInt(p7.getText().toString())+1));
                break;
            case R.id.vw8:
                p8.setText(Integer.toString(Integer.parseInt(p8.getText().toString())+1));
                break;
            case R.id.vw9:
                p9.setText(Integer.toString(Integer.parseInt(p9.getText().toString())+1));
                break;
            case R.id.send:
                mIntent.putExtra("key",user.getText());
        }


    }
}
