package com.example.seconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String a=editText.getText().toString();
                Log.e("TAG", "afterTextChanged: "+editText.getText() );

                if (!a.equals("")){
                    int b= Integer.parseInt(a);
                    String d="";
                        int c=(b*60);
                        if(c/100!=0) d=c/100+"分";
                        if (c%100!=0)d+=c%100+"秒";

                        textView.setText("转换后：    "+d);
                }else textView.setText("");



            }
        });
    }

    private void init() {
        editText=findViewById(R.id.a);
        textView=findViewById(R.id.b);

    }
}