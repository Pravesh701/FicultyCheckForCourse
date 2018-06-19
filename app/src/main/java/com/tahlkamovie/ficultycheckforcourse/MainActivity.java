package com.tahlkamovie.ficultycheckforcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    TextView textView;
    Button btn;
    Spinner sp1,sp2;

    String teachers_name[];
    String course_name[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        btn = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView2);

        course_name = getResources().getStringArray(R.array.course_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,course_name);
        sp1.setAdapter(adapter);

        sp1.setOnItemSelectedListener (this);
        btn.setOnClickListener (this);
    }

    @Override
    public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
        if(position==0){
            teachers_name=new String[]{"Must select Course"};
        }
        else if(position==1){
            teachers_name=new String[]{"Manish Sir"};
        }
        else if(position==2){
            teachers_name=new String[]{"Shubham Sir"};
        }
        else if(position==3){
            teachers_name=new String[]{"Shubham Tripathi sir"};
        }
        else if(position==4){
            teachers_name=new String[]{"Saurabh Shukla Sir"};
        }
        else if(position==5){
            teachers_name=new String[]{"Pravesh singh"};
        }

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,teachers_name);
        sp2.setAdapter(adapter1);

    }

    @Override
    public void onNothingSelected(AdapterView <?> parent) {



    }
    @Override
    public void onClick(View v) {

        String courses=sp1.getSelectedItem ().toString ();
        String teachername=sp2.getSelectedItem ().toString ();
        textView.setText (" Course_Name= "+courses+"\n Teacher_Name = "+teachername);

    }
}
