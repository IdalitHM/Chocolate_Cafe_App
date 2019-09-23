package com.example.chocolatecafe;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] cafe={"Chocolate Mousse","Chocolate Cake","Chocolate Macaron","Chocolate Cafe Website"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.food, cafe));



    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Mousse.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, Cake.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, Macaron.class));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chocolatetharlem.com ")));
                break;
        }
    }


}
