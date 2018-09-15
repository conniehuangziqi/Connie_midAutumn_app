package com.example.doudou.midautumnapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables needed
    private TextView var_activity_name;
    private ImageView var_activity_img;

    private TextView var_score;

    public int tot_score=0;
    public int private_score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Onclick Method Mooncake
    public void click_mooncake(View view){

        private_score=1;

        //test whether prerequisites are cleared

        if(private_score<0){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.notsatisfied));

        }else if (tot_score>=1){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.cantRedo_mooncake));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgmooncake);
        }
        else {

            //set updated img & activity name
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.string_mooncake));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgmooncake);


            //set updated score
            var_score=findViewById(R.id.id_score);


            for(int i=1; i<=private_score; tot_score+=i, i++);

            String stringFormat  = "Your total score is %d";
            var_score.setText(String.format(stringFormat, tot_score));
        }

    }

    // Onclick Method lantern
    public void click_lantern(View view){

        private_score=2;

        //test whether prerequisites are cleared

        if(tot_score<1){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.notsatisfied));

        }else if (tot_score>=3){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.cantRedo_lantern));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imglantern);
        }
        else {

            //set updated img & activity name
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.string_lantern));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imglantern);

            //set updated score
            var_score=findViewById(R.id.id_score);

            tot_score+=private_score;
            String stringFormat  = "Your total score is %d";
            var_score.setText(String.format(stringFormat, tot_score));
        }

    }

    // Onclick Method riddles
    public void click_riddles(View view){

        private_score=3;

        //test whether prerequisites are cleared

        if(tot_score<3){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.notsatisfied));

        }else if (tot_score>=6){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.cantRedo_riddles));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgriddles);
        }
        else {

            //set updated img & activity name
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.string_riddles));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgriddles);

            //set updated score
            var_score=findViewById(R.id.id_score);

            tot_score+=private_score;
            String stringFormat  = "Your total score is %d";
            var_score.setText(String.format(stringFormat, tot_score));
        }

    }

    // Onclick Method riddles
    public void click_orchestra(View view){

        private_score=4;

        //test whether prerequisites are cleared

        if(tot_score<6){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.notsatisfied));

        }else if (tot_score>=10){
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.cantRedo_orchestra));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgorchestra);
        }
        else {

            //set updated img & activity name
            var_activity_name=findViewById(R.id.id_activity_name);
            var_activity_name.setText(getString(R.string.string_orchestra));
            var_activity_img=findViewById(R.id.id_activity_img);
            var_activity_img.setImageResource(R.drawable.imgorchestra);

            //set updated score
            var_score=findViewById(R.id.id_score);

            tot_score+=private_score;
            String stringFormat  = "Your total score is %d";
            var_score.setText(String.format(stringFormat, tot_score));
        }

    }

    //Onclick Method reset
    public void click_reset(View view){
        tot_score=0;
        var_activity_name=findViewById(R.id.id_activity_name);
        var_activity_name.setText(getString(R.string.activity_name));

        var_activity_img=findViewById(R.id.id_activity_img);
        var_activity_img.setImageResource(R.drawable.imgjiayou);

        var_score=findViewById(R.id.id_score);
        var_score.setText(String.format(getString(R.string.score)));

    }
}
