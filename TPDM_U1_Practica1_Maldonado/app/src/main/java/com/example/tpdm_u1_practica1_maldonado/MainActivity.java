package com.example.tpdm_u1_practica1_maldonado;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Spinner year;
    RadioGroup se;
    CheckBox estu;
    ToggleButton color;
    Button conf;
    TextView res;
    RadioButton rdbtn;
    String nini;
    String tal;
    TextView happy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        year=findViewById(R.id.year);
        se = findViewById(R.id.sex);
        estu = findViewById(R.id.est);
        color = findViewById(R.id.color);
        conf = findViewById(R.id.conf);
        res = findViewById(R.id.res);
        happy = findViewById(R.id.happy);

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdbtn = (RadioButton) findViewById(se.getCheckedRadioButtonId());


                if(estu.isChecked()){
                    nini= "Estudiante";
                }else{
                    nini = "nini";}

                if(rdbtn.getText().equals("Hombre")){
                    tal = "Eres un "+nini+" Muy Talentoso";}
                else{
                    tal="Eres una "+nini+" Muy Talentosa";}

                res.setText("Hola "+ nombre.getText().toString()+" Tu edad es aproximadamente "+(2019-Integer.parseInt(year.getSelectedItem().toString())) +"\n"+
                        tal);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(color.isChecked()){
                res.setBackgroundColor(Color.parseColor("#AABBCC"));
                happy.setText(":D");}

                else {
                    res.setBackgroundColor(Color.parseColor("#000000"));
                    happy.setText(":C");
                }
            }
        });


    }
}
