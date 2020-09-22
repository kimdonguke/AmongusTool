package com.example.suapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class day_6_2 extends AppCompatActivity {



    TextView tv1, tv2;
    Button bt1, bt2, bt3, bt4;
    CheckBox check1, check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_6_2);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        check1 = findViewById(R.id.check_1);
        check2 = findViewById(R.id.check_2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1.isChecked() && check2.isChecked()) {
                    tv1.setText("체크박스 1 체크됨");
                    tv2.setText("체크박스 2 체크됨");
                } else if (check1.isChecked() == true && check2.isChecked() == false) {
                    tv1.setText("체크박스 1 체크됨");
                    tv2.setText("");

                } else if (check1.isChecked() == false && check2.isChecked() == true) {
                    tv1.setText("");
                    tv2.setText("체크박스 2 체크됨");

                } else {
                    tv1.setText("");
                    tv2.setText("");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1.setChecked(true);
                check2.setChecked(true);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1.setChecked(false);
                check2.setChecked(false);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1.toggle();
                check2.toggle();
            }
        });
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if ( isChecked )
                {
                    Toast.makeText(day_6_2.this, "1번 체크 되었습니당 >,<", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(day_6_2.this, "1번 체크가 해제 되었습니다 ㅠ_ㅜ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(day_6_2.this, "2번 체크 되었습니당 >,<", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(day_6_2.this, "2번 체크가 해제 되었습니다 ㅠ_ㅜ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


