package com.nareshittechnologies.tabnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_red, container, false);
        EditText n1 = v.findViewById(R.id.number1);
        EditText n2 = v.findViewById(R.id.number2);
        Button b = v.findViewById(R.id.plus);
        TextView r = v.findViewById(R.id.result);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a+b;
                r.setText(String.valueOf(c));
            }
        });
        return v;
    }
}