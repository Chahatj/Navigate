package com.example.chahat.map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainNavigateActivity extends AppCompatActivity {

    EditText et_origin,et_dest;
    TextView tv_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainnavigate);



         et_origin = (EditText) findViewById(R.id.origin);
        et_dest = (EditText) findViewById(R.id.dest);
        tv_location = (TextView) findViewById(R.id.tv_location);


    }


    public void NavigateClickHandler(View view)
    {
        Intent intent = new Intent(this,MapNavigateActivity.class);
        intent.putExtra("origin",et_origin.getText().toString());
        intent.putExtra("dest",et_dest.getText().toString());
        startActivity(intent);

    }

    public void textviewClickHandler(View view)
    {
        et_origin.setText("Yourlocation");
    }
}
