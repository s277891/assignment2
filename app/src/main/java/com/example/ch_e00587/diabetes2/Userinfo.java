package com.example.ch_e00587.diabetes2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.widget.EditText;

public class Userinfo extends ActionBarActivity{
    ListView listView;
    SQLiteDatabase sqLiteDatabase;    Cursor cursor;
    ListDataAdapter listDataAdapter;
    SQLiteDatabase db;
    TextView tv;
    MyDbHandler myDbHandler;
    Button button2;
    private EditText edittext;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

    }
    protected void openDatabase() {
        db = openOrCreateDatabase("Persons", Context.MODE_PRIVATE, null);
    }

    protected void showRecords() {
        String id = cursor.getString(0);
        String name = cursor.getString(1);
        String dob = cursor.getString(2);
        String bp = cursor.getString(3);
        String cholestrol = cursor.getString(4);
        String hypo = cursor.getString(5);
        String glucose = cursor.getString(6);
        edittext.setText(id);
        editText.setText(name);
        editText2.setText(dob);
        editText3.setText(bp);
        editText4.setText(cholestrol);
        editText5.setText(hypo);
        editText6.setText(glucose);


    }

}


