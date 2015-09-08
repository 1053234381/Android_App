package com.zhangli.android_app;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        textView.setOnClickListener(this);
    }

    private void initView() {
        textView = (TextView) this.findViewById(R.id.textview);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.textview){
            textView.setTextColor(Color.BLUE);
        }
    }
}
