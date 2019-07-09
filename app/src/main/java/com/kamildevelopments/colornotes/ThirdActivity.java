 package com.kamildevelopments.colornotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

 public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
     int visibility;
     int wchich;
     Button btn20;
     public static final String MY_PREFS_NAME = "MyPrefsFile";
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

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_third);
     }
     @Override
     public void onBackPressed(){

     }
     @Override
     public void onResume() {
         super.onResume();
         SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
         visibility = prefs.getInt("visibility", 0);
         wchich = prefs.getInt("wchich", 0);
         note1 = prefs.getString("note1", "");
         note2 = prefs.getString("note2", "");
         note3 = prefs.getString("note3", "");
         note4 = prefs.getString("note4", "");
         note5 = prefs.getString("note5", "");
         note6 = prefs.getString("note6", "");
         note7 = prefs.getString("note7", "");
         note8 = prefs.getString("note8", "");
         note9 = prefs.getString("note9", "");
         note10 = prefs.getString("note10", "");
         name1 = prefs.getString("name1", "");
         name2 = prefs.getString("name2", "");
         name3 = prefs.getString("name3", "");
         name4 = prefs.getString("name4", "");
         name5 = prefs.getString("name5", "");
         name6 = prefs.getString("name6", "");
         name7 = prefs.getString("name7", "");
         name8 = prefs.getString("name8", "");
         name9 = prefs.getString("name9", "");
         name10 = prefs.getString("name10", "");
         if (wchich == 1) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note1);
             name.setText(name1);
         }
         if (wchich == 2) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note2);
             name.setText(name2);
         }
         if (wchich == 3) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note3);
             name.setText(name3);
         }
         if (wchich == 4) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note4);
             name.setText(name4);
         }
         if (wchich == 5) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note5);
             name.setText(name5);
         }
         if (wchich == 6) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note6);
             name.setText(name6);
         }
         if (wchich == 7) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note7);
             name.setText(name7);
         }
         if (wchich == 8) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note8);
             name.setText(name8);
         }
         if (wchich == 9) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note9);
             name.setText(name9);
         }
         if (wchich == 10) {
             TextView note = findViewById(R.id.editText2);
             TextView name = findViewById(R.id.editText3);
             note.setText(note10);
             name.setText(name10);
         }
     }

     @Override
     public void onClick(View v) {
         btn20 = findViewById(R.id.button);
         Button btn4 = (Button) findViewById(R.id.button4);
         SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
         switch (v.getId()) {
             case R.id.button4:
                 visibility=visibility-1;
                 editor.putInt("Visibility", visibility);
                 editor.apply();
                 Intent back = new Intent (ThirdActivity.this, MainActivity.class);
                 startActivity(back);
                 break;
             case R.id.button:
                 TextView note = findViewById(R.id.editText2);
                 TextView name = findViewById(R.id.editText3);
                 if (wchich == 1) {
                     note1 = note.getText().toString();
                     name1 = name.getText().toString();
                     editor.putString("note1", note1);
                     editor.putString("name1", name1);

                 }
                 if (wchich == 2) {
                     note2 = note.getText().toString();
                     name2 = name.getText().toString();
                     editor.putString("note2", note2);
                     editor.putString("name2", name2);
                 }
                 if (wchich == 3) {
                     note3 = note.getText().toString();
                     name3 = name.getText().toString();
                     editor.putString("note3", note3);
                     editor.putString("name3", name3);
                 }
                 if (wchich == 4) {
                     note4 = note.getText().toString();
                     name4 = name.getText().toString();
                     editor.putString("note4", note4);
                     editor.putString("name4", name4);
                 }
                 if (wchich == 5) {
                     note5 = note.getText().toString();
                     name5 = name.getText().toString();
                     editor.putString("note5", note5);
                     editor.putString("name5", name5);
                 }
                 if (wchich == 6) {
                     note6 = note.getText().toString();
                     name6 = name.getText().toString();
                     editor.putString("note6", note6);
                     editor.putString("name6", name6);
                 }

                 if (wchich == 7) {
                     note7 = note.getText().toString();
                     name7 = name.getText().toString();
                     editor.putString("note7", note7);
                     editor.putString("name7", name7);
                 }
                 if (wchich == 8) {
                     note8 = note.getText().toString();
                     name8 = name.getText().toString();
                     editor.putString("note8", note8);
                     editor.putString("name8", name8);

                 }
                 if (wchich == 9) {
                     note9 = note.getText().toString();
                     name9 = name.getText().toString();
                     editor.putString("note9", note9);
                     editor.putString("name9", name9);
                 }

                 if (wchich == 10) {
                     note10 = note.getText().toString();
                     name10 = name.getText().toString();
                     editor.putString("note10", note10);
                     editor.putString("name10", name10);
                 }
                 editor.commit();
                 Intent Intent = new Intent(ThirdActivity.this, MainActivity.class);
                 startActivity(Intent);
                 break;
         }}
     }
