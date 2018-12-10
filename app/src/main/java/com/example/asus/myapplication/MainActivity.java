package com.example.asus.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username=(EditText)findViewById(R.id.editText3);
                EditText password=(EditText)findViewById(R.id.editText2);
                RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
                StringBuilder hobby=new StringBuilder();
                CheckBox checkBox1=(CheckBox)findViewById(R.id.checkBox);
                CheckBox checkBox2=(CheckBox)findViewById(R.id.checkBox2);
                CheckBox checkBox3=(CheckBox)findViewById(R.id.checkBox4);
                RadioButton radio=(RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());

                //Log.i("into",username.getText().toString()+password.getText().toString());
                Intent intent=new Intent(MainActivity.this,showActivity.class);
                Bundle bundle=new Bundle();

                if (checkBox1.isChecked()){
                    hobby.append(checkBox1.getText().toString()+" ");
                }
                if (checkBox2.isChecked()){
                    hobby.append(checkBox2.getText().toString()+" ");
                }
                if (checkBox3.isChecked()){
                    hobby.append(checkBox3.getText().toString()+" ");
                }
                bundle.putString("hobby",hobby.toString());
                bundle.putString("editText",username.getText().toString());
                bundle.putString("editText1", password.getText().toString());
                bundle.putString("rdiotext",radio.getText().toString());
                intent.putExtra("infomation",bundle);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
