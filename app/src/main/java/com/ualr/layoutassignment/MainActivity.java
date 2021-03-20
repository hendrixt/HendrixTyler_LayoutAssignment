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



    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTotal(View v){

        double total = 0.0;

        EditText editText=findViewById(R.id.product_01_input);
        String temp = editText.getText().toString();
        double product_1 = 0.0;
        CheckBox p_1_check = (CheckBox)findViewById(R.id.product_01);

        if (p_1_check.isChecked()) {
            if (temp.length() != 0) {
                product_1 = Double.parseDouble(temp);
                total += product_1;
            }
        }

        editText=findViewById(R.id.product_02_input);
        temp = editText.getText().toString();
        double product_2 = 0.0;
        CheckBox p_2_check = (CheckBox)findViewById(R.id.product_02);

        if (p_2_check.isChecked()) {
            if (temp.length() != 0) {
                product_2 = Double.parseDouble(temp);
                total += product_2;
            }
        }

        editText=findViewById(R.id.product_03_input);
        temp = editText.getText().toString();
        double product_3 = 0.0;
        CheckBox p_3_check = (CheckBox)findViewById(R.id.product_03);

        if (p_3_check.isChecked()) {
            if (temp.length() != 0) {
                product_3 = Double.parseDouble(temp);
                total += product_3;
            }
        }

        editText=findViewById(R.id.product_04_input);
        temp = editText.getText().toString();
        double product_4 = 0.0;
        CheckBox p_4_check = (CheckBox)findViewById(R.id.product_04);

        if (p_4_check.isChecked()) {
            if (temp.length() != 0) {
                product_4 = Double.parseDouble(temp);
                total += product_4;
            }
        }

        MaterialButtonToggleGroup discount_group = findViewById(R.id.discount_group);
        Integer checkedBtnIndex=discount_group.getCheckedButtonId();
        Double discount = 0.5;

        if(checkedBtnIndex == findViewById(R.id.discount_bttn).getId()){
            total = total * discount;
        }

        temp = String.valueOf(total);
        TextView totalView = findViewById(R.id.product_total);
        totalView.setText(String.format("$ %s", temp));

    }
}