package com.example.sjcet.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Emergency:
                Toast.makeText(this,"Emergency Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(this,"Profile Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutus:
                Toast.makeText(this,"About Us Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                Toast.makeText(this,"Signout Clicked",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}