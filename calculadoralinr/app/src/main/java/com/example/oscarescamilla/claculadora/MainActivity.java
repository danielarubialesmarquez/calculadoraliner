package com.example.oscarescamilla.claculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText et_numero1;
    public EditText et_numero2;
    public EditText et_resultado;

    public Double num1 = 0.0;
    public Double num2 = 0.0;
    public Double resultado = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }


    public void initComponents(){

        et_numero1 = (EditText) findViewById(R.id.et_numero1);
        et_numero2 = (EditText) findViewById(R.id.et_numero2);
        et_resultado = (EditText) findViewById(R.id.et_resultado);
    }

    private void valuesCasting(){
        num1 = Double.parseDouble(et_numero1.getText().toString());
        num2 = Double.parseDouble(et_numero2.getText().toString());
    }

    public void sumaonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 + num2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error suma:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }

    }

    public void restaonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 - num2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error resta:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }

    }

    public void multiplicaciononClick(View view) {
        try{
            valuesCasting();
            resultado = num1 * num2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error multi:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }

    }

    public void divisiononClick(View view) {
        try{
            valuesCasting();
            resultado = num1 / num2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error div:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }

    }

    public void moduloonClick(View view) {
        try{
            valuesCasting();
            resultado = num1 % num2;
            et_resultado.setText(String.valueOf(resultado));
        }catch (Exception e){
            Log.e("Error mod:", "Message " + e.getMessage());
            et_resultado.setText("Error");
        }

    }
}
