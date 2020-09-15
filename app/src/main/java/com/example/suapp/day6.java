package com.example.suapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class day6 extends AppCompatActivity {

    //20501 김동욱
    private Switch switch1;
    private CheckBox checkbox1, checkbox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day6);

        switch1 = findViewById(R.id.check);
        checkbox1 = findViewById(R.id.checkbox_1);
        checkbox2 = findViewById(R.id.checkbox_2);
    }

    public void onClickChecked(View view){
        switch (view.getId()){
            case R.id.check:
                if (switch1.isChecked()){
                    Toast.makeText(this, "알람이 설정되었습니다", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "알람이 울리지 않습니다", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.checkbox_1:
                if (checkbox1.isChecked()){
                    Toast.makeText(this, "알람을 반복합니다", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "반복설정이 해제되었습니다", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.checkbox_2:
                if (checkbox2.isChecked()){
                    Toast.makeText(this, "진동을 설정합니다", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "진동이 해제되었습니다", Toast.LENGTH_SHORT).show();

                }
                break;

        }
    }
}
