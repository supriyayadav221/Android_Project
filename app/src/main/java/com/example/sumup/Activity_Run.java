package com.example.sumup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_Run extends AppCompatActivity {
    ListView lstvw;
    ArrayAdapter apt;
    String []name={"Theme APP                                   ","Custom Objects                             ","Fragment Data Transfer                            "};
    String []nm={"MainActivity","My_Edit_text","Question_5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__run);
        lstvw=findViewById(R.id.lstvw);
        apt =new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name);
        lstvw.setAdapter(apt);
        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d=nm[position];
                try
                {
                    Class cls=Class.forName("com.example.sumup."+d);
                    Intent i=new Intent(Activity_Run.this,cls);
                    startActivity(i);
                }
                catch (ClassNotFoundException e)
                {
                    Toast.makeText(Activity_Run.this, ""+"Class Not Found", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
