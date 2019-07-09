package com.kamildevelopments.colornotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int visibility;
    int wchich;

    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    CheckBox chk4;
    CheckBox chk5;
    CheckBox chk6;
    CheckBox chk7;
    CheckBox chk8;
    CheckBox chk9;
    CheckBox chk10;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;

    TextView text1;

    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;
    String name7;
    String name8;
    String name9;
    String name10;
    String note1;
    String note2;
    String note3;
    String note4;
    String note5;
    String note6;
    String note7;
    String note8;
    String note9;
    String note10;

    int color1;
    int color2;
    int color3;
    int color4;
    int color5;
    int color6;
    int color7;
    int color8;
    int color9;
    int color10;

    public static final String MY_PREFS_NAME = "MyPrefsFile";
    @Override
    public void onBackPressed(){
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        visibility=0;
        checkboxes();
    }
    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        visibility = prefs.getInt("visibility", 0);
        wchich = prefs.getInt("wchich", 0);
        name1 = prefs.getString("name1","");
        name2 = prefs.getString("name2","");
        name3 = prefs.getString("name3","");
        name4 = prefs.getString("name4","");
        name5 = prefs.getString("name5","");
        name6 = prefs.getString("name6","");
        name7 = prefs.getString("name7","");
        name8 = prefs.getString("name8","");
        name9 = prefs.getString("name9","");
        name10 = prefs.getString("name10","");

        note1 = prefs.getString("note1","");
        note2 = prefs.getString("note2","");
        note3 = prefs.getString("note3","");
        note4 = prefs.getString("note4","");
        note5 = prefs.getString("note5","");
        note6 = prefs.getString("note6","");
        note7 = prefs.getString("note7","");
        note8 = prefs.getString("note8","");
        note9 = prefs.getString("note9","");
        note10 = prefs.getString("note10","");

        btn1 = (Button) findViewById(R.id.one);
        btn2 = (Button) findViewById(R.id.two);
        btn3 = (Button) findViewById(R.id.three);
        btn4 = (Button) findViewById(R.id.four);
        btn5 = (Button) findViewById(R.id.five);
        btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        btn8 = (Button) findViewById(R.id.eight);
        btn9 = (Button) findViewById(R.id.nine);
        btn10 = (Button) findViewById(R.id.ten);
        Button dwa = (Button) findViewById(R.id.button2);

        color1 = prefs.getInt("color1",0);
        color2 = prefs.getInt("color2",0);
        color3= prefs.getInt("color3",0);
        color4 = prefs.getInt("color4",0);
        color5 = prefs.getInt("color5",0);
        color6 = prefs.getInt("color6",0);
        color7 = prefs.getInt("color7",0);
        color8 = prefs.getInt("color8",0);
        color9 = prefs.getInt("color9",0);
        color10 = prefs.getInt("color10",0);
        vision();
        kolory();
        dwa.setVisibility(View.INVISIBLE);
    }

    public void kolory(){
        if(color1==0){
            btn1 = (Button) findViewById(R.id.one);
            btn1.setBackgroundResource(R.color.white);
            chk1 = (CheckBox) findViewById(R.id.checkBox);
            chk1.setBackgroundResource(R.color.white);
        }
        if(color2==0){
            btn2 = (Button) findViewById(R.id.two);
            btn2.setBackgroundResource(R.color.white);
            chk2 = (CheckBox) findViewById(R.id.checkBox2);
            chk2.setBackgroundResource(R.color.white);
        }
        if(color3==0){
            btn3 = (Button) findViewById(R.id.three);
            btn3.setBackgroundResource(R.color.white);
            chk3 = (CheckBox) findViewById(R.id.checkBox3);
            chk3.setBackgroundResource(R.color.white);
        }
        if(color4==0){
            btn4 = (Button) findViewById(R.id.four);
            btn4.setBackgroundResource(R.color.white);
            chk4 = (CheckBox) findViewById(R.id.checkBox4);
            chk4.setBackgroundResource(R.color.white);
        }
        if(color5==0){
            btn5 = (Button) findViewById(R.id.five);
            btn5.setBackgroundResource(R.color.white);
            chk5 = (CheckBox) findViewById(R.id.checkBox5);
            chk5.setBackgroundResource(R.color.white);
        }
        if(color6==0){
            btn6 = (Button) findViewById(R.id.six);
            btn6.setBackgroundResource(R.color.white);
            chk6 = (CheckBox) findViewById(R.id.checkBox6);
            chk6.setBackgroundResource(R.color.white);
        }
        if(color7==0){
            btn7 = (Button) findViewById(R.id.seven);
            btn7.setBackgroundResource(R.color.white);
            chk7 = (CheckBox) findViewById(R.id.checkBox7);
            chk7.setBackgroundResource(R.color.white);
        }
        if(color8==0){
            btn8 = (Button) findViewById(R.id.eight);
            btn8.setBackgroundResource(R.color.white);
            chk8 = (CheckBox) findViewById(R.id.checkBox8);
            chk8.setBackgroundResource(R.color.white);
        }
        if(color9==0){
            btn9 = (Button) findViewById(R.id.nine);
            btn9.setBackgroundResource(R.color.white);
            chk9 = (CheckBox) findViewById(R.id.checkBox9);
            chk9.setBackgroundResource(R.color.white);
        }
        if(color10==0){
            btn10 = (Button) findViewById(R.id.ten);
            btn10.setBackgroundResource(R.color.white);
            chk10 = (CheckBox) findViewById(R.id.checkBox10);
            chk10.setBackgroundResource(R.color.white);
        }
            if (color1 > 0) {
                if (color1 == 1) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.blue);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.blue);
                }
                if (color1 == 2) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.lblue);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.lblue);
                }
                if (color1 == 3) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.yellow);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.yellow);
                }
                if (color1 == 4) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.orange);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.orange);
                }
                if (color1 == 5) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.green);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.green);
                }
                if (color1 == 6) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.purple);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.purple);
                }
                if (color1 == 7) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.red);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.red);
                }
                if (color1 == 8) {
                    btn1 = (Button) findViewById(R.id.one);
                    btn1.setBackgroundResource(R.color.black);
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setBackgroundResource(R.color.black);
                    btn1.setTextColor(Color.WHITE);
                }
            }
            if (color2 > 0) {
                if (color2 == 1) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.blue);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.blue);
                }
                if (color2 == 2) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.lblue);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.lblue);
                }
                if (color2 == 3) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.yellow);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.yellow);
                }
                if (color2 == 4) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.orange);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.orange);
                }
                if (color2 == 5) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.green);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.green);
                }
                if (color2 == 6) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.purple);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.purple);
                }
                if (color2 == 7) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.red);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.red);
                }
                if (color2 == 8) {
                    btn2 = (Button) findViewById(R.id.two);
                    btn2.setBackgroundResource(R.color.black);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setBackgroundResource(R.color.black);
                    btn2.setTextColor(Color.WHITE);
                }
            }
            if (color3 > 0) {
                if (color3 == 1) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.blue);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.blue);
                }
                if (color3 == 2) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.lblue);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.lblue);
                }
                if (color3 == 3) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.yellow);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.yellow);
                }
                if (color3 == 4) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.orange);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.orange);
                }
                if (color3 == 5) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.green);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.green);
                }
                if (color3 == 6) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.purple);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.purple);
                }
                if (color3 == 7) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.red);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.red);
                }
                if (color3 == 8) {
                    btn3 = (Button) findViewById(R.id.three);
                    btn3.setBackgroundResource(R.color.black);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setBackgroundResource(R.color.black);
                    btn3.setTextColor(Color.WHITE);
                }
            }
            if (color4 > 0) {
                if (color4 == 1) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.blue);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.blue);

                }
                if (color4 == 2) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.lblue);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.lblue);
                }
                if (color4 == 3) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.yellow);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.yellow);
                }
                if (color4 == 4) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.orange);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.orange);
                }
                if (color4 == 5) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.green);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.green);
                }
                if (color4 == 6) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.purple);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.purple);
                }
                if (color4 == 7) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.red);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.red);
                }
                if (color4 == 8) {
                    btn4 = (Button) findViewById(R.id.four);
                    btn4.setBackgroundResource(R.color.black);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setBackgroundResource(R.color.black);
                    btn4.setTextColor(Color.WHITE);
                }
            }
            if (color5 > 0) {
                if (color5 == 1) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.blue);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.blue);
                }
                if (color5 == 2) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.lblue);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.lblue);
                }
                if (color5 == 3) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.yellow);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.yellow);
                }
                if (color5 == 4) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.orange);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.orange);
                }
                if (color5 == 5) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.green);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.orange);
                }
                if (color5 == 6) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.purple);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.purple);
                }
                if (color5 == 7) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.red);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.red);
                }
                if (color5 == 8) {
                    btn5 = (Button) findViewById(R.id.five);
                    btn5.setBackgroundResource(R.color.black);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setBackgroundResource(R.color.black);
                    btn5.setTextColor(Color.WHITE);
                }
            }
            if (color6 > 0) {
                if (color6 == 1) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.blue);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.blue);
                }
                if (color6 == 2) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.lblue);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.lblue);
                }
                if (color6 == 3) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.yellow);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.yellow);
                }
                if (color6 == 4) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.orange);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.orange);
                }
                if (color6 == 5) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.green);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.green);
                }
                if (color6 == 6) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.purple);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.purple);
                }
                if (color6 == 7) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.red);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.red);
                }
                if (color6 == 8) {
                    btn6 = (Button) findViewById(R.id.six);
                    btn6.setBackgroundResource(R.color.black);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setBackgroundResource(R.color.black);
                    btn6.setTextColor(Color.WHITE);
                }
            }
            if (color7 > 0) {
                if (color7 == 1) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.blue);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.blue);
                }
                if (color7 == 2) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.lblue);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.lblue);
                }
                if (color7 == 3) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.yellow);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.yellow);
                }
                if (color7 == 4) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.orange);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.orange);
                }
                if (color7 == 5) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.green);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.green);
                }
                if (color7 == 6) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.purple);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.purple);
                }
                if (color7 == 7) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.red);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.red);
                }
                if (color7 == 8) {
                    btn7 = (Button) findViewById(R.id.seven);
                    btn7.setBackgroundResource(R.color.black);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setBackgroundResource(R.color.black);
                    btn7.setTextColor(Color.WHITE);
                }
            }
            if (color8 > 0) {
                if (color8 == 1) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.blue);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.blue);
                }
                if (color8 == 2) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.lblue);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.lblue);
                }
                if (color8 == 3) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.yellow);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.yellow);
                }
                if (color8 == 4) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.orange);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.orange);
                }
                if (color8 == 5) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.green);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.green);
                }
                if (color8 == 6) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.purple);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.purple);
                }
                if (color8 == 7) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.red);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.red);
                }
                if (color8 == 8) {
                    btn8 = (Button) findViewById(R.id.eight);
                    btn8.setBackgroundResource(R.color.black);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setBackgroundResource(R.color.black);
                    btn8.setTextColor(Color.WHITE);
                }
            }
            if (color9 > 0) {
                if (color9 == 1) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.blue);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.blue);
                }
                if (color9 == 2) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.lblue);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.lblue);
                }
                if (color9 == 3) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.yellow);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.yellow);
                }
                if (color9 == 4) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.orange);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.orange);
                }
                if (color9 == 5) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.green);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.green);
                }
                if (color9 == 6) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.purple);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.purple);
                }
                if (color9 == 7) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.red);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.red);
                }
                if (color1 == 8) {
                    btn9 = (Button) findViewById(R.id.nine);
                    btn9.setBackgroundResource(R.color.black);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setBackgroundResource(R.color.black);
                    btn9.setTextColor(Color.WHITE);
                }
            }
            if (color10 > 0) {
                if (color10 == 1) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.blue);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.blue);
                }
                if (color10 == 2) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.lblue);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.lblue);
                }
                if (color10 == 3) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.yellow);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.yellow);
                }
                if (color10 == 4) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.orange);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.orange);
                }
                if (color10 == 5) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.green);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.green);
                }
                if (color10 == 6) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.purple);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.purple);
                }
                if (color10 == 7) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.red);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.red);
                }
                if (color10 == 8) {
                    btn10 = (Button) findViewById(R.id.ten);
                    btn10.setBackgroundResource(R.color.black);
                    btn10.setTextColor(Color.WHITE);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setBackgroundResource(R.color.black);
                }}}
    public void checkboxes(){
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk5 = (CheckBox) findViewById(R.id.checkBox5);
        chk6 = (CheckBox) findViewById(R.id.checkBox6);
        chk7 = (CheckBox) findViewById(R.id.checkBox7);
        chk8 = (CheckBox) findViewById(R.id.checkBox8);
        chk9 = (CheckBox) findViewById(R.id.checkBox9);
        chk10 = (CheckBox) findViewById(R.id.checkBox10);
        chk1.setVisibility(View.GONE);
        chk2.setVisibility(View.GONE);
        chk3.setVisibility(View.GONE);
        chk4.setVisibility(View.GONE);
        chk5.setVisibility(View.GONE);
        chk6.setVisibility(View.GONE);
        chk7.setVisibility(View.GONE);
        chk8.setVisibility(View.GONE);
        chk9.setVisibility(View.GONE);
        chk10.setVisibility(View.GONE);
    }

    public void zapis(){
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString("note1", note1);
        editor.putString("note2", note2);
        editor.putString("note3", note3);
        editor.putString("note4", note4);
        editor.putString("note5", note5);
        editor.putString("note6", note6);
        editor.putString("note7", note7);
        editor.putString("note8", note8);
        editor.putString("note9", note9);
        editor.putString("note10", note10);
        editor.putInt("visibility", visibility);
        editor.putInt("color1", color1);
        editor.putInt("color2", color2);
        editor.putInt("color3", color3);
        editor.putInt("color4", color4);
        editor.putInt("color5", color5);
        editor.putInt("color6", color6);
        editor.putInt("color7", color7);
        editor.putInt("color8", color8);
        editor.putInt("color9", color9);
        editor.putInt("color10", color10);
        editor.putString("name1",name1);
        editor.putString("name2",name2);
        editor.putString("name3",name3);
        editor.putString("name4",name4);
        editor.putString("name5",name5);
        editor.putString("name6",name6);
        editor.putString("name7",name7);
        editor.putString("name8",name8);
        editor.putString("name9",name9);
        editor.putString("name10",name10);
        editor.apply();
    }

    public void vision(){
        if(visibility>0){
            if (visibility>0) {
                btn1 = (Button) findViewById(R.id.one);
                btn1.setVisibility(View.VISIBLE);
                btn1.setText(name1);
            }else{
                btn1 = (Button) findViewById(R.id.one);
                btn1.setVisibility(View.INVISIBLE);
            }

            if (visibility>1) {
                btn2 = (Button) findViewById(R.id.two);
                btn2.setVisibility(View.VISIBLE);
                btn2.setText(name2);

            }else{
                btn2 = (Button) findViewById(R.id.two);
                btn2.setVisibility(View.INVISIBLE);

            }
            if (visibility>2) {
                btn3 = (Button) findViewById(R.id.three);
                btn3.setVisibility(View.VISIBLE);
                btn3.setText(name3);

            }else{
                btn3 = (Button) findViewById(R.id.three);
                btn3.setVisibility(View.INVISIBLE);


            }
            if (visibility>3) {
                btn4 = (Button) findViewById(R.id.four);
                btn4.setVisibility(View.VISIBLE);
                btn4.setText(name4);

            }else{
                btn4 = (Button) findViewById(R.id.four);
                btn4.setVisibility(View.INVISIBLE);

            }
            if (visibility>4) {
                btn5 = (Button) findViewById(R.id.five);
                btn5.setVisibility(View.VISIBLE);
                btn5.setText(name5);

            }else{
                btn5 = (Button) findViewById(R.id.five);
                btn5.setVisibility(View.INVISIBLE);

            }
            if (visibility>5) {
                btn6 = (Button) findViewById(R.id.six);
                btn6.setVisibility(View.VISIBLE);
                btn6.setText(name6);


            }else{
                btn6 = (Button) findViewById(R.id.six);
                btn6.setVisibility(View.INVISIBLE);
            }
            if (visibility>6) {
                btn7 = (Button) findViewById(R.id.seven);
                btn7.setVisibility(View.VISIBLE);
                btn7.setText(name7);


            }else{
                btn7 = (Button) findViewById(R.id.seven);
                btn7.setVisibility(View.INVISIBLE);

            }
            if (visibility>7) {
                btn8 = (Button) findViewById(R.id.eight);
                btn8.setVisibility(View.VISIBLE);
                btn8.setText(name8);


            }else{
                btn8 = (Button) findViewById(R.id.eight);
                btn8.setVisibility(View.INVISIBLE);

            }
            if (visibility>8) {
                btn9 = (Button) findViewById(R.id.nine);
                btn9.setVisibility(View.VISIBLE);
                btn9.setText(name9);

            }else{
                btn9 = (Button) findViewById(R.id.nine);
                btn9.setVisibility(View.INVISIBLE);

            }
            if (visibility>9) {
                btn10 = (Button) findViewById(R.id.ten);
                btn10.setVisibility(View.VISIBLE);
                btn10.setText(name10);

            }else{
                btn10 = (Button) findViewById(R.id.ten);
                btn10.setVisibility(View.INVISIBLE);

            }
        }
    }
    @Override
    public void onClick(View v) {
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn10 = findViewById(R.id.ten);
        Button dwa = findViewById(R.id.button2);

        Intent Intent3 = new Intent(MainActivity.this, ThirdActivity.class);
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        switch (v.getId()) {
            case R.id.button2:
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setVisibility(View.GONE);
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setVisibility(View.GONE);
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setVisibility(View.GONE);
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setVisibility(View.GONE);
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setVisibility(View.GONE);
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setVisibility(View.GONE);
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setVisibility(View.GONE);
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setVisibility(View.GONE);
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setVisibility(View.GONE);
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setVisibility(View.GONE);
                    dwa.setVisibility(View.INVISIBLE);
                break;

            case R.id.one:
                wchich=1;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.two:
                wchich=2;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.three:
                wchich=3;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.four:
                wchich=4;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.five:
                wchich=5;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.six:
                wchich=6;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.seven:
                wchich=7;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.eight:
                wchich=8;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.nine:
                wchich=9;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.ten:
                wchich=10;
                editor.putInt("wchich", wchich);
                editor.apply();
                startActivity(Intent3);
                break;

            case R.id.checkBox:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note1 = note2;
                note2 = note3;
                note3 = note4;
                note4 = note5;
                note5 = note6;
                note6 = note7;
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color1 = color2;
                color2 = color3;
                color3 = color4;
                color4 = color5;
                color5 = color6;
                color6 = color7;
                color7 = color8;
                color8 = color9;
                color9 = color10;
               name1=name2;
                name2=name3;
                name3=name4;
                name4=name5;
                name5=name6;
                name6=name7;
                name7=name8;
                name8=name9;
                name9=name10;
                if(visibility==0) {
                note1="";
                name1="";
                btn1.setVisibility(View.INVISIBLE); }
                kolory();
                vision();
                checkboxes();
                zapis();
                chk1.toggle();
break;
case R.id.checkBox2:
    visibility=visibility-1;
    dwa.setVisibility(View.INVISIBLE);
    note2 = note3;
    note3 = note4;
    note4 = note5;
    note5 = note6;
    note6 = note7;
    note7 = note8;
    note8 = note9;
    note9 = note10;

    color2 = color3;
    color3 = color4;
    color4 = color5;
    color5 = color6;
    color6 = color7;
    color7 = color8;
    color8 = color9;
    color9 = color10;

    name2=name3;
    name3=name4;
    name4=name5;
    name5=name6;
    name6=name7;
    name7=name8;
    name8=name9;
    name9=name10;
   kolory();
   checkboxes();
   vision();
   zapis();
    chk2.toggle();
    break;
    case R.id.checkBox3:
                visibility=visibility-1;
        dwa.setVisibility(View.INVISIBLE);
                note3 = note4;
                note4 = note5;
                note5 = note6;
                note6 = note7;
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color3 = color4;
                color4 = color5;
                color5 = color6;
                color6 = color7;
                color7 = color8;
                color8 = color9;
                color9 = color10;
                name3=name4;
                name4=name5;
                name5=name6;
                name6=name7;
                name7=name8;
                name8=name9;
                name9=name10;
                kolory();
                checkboxes();
                vision();
                zapis();
                chk3.toggle();
                break;
            case R.id.checkBox4:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note4 = note5;
                note5 = note6;
                note6 = note7;
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color4 = color5;
                color5 = color6;
                color6 = color7;
                color7 = color8;
                color8 = color9;
                color9 = color10;
                name4=name5;
                name5=name6;
                name6=name7;
                name7=name8;
                name8=name9;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();
                chk4.toggle();
                break;
            case R.id.checkBox5:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note5 = note6;
                note6 = note7;
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color5 = color6;
                color6 = color7;
                color7 = color8;
                color8 = color9;
                color9 = color10;
                name5=name6;
                name6=name7;
                name7=name8;
                name8=name9;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();

                chk5.toggle();
                break;

            case R.id.checkBox6:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note6 = note7;
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color6 = color7;
                color7 = color8;
                color8 = color9;
                color9 = color10;
                name6=name7;
                name7=name8;
                name8=name9;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();
                chk6.toggle();
                break;
            case R.id.checkBox7:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note7 = note8;
                note8 = note9;
                note9 = note10;
                color7 = color8;
                color8 = color9;
                color9 = color10;
                name7=name8;
                name8=name9;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();
                chk7.toggle();
                break;
            case R.id.checkBox8:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note8 = note9;
                note9 = note10;
                color8 = color9;
                color9 = color10;
                name8=name9;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();

                chk8.toggle();
                break;
            case R.id.checkBox9:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note9 = note10;
                color9 = color10;
                name9=name10;
                kolory();
                vision();
                checkboxes();
                zapis();

                chk9.toggle();
                break;
            case R.id.checkBox10:
                visibility=visibility-1;
                dwa.setVisibility(View.INVISIBLE);
                note10="";
                color10=0;
               name10="";
                kolory();
                vision();
                checkboxes();
                zapis();
                chk10.toggle();
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.plus:
                if(visibility==10) {
                    Toast toast = Toast.makeText(getApplicationContext(), (R.string.toast1), Toast.LENGTH_LONG);
                    View view1 = toast.getView();
                    view1.setBackgroundResource(R.color.blue);
                    toast.show();
                    return super.onOptionsItemSelected(item);
                }
                setContentView(R.layout.activity_main);
                Button btn1 = (Button) findViewById(R.id.one);
visibility=visibility+1;
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                editor.putInt("visibility", visibility);
                editor.apply();
                Intent k = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(k);
                return true;
            case R.id.bin:
                if(visibility>0){
                    chk1 = (CheckBox) findViewById(R.id.checkBox);
                    chk1.setVisibility(View.VISIBLE);}
                if(visibility>1){
                    chk2 = (CheckBox) findViewById(R.id.checkBox2);
                    chk2.setVisibility(View.VISIBLE);}
                if(visibility>2){
                    chk3 = (CheckBox) findViewById(R.id.checkBox3);
                    chk3.setVisibility(View.VISIBLE);}
                if(visibility>3){
                    chk4 = (CheckBox) findViewById(R.id.checkBox4);
                    chk4.setVisibility(View.VISIBLE);}
                if(visibility>4){
                    chk5 = (CheckBox) findViewById(R.id.checkBox5);
                    chk5.setVisibility(View.VISIBLE);}
                if(visibility>5){
                    chk6 = (CheckBox) findViewById(R.id.checkBox6);
                    chk6.setVisibility(View.VISIBLE);}
                if(visibility>6){
                    chk7 = (CheckBox) findViewById(R.id.checkBox7);
                    chk7.setVisibility(View.VISIBLE);}
                if(visibility>7){
                    chk8 = (CheckBox) findViewById(R.id.checkBox8);
                    chk8.setVisibility(View.VISIBLE);}
                if(visibility>8){
                    chk9 = (CheckBox) findViewById(R.id.checkBox9);
                    chk9.setVisibility(View.VISIBLE);}
                if(visibility>9){
                    chk10 = (CheckBox) findViewById(R.id.checkBox10);
                    chk10.setVisibility(View.VISIBLE);}
                Button dwa = (Button) findViewById(R.id.button2);
                dwa.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item); } }}