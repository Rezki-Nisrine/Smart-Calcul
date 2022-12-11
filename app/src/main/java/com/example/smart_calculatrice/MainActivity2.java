package com.example.smart_calculatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
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

        double a ,b;
        try {
double res= 0;
String  msg = " ya pas de solution ";
             a = Double.parseDouble(val1.getText().toString());
             b = Double.parseDouble(val2.getText().toString());
             if (b==0){
                 res =0 ;
                 resu.setText(Double.toString(res));
             }
             else if (a!=0 && b!=0){
                 res = -b/a ;
                 resu.setText(Double.toString(res));
             }
             else if( a ==0 && b !=0) {
                 resu.setText("y'a pas de solution ");

          }else{
                 Toast.makeText(MainActivity2.this, " Y 'a pas de solution", Toast.LENGTH_SHORT).show();
             }



        } catch(Exception nfe) {
            AlertDialog.Builder c = new AlertDialog.Builder(MainActivity2.this);
            c.setCancelable(true);
            c.setTitle(" veuillez entrer un nombre !!");
            String chaine =" veuillez entrer un nombre ";c.setMessage("enter nombre ");
            resu.setText(chaine);
          //  Toast.makeText(MainActivity2.this, "Vous devez tapper un nombre", Toast.LENGTH_SHORT).show();

        }



    }


}