package com.kamildevelopments.colornotes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView name;
    TextView note;
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

    int visibility;
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
       visibility = prefs.getInt("visibility", 0);

        Button btn1 = findViewById(R.id.button11);
        Button btn2 = findViewById(R.id.button12);
        Button btn3 = findViewById(R.id.button13);
        Button btn4 = findViewById(R.id.button14);
        Button btn5 = findViewById(R.id.button15);
        Button btn6 = findViewById(R.id.button16);
        Button btn7 = findViewById(R.id.button17);
        Button btn8 = findViewById(R.id.button18);
        Button btn9 = findViewById(R.id.button19);
        Button btn10 = findViewById(R.id.button20);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
    }
    @Override
    public void onBackPressed(){

    }
    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        visibility = prefs.getInt("visibility", 0);
        Button btn11 = findViewById(R.id.button11);
        Button btn12 = findViewById(R.id.button12);
        Button btn13 = findViewById(R.id.button13);
        Button btn14 = findViewById(R.id.button14);
        Button btn15 = findViewById(R.id.button15);
        Button btn16 = findViewById(R.id.button16);
        Button btn17 = findViewById(R.id.button17);
        Button btn18 = findViewById(R.id.button18);
        Button btn19 = findViewById(R.id.button19);
        Button btn20 = findViewById(R.id.button20);
        Button btn3 = findViewById(R.id.button3);
        switch (v.getId()) {
            case R.id.button3:
                visibility=visibility-1;
                editor.putInt("visibility",visibility);
                editor.apply();
                Intent back = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(back);
                break;
            case R.id.button11:
                btn20.setBackgroundResource(R.color.blue);
                if(visibility==1) {
                    color1 = 1;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 1;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 1;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 1;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 1;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 1;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 1;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 1;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 1;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 1;
                    editor.putInt("color10", color10);
                }

                editor.apply();
                break;
            case R.id.button12:
                btn20.setBackgroundResource(R.color.lblue);
                if(visibility==1) {
                    color1 = 2;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 2;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 2;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 2;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 2;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 2;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 2;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 2;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 2;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 2;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button13:
                btn20.setBackgroundResource(R.color.yellow);
                if(visibility==1) {
                    color1 = 3;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 3;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 3;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 3;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 3;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 3;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 3;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 3;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 3;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 3;
                    editor.putInt("color10", color10);
                }

                editor.apply();
                break;
            case R.id.button14:
                btn20.setBackgroundResource(R.color.orange);
                if(visibility==1) {
                    color1 = 4;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 4;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 4;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 4;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 4;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 4;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 4;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 4;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 4;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 4;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button15:
                btn20.setBackgroundResource(R.color.green);
                if(visibility==1) {
                    color1 = 5;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 5;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 5;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 5;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 5;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 5;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 5;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 5;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 5;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 5;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button16:
                btn20.setBackgroundResource(R.color.purple);
                if(visibility==1) {
                    color1 = 6;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 6;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 6;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 6;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 6;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 6;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 6;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 6;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 6;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 6;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button17:
                btn20.setBackgroundResource(R.color.red);
                if(visibility==1) {
                    color1 = 7;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 7;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 7;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 7;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 7;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 7;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 7;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 7;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 7;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 7;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button18:
                btn20.setBackgroundResource(R.color.black);
                if(visibility==1) {
                    color1 = 8;
                    editor.putInt("color1", color1);
                }
                if(visibility==2) {
                    color2 = 8;
                    editor.putInt("color2", color2);
                }
                if(visibility==3){
                    color3 = 8;
                    editor.putInt("color3", color3);
                }
                if(visibility==4) {
                    color4 = 8;
                    editor.putInt("color4", color4);
                }
                if(visibility==5) {
                    color5 = 8;
                    editor.putInt("color5", color5);
                }
                if(visibility==6){
                    color6 = 8;
                    editor.putInt("color6", color6);
                }
                if(visibility==7) {
                    color7 = 8;
                    editor.putInt("color7", color7);
                }
                if(visibility==8) {
                    color8 = 8;
                    editor.putInt("color8", color8);
                }
                if(visibility==9){
                    color9 = 8;
                    editor.putInt("color9", color9);
                }
                if(visibility==10){
                    color10 = 8;
                    editor.putInt("color10", color10);
                }
                editor.apply();
                break;
            case R.id.button19:
                name = (TextView) findViewById(R.id.editText);
                note = (TextView) findViewById(R.id.edit_text);
                if(visibility==1){
                String name1 = name.getText().toString();
                String note1 = note.getText().toString();
                editor.putString("name1",name1);
                editor.putString("note1",note1);
                editor.apply();
            }
                if(visibility==2){
                    String name2 = name.getText().toString();
                    String note2 = note.getText().toString();
                    editor.putString("name2",name2);
                    editor.putString("note2",note2);
                    editor.apply();
                }
                if(visibility==3){
                    String name3 = name.getText().toString();
                    String note3 = note.getText().toString();
                    editor.putString("name3",name3);
                    editor.putString("note3",note3);
                    editor.apply();
                }
                if(visibility==4){
                    String name4 = name.getText().toString();
                    String note4 = note.getText().toString();
                    editor.putString("name4",name4);
                    editor.putString("note4",note4);
                    editor.apply();
                }
                if(visibility==5){
                    String name5 = name.getText().toString();
                    String note5 = note.getText().toString();
                    editor.putString("name5",name5);
                    editor.putString("note5",note5);
                    editor.apply();
                }
                if(visibility==6){
                    String name6 = name.getText().toString();
                    String note6 = note.getText().toString();
                    editor.putString("name6",name6);
                    editor.putString("note6",note6);
                    editor.apply();
                }
                if(visibility==7){
                    String name7 = name.getText().toString();
                    String note7 = note.getText().toString();
                    editor.putString("name7",name7);
                    editor.putString("note7",note7);
                    editor.apply();
                }
                if(visibility==8){
                    String name8 = name.getText().toString();
                    String note8 = note.getText().toString();
                    editor.putString("name8",name8);
                    editor.putString("note8",note8);
                    editor.apply();
                }
                if(visibility==9){
                    String name9 = name.getText().toString();
                    String note9 = note.getText().toString();
                    editor.putString("name9",name9);
                    editor.putString("note9",note9);
                    editor.apply();
                }
                if(visibility==10){
                    String name10 = name.getText().toString();
                    String note10 = note.getText().toString();
                    editor.putString("name10",name10);
                    editor.putString("note10",note10);
                    editor.apply();
                }
                Intent k = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(k);
                break;
            case R.id.button20:

                break;
        }
}}
