package com.example.sumup;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


public class Fragment1 extends Fragment {
    TextView txt1;
    RadioButton rd1,rd2,rd3,rd4,rd5,rd6,rd7,rd8,rd9,rd10;
    SharedPreferences Shared;
    SharedPreferences.Editor editor;
    String nm="0";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        rd1=v.findViewById(R.id.radioButton1);
        rd2=v.findViewById(R.id.radioButton2);
        rd3=v.findViewById(R.id.radioButton3);
        rd4=v.findViewById(R.id.radioButton4);
        rd5=v.findViewById(R.id.radioButton5);
        rd6=v.findViewById(R.id.radioButton6);
        rd7=v.findViewById(R.id.radioButton7);
        rd8=v.findViewById(R.id.radioButton8);
        rd9=v.findViewById(R.id.radioButton9);
        rd10=v.findViewById(R.id.radioButton10);

        Shared=this.getActivity().getSharedPreferences("myShared",MODE_PRIVATE);
         editor=Shared.edit();
        rd1.setChecked(true);
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="0";
            }
        });
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="1";
            }
        });
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nm="2";
            }
        });
        rd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="3";
            }
        });
        rd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nm="4";
            }
        });
        rd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="5";
            }
        });
        rd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="6";
            }
        });
        rd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="7";
            }
        });
        rd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 nm="8";
            }
        });
        rd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm="9";
            }
        });
        editor.putString("Name",nm);
        editor.commit();


        return v;
    }



    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {

        }
        else
        {
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

}

