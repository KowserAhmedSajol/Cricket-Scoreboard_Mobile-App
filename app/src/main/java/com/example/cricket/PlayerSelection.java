package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerSelection extends AppCompatActivity {
    Button button,btn;
    EditText openingStriker,openingNonStriker,opwningBowler;
    String hname,vname,over,toss,opted;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_selection);
        button= findViewById(R.id.button);
        openingStriker= findViewById(R.id.openingStriker);
        openingNonStriker= findViewById(R.id.openingNonStriker);
        opwningBowler= findViewById(R.id.opwningBowler);
        button= findViewById(R.id.button);
        txt= findViewById(R.id.txt);

        Bundle bundle= getIntent().getExtras();

        if(bundle!=null){
            hname = bundle.getString("hname");
            vname = bundle.getString("vname");
            over = bundle.getString("over");
            toss = bundle.getString("toss");
            opted = bundle.getString("opted");
        }
        Toast.makeText(this, ""+toss+" has won the toss and elected to "+opted+" First "+over+" over", Toast.LENGTH_SHORT).show();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerSelection.this, ScorePage.class);
                intent.putExtra("hname", hname );
                intent.putExtra("vname", vname );
                intent.putExtra("over", over );
                intent.putExtra("toss", toss);
                intent.putExtra("opted", opted);
                intent.putExtra("openingStriker", openingStriker.getText().toString());
                intent.putExtra("openingNonStriker", openingNonStriker.getText().toString());
                intent.putExtra("openingBowler", opwningBowler.getText().toString());
                startActivity(intent);
            }
        });



    }
}