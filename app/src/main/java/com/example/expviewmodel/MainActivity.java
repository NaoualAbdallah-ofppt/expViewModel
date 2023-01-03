package com.example.expviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt1;
EditText edit1;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String x;
       MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        txt1=(TextView) findViewById(R.id.txt1);
        if (model.getData1()!=null)
              txt1.setText(model.getData1());

        edit1=(EditText) findViewById(R.id.edit1);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("modifié text");
                edit1.setText("modifié edit");
                model.setData1(txt1.getText().toString());
            }
        });
    }
}