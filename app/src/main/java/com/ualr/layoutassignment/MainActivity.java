package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


// TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money
    public void calculateTotal(View v){

        double total = 0.0 , discount = 0.5;
        double product_01 = 0.0,  product_02 = 0.0, product_03 = 0.0, product_04 = 0.0;

        EditText editText=findViewById(R.id.product_01_input);
        String temp = editText.getText().toString();

        CheckBox p_01_check = (CheckBox)findViewById(R.id.product_01);
        if (p_01_check.isChecked()) {
            if (temp.length() != 0) {
                product_01 = Double.parseDouble(temp);
                total += product_01;
            }
        }

        editText=findViewById(R.id.product_02_input);
        temp = editText.getText().toString();

        CheckBox p_02_check = (CheckBox)findViewById(R.id.product_02);

        if (p_02_check.isChecked()) {


            if (temp.length() != 0) {
                product_02 = Double.parseDouble(temp);
                total += product_02;
            }
        }

        editText=findViewById(R.id.product_03_input);
        temp = editText.getText().toString();

        CheckBox p_3_check = (CheckBox)findViewById(R.id.product_03);

        if (p_3_check.isChecked()) {


            if (temp.length() != 0) {
                product_03 = Double.parseDouble(temp);
                total += product_03;
            }
        }

        editText=findViewById(R.id.product_04_input);
        temp = editText.getText().toString();

        CheckBox p_4_check = (CheckBox)findViewById(R.id.product_04);

        if (p_4_check.isChecked()) {


            if (temp.length() != 0) {
                product_04 = Double.parseDouble(temp);
                total += product_04;
            }
        }

// TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

        MaterialButtonToggleGroup discount_group = findViewById(R.id.discount_group);
        Integer checkedBtnIndex = discount_group.getCheckedButtonId();


        if(checkedBtnIndex == findViewById(R.id.discount_bttn).getId()){
            total = total * discount;
        }

        temp = String.valueOf(total);
        TextView totalView = findViewById(R.id.product_total);
        totalView.setText(String.format("$ %s", temp));

    }
}