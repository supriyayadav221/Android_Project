package com.example.sumup;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class fragment2 extends Fragment {
    ConstraintLayout Cons;
    LinearLayout linearLayout;
    String data;
    SharedPreferences Shared;
    int i=3;
    int aa[]={R.color.Blue,R.color.Black,R.color.Green,R.color.Yellow,R.color.Red,R.color.Magenta,R.color.Cyan,R.color.Grey,R.color.Brown,R.color.Violet};
    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment2_layout, container, false);
        Cons=v.findViewById(R.id.Cons);
        linearLayout=v.findViewById(R.id.linear);

         data=null;
        Shared=this.getActivity().getSharedPreferences("myShared",MODE_PRIVATE);
        data=Shared.getString("Name","0");
        i = Integer.parseInt(data.trim());

     linearLayout.setBackgroundResource(aa[i]);
        return  v;
    }

    @Override
    public void onResume() {
        Toast.makeText(this.getActivity(), ""+i, Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
        else
        {

        }
    }

    @Override
    public void onPause() {

        super.onPause();
    }


}
