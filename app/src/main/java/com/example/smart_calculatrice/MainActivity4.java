package com.example.smart_calculatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {


    EditText val1;
    EditText val2;
    EditText val3;
    TextView sol1;
    TextView sol2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        val1 =(EditText) findViewById(R.id.val1);
        val2 =(EditText) findViewById(R.id.val2);
        val3 =(EditText) findViewById(R.id.val3);
        sol1 =(TextView) findViewById(R.id.sol1);
        sol2 =(TextView) findViewById(R.id.sol2);
    }

    public void solution(View view) {

        double a ,b , c ,delta;

        try {
            double x1 , x2, res=0;
            String  msg = " ya pas de solution ";
            a = Double.parseDouble(val1.getText().toString());
            b = Double.parseDouble(val2.getText().toString());
            c = Double.parseDouble(val3.getText().toString());

            if (a == 0)
            {
                if (b == 0)
                {
                    if (c == 0)
                    {
                       sol1.setText("tout reel est solution");
                       sol2.setText("");
                    }
                    else
                    {// c different 0
                        sol1.setText("il n'y a pas de solution");
                        sol2.setText("");

                    }
                }
                else
                { // b different  0
                    x1 = (double) (-c / b);
                    sol1.setText("X1 ="+ x1);
                    sol2.setText(" ");

                }
            }
            else
            { // a  different 0
                delta = b * b - 4 * a * c;
                if (delta < 0)
                {
                   sol1.setText("il n'y a pas de solution dans les reels");
                   sol2.setText("");
                }
                else
                { // delta  >=  0
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    sol1.setText("X1 = "+x1);
                    sol2.setText("X2 = "+x2);
                }
            }




        } catch(Exception nfe) {
         /* AlertDialog.Builder hg = new AlertDialog.Builder(MainActivity4.this);
            hg.setCancelable(true);
            hg.setTitle(" veuillez entrer un nombre !!");*/
            String chaine ="veuillez entrer un nombre ";
            sol1.setText(chaine);
            sol2.setText("");
             Toast.makeText(MainActivity4.this, "Vous devez tapper un nombre", Toast.LENGTH_SHORT).show();

        }



    }}
