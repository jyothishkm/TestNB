package com.example.next.testnb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();

    }

    private void setView() {
        btnSign = (Button) findViewById(R.id.button_signature);
        btnSign.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        View view = inflater.inflate(R.layout.signature_canvas,null, false);
        RelativeLayout parent = (RelativeLayout) view.findViewById(R.id.relative_signature);
        DrawView drawView = new DrawView(MainActivity.this);
        parent.addView(drawView);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);
        drawView.requestFocus();
    }
}
