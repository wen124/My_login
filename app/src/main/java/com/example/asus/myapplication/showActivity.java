package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class showActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("infomation");
        TextView textView =(TextView)findViewById(R.id.editText6);
        TextView textView1 =(TextView)findViewById(R.id.editText4);
        TextView textView2=(TextView)findViewById(R.id.editText);
        TextView textView3=(TextView)findViewById(R.id.editText5);
        textView.setText(bundle.getString("editText"));
        textView1.setText(bundle.getString("editText1"));
        textView2.setText(bundle.getString("rdiotext"));
        textView3.setText(bundle.getString("hobby"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
