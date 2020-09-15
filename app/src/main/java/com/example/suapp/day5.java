package com.example.suapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class day5 extends AppCompatActivity {

    private Button btn1, btn2;
    private ImageView img_fir, img_sec, img_thr, img_for;
    private int imageIndex =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
        img_fir = findViewById(R.id.image_01);
        img_sec = findViewById(R.id.image_02);
        img_thr = findViewById(R.id.image_03);
        img_for = findViewById(R.id.image_04);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageIndex--;
                switch (imageIndex){
                    case 1:
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.VISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        img_fir.setVisibility(View.INVISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.VISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        img_fir.setVisibility(View.INVISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.VISIBLE);
                        img_for.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    default:
                        imageIndex =4;
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                }



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageIndex++;
                switch (imageIndex){
                    case 1:
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.VISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        img_fir.setVisibility(View.INVISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.VISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        img_fir.setVisibility(View.INVISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.VISIBLE);
                        img_for.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.INVISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                    default:
                        imageIndex =1;
                        img_fir.setVisibility(View.VISIBLE);
                        img_sec.setVisibility(View.VISIBLE);
                        img_thr.setVisibility(View.INVISIBLE);
                        img_for.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });

    }
}
