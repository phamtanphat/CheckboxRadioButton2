package com.ptp.phamtanphat.checkboxradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox ckAndroid,ckios;
    RadioGroup radioGroup;
    RadioButton radioButtonNode, radioButtonPhp;
    boolean check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckAndroid = findViewById(R.id.checkboxAndroid);
        ckios = findViewById(R.id.checkboxiOS);
        radioGroup = findViewById(R.id.radiogroup);
        radioButtonNode = findViewById(R.id.radiobuttonNode);
        radioButtonPhp = findViewById(R.id.radiobuttonPhp);

        radioGroup.setOnClickListener(this);

        ckios.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Co check", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Bo Check", Toast.LENGTH_SHORT).show();
                }

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiobuttonNode :
                        Toast.makeText(MainActivity.this, "Node da check", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.radiobuttonPhp :
                        Toast.makeText(MainActivity.this, "Php da check", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radiobuttonNode :
        }
    }
}
