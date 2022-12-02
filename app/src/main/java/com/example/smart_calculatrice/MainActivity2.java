package com.example.smart_calculatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
EditText val1;
EditText val2;
TextView resu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        val1 =(EditText) findViewById(R.id.val1);
        val2 =(EditText) findViewById(R.id.val2);
        resu =(TextView) findViewById(R.id.resu);
    }

    public void resultat(View view) {

        int a ,b,res=0;
        try {
             a = Integer.parseInt(val1.getText().toString());
             b = Integer.parseInt(val2.getText().toString());
            res = a+b;
            resu.setText(Integer.toString(res));

        } catch(Exception nfe) {
           /* AlertDialog.Builder c = new AlertDialog.Builder(MainActivity2.this);
            c.setCancelable(true);
            c.setTitle(" veuillez entrer un nombre !!");
            String chaine ="hi";
            c.setMessage(chaine);*/
            Toast.makeText(MainActivity2.this, "YOUR MESSAGE", Toast.LENGTH_SHORT).show();

        }



    }


}