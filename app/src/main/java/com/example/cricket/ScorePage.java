package com.example.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ScorePage extends AppCompatActivity {
TextView totalScore,totalWicket,totalOver,totalBall,runRate,zero,one,two,three,four,five,six,fstline,inngsscore,reqruns,gover,fours,sixs,finfours,finsixs;
CheckBox wicketbtn,noballbtn,byesbtn,widebtn;
Button restartbtn;
LinearLayout boundaries;
int score=0,boll=0,over=0,wcket=0,chkover,target,inngsend=0,rball,finw,finr,trget,fourss=0,sixes=0;
float avg=0,bolll,avgscore,avgover;
String hname,vname,tover,openingStriker,openingNonStriker,opwningBowler,opted,toss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_page);
        totalScore= findViewById(R.id.totalScore);
        totalWicket= findViewById(R.id.totalWicket);
        totalOver= findViewById(R.id.totalOver);
        totalBall= findViewById(R.id.totalBall);
        runRate= findViewById(R.id.runRate);
        zero= findViewById(R.id.zero);
        one= findViewById(R.id.one);
        two= findViewById(R.id.two);
        three= findViewById(R.id.three);
        four= findViewById(R.id.four);
        five= findViewById(R.id.five);
        six= findViewById(R.id.six);
        fstline= findViewById(R.id.fstline);
        wicketbtn= findViewById(R.id.wicketbtn);
        noballbtn= findViewById(R.id.noballbtn);
        byesbtn= findViewById(R.id.byesbtn);
        widebtn= findViewById(R.id.widebtn);
        inngsscore= findViewById(R.id.inngsscore);
        reqruns= findViewById(R.id.reqruns);
        gover= findViewById(R.id.gover);
        restartbtn= findViewById(R.id.restartbtn);


        Bundle bundle= getIntent().getExtras();

        if(bundle!=null){
            hname = bundle.getString("hname");
            vname = bundle.getString("vname");
            tover = bundle.getString("over");
            toss = bundle.getString("toss");
            opted = bundle.getString("opted");
            openingStriker = bundle.getString("openingStriker");
            openingNonStriker = bundle.getString("openingNonStriker");
            opwningBowler = bundle.getString("openingBowler");
        }
        chkover=Integer.parseInt(tover);
        Toast.makeText(this, ""+toss+" has won the toss and elected to "+opted+" First "+tover+" over", Toast.LENGTH_SHORT).show();
        rball=Integer.parseInt(tover)*6;





        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score= score+0;
                wideCheck();
                noballCheck();
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-0;
                    }
                }
                inngsscndextra();

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+1;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-1;
                    }
                }
                inngsscndextra();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+2;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-2;
                    }
                }
                inngsscndextra();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+3;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-3;
                    }
                }
                inngsscndextra();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+4;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-4;
                    }
                }
                inngsscndextra();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+5;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-5;
                    }
                }
                inngsscndextra();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score= score+6;
                boll=boll+1;
                overCheck();
                totalScore.setText(""+score+" -");
                totalBall.setText(""+boll+")");
                avg();
                wicketCheck();
                endovercheck();
                if (inngsend==1){
                    if (over==0 && boll==00){
                        target=target;
                    }else{
                        target=target-6;
                    }
                }
                inngsscndextra();
            }
        });

        //------------------------------
        //------required runrate--------
        //------------------------------



    }




    //------------------------------
    //------------METHODS-----------
    //------------------------------
    public void avg(){
        avgscore= score;
        bolll=boll;
        if(over==0){
            avgover=bolll/10;
        }else{
            avgover= over;
        }
        avg=avgscore/avgover;
        runRate.setText("Current runrate : "+avg);
    }
    public void overCheck(){
        if (boll==6){
            over=over+1;
            totalOver.setText("("+over+".");
            boll=0;
        }
    }
    public void endovercheck(){
        if (over== chkover) {
            start2ndInngs();
        }
    }
    public void wideCheck(){
        if(widebtn.isChecked() && boll!=0){
            score=score+1;
            boll=boll-1;
            rball++;
        }else if (widebtn.isChecked() && boll==0){
            score=score+1;
            boll=boll-1;
            rball++;
        }
        widebtn.setChecked(false);
    }
    public void noballCheck(){
        if(noballbtn.isChecked() && boll!=0){
            score=score+1;
            boll=boll-1;
        }else if (noballbtn.isChecked() && boll==0){
            score=score+1;
            boll=boll-1;
        }
        noballbtn.setChecked(false);
    }
    public void wicketCheck(){
        if(wicketbtn.isChecked()){
            wcket++;
            totalWicket.setText(" "+wcket);
        }
        wicketbtn.setChecked(false);
        if (wcket==10){
            start2ndInngs();
        }
    }
    public void byesCheck(){
        if(wicketbtn.isChecked()){

        }
        byesbtn.setChecked(false);
    }
    public void start2ndInngs(){
        if (inngsend==0){
            inngsend=1;

            target=score+1;
            finw=wcket;
            finr=score;
            inngsscore.setText("1st innings score\n"+toss+" :- "+finr+"/"+finw+"");
            score=0;
            over=0;
            wcket=0;
            avg=0;
            boll=0;
            fstline.setText("2nd innings          Target ( "+target+" )");
            totalScore.setText(""+score+" -");
            totalBall.setText(""+boll+")");
            float a=target;
            float b=chkover;
            runRate.setText("Required runrate : "+a/b);
            totalOver.setText("("+over+".");
            totalWicket.setText(" "+wcket);
            totalBall.setText(""+boll+")");
            trget=target;
            reqruns.setText("Need "+target+" runs from "+rball+" balls");
        }
    }
    public void inngsscndextra(){
        if (inngsend==1){
            if (over==0 && boll==0){
                rball=rball;
            }else{
                rball--;
            }
            reqruns.setText("Need "+target+" runs from "+rball+" balls");
            if (rball==0 || wcket == 10 || score>=trget){
                int trgett=trget-1;

                gover.setText("Game Over"+trgett+"");
                if (finr==trgett){
                    gover.setText("Match Drawn\nGame Over");
                }
                restartbtn.setVisibility(View.VISIBLE);
                restartbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ScorePage.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

            }
        }
    }
}