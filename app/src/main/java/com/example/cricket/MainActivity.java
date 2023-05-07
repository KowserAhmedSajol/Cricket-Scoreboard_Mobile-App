package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText hostteamname,visitorteamname,over;
    RadioGroup radioGrp1,radioGrp2;
    RadioButton htoss,vtoss,bat,bowl,radioBtn1,radioBtn2;
    Button startbtn;
    String reslt="",opted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hostteamname = findViewById(R.id.hostteamname);
        visitorteamname = findViewById(R.id.visitorteamname);
        over = findViewById(R.id.over);
        htoss = findViewById(R.id.htoss);
        vtoss = findViewById(R.id.vtoss);
        bat = findViewById(R.id.bat);
        bowl = findViewById(R.id.bowl);
        startbtn = findViewById(R.id.startbtn);
        radioGrp1 = findViewById(R.id.radioGrp1);
        radioGrp2 = findViewById(R.id.radioGrp2);


        final Handler fteam= new Handler();
        final Handler vteam= new Handler();
        fteam.postDelayed(new Runnable() {
            @Override
            public void run() {
                htoss.setText(hostteamname.getText().toString());
                fteam.postDelayed(this,100);
            }
        },100);
        vteam.postDelayed(new Runnable() {
            @Override
            public void run() {
                vtoss.setText(visitorteamname.getText().toString());
                vteam.postDelayed(this,100);
            }
        },100);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkToss();
                optedToss();
                Intent intent = new Intent(MainActivity.this, PlayerSelection.class);
                intent.putExtra("hname", hostteamname.getText().toString());
                intent.putExtra("vname", visitorteamname.getText().toString());
                intent.putExtra("over", over.getText().toString());
                intent.putExtra("toss", reslt);
                intent.putExtra("opted", opted);
                startActivity(intent);
            }
        });

    }
    void checkToss(){
        if(htoss.isChecked()){
        reslt=hostteamname.getText().toString();
        }else if(vtoss.isChecked()){
            reslt=visitorteamname.getText().toString();
        }
    }
    void optedToss(){
        if(bat.isChecked()){
            opted=bat.getText().toString();
        }else if(bowl.isChecked()){
            opted=bowl.getText().toString();
        }
    }


}