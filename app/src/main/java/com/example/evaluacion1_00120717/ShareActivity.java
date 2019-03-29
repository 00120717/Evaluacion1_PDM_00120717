package com.example.evaluacion1_00120717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion1_00120717.Utils.AppConstants;

public class ShareActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,user,email,totalProd;
    private Button btn_share;
    private int p1,p2,p3,p4,p5,p6,p7,p8,p9,total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        user = findViewById(R.id.user_s);
        email = findViewById(R.id.email_s);
        totalProd = findViewById(R.id.total_prod);

        tv1 = findViewById(R.id.ps1);
        tv2 = findViewById(R.id.ps2);
        tv3 = findViewById(R.id.ps3);
        tv4 = findViewById(R.id.ps4);
        tv5 = findViewById(R.id.ps5);
        tv6 = findViewById(R.id.ps6);
        tv7 = findViewById(R.id.ps7);
        tv8 = findViewById(R.id.ps8);
        tv9 = findViewById(R.id.ps9);

        p1 = Integer.parseInt(tv1.getText().toString());
        p2 = Integer.parseInt(tv2.getText().toString());
        p3 = Integer.parseInt(tv3.getText().toString());
        p4 = Integer.parseInt(tv4.getText().toString());
        p5 = Integer.parseInt(tv5.getText().toString());
        p6 = Integer.parseInt(tv6.getText().toString());
        p7 = Integer.parseInt(tv7.getText().toString());
        p8 = Integer.parseInt(tv8.getText().toString());
        p9 = Integer.parseInt(tv9.getText().toString());
        total = p1+p2+p3+p4+p5+p6+p7+p8+p9;

        btn_share = findViewById(R.id.btn_share);



        Intent mIntent = getIntent();

        if(mIntent!=null){
            user.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_1));
            email.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_2));


            tv1.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_3));
            tv2.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_4));
            tv3.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_5));
            tv4.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_6));
            tv5.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_7));
            tv6.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_8));
            tv7.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_9));
            tv8.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_10));
            tv9.setText(mIntent.getStringExtra(AppConstants.TEXTKEY_11));

            totalProd.setText(Integer.toString(total));
        }

        String JsonData  = "{ Usuario: " + user.getText().toString() + ", Correo: " + email.getText().toString() + ", Producto 1: " + tv1.getText().toString() + ", Producto 2: " + tv2.getText().toString() +
                ", Producto 3: " + tv3.getText().toString() + ", Producto 4: " + tv4.getText().toString() + ", Producto 5: " + tv5.getText().toString() + ", Producto 6: " + tv6.getText().toString() +
                ", Producto 7: " + tv7.getText().toString() + ", Producto 8: " + tv8.getText().toString() + ", Producto 9: " + tv9.getText().toString() + ", Total productos: "+ totalProd.getText().toString() +"}";

        btn_share.setOnClickListener(v->{
            Intent mIntent2 = new Intent();
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.setType("text/plain");
            mIntent2.putExtra(Intent.EXTRA_TEXT,JsonData);
            startActivity(mIntent2);
        });
    }
}
