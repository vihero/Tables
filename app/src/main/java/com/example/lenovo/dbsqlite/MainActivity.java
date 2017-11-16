package com.example.lenovo.dbsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonclickedGETTABLE(View V)
    {
        TextView v1=(TextView)findViewById(R.id.result);
 EditText number=(EditText)findViewById(R.id.num);
int num=Integer.parseInt(number.getText().toString());
        int op=0;
        String result = " ";
        for(int i=1;i<11;i++)
        {
        op=num*i;
            result=result+"      "+(Integer.toString(op)+"    \n    ");
        }
        v1.setText(result.toString());
    }

}
