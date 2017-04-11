package com.p_soft.p_soft.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    SimpleAdapter simpleAdapter;
    List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spainer);

        employeeList.add(createEmployee("", "Evision Software Ltd"));
        employeeList.add(createEmployee("", "Ab bank ltd"));
        employeeList.add(createEmployee("", "Dutch Bank Ltd"));

        simpleAdapter = new SimpleAdapter(this, employeeList, android.R.layout.simple_list_item_1, new String[] { "" }, new int[] { android.R.id.text1 });
        spinner.setAdapter(simpleAdapter);


    }

    private HashMap<String, String> createEmployee(String name, String number) {
        HashMap<String, String> employeeNameNo = new HashMap<String, String>();
        employeeNameNo.put(name, number);
        return employeeNameNo;
    }

}
