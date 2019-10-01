package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity
{
    EditText input1, input2;
    Button hitung1, hitung2, hitung3;
    TextView hasil_kell, hasil_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText)findViewById(R.id.editText1);
        input2 = (EditText)findViewById(R.id.editText2);
        hitung1 = (Button)findViewById(R.id.persegi);
        hitung2 = (Button)findViewById(R.id.segitiga);
        hitung3 = (Button)findViewById(R.id.lingkaran);
        hasil_kell = (TextView)findViewById(R.id.hasil_keliling);
        hasil_luas = (TextView)findViewById(R.id.hasil_luas);
    }

    public void Persegi(View view)
    {
        Double ipt1 = Double.parseDouble(input1.getText().toString());
        Double ipt2 = Double.parseDouble(input2.getText().toString());
        Double kell = 2*(ipt1+ipt2);
        hasil_kell.setText(Double.toString(kell));
        Double luas = ipt1*ipt2;
        hasil_luas.setText(Double.toString(luas));
    }

    public void Segitiga(View view)
    {
        Double ipt1 = Double.parseDouble(input1.getText().toString());
        Double ipt2 = Double.parseDouble(input2.getText().toString());
        Double miring = sqrt((ipt1*ipt1)+(ipt2*ipt2));
        Double kell = ipt1 + ipt2 + miring;
        hasil_kell.setText(Double.toString(kell));
        Double luas = ipt1*ipt2*1/2;
        hasil_luas.setText(Double.toString(luas));
    }

    public void Lingkaran(View view)
    {
        Double ipt1 = Double.parseDouble(input1.getText().toString());
        Double kell = 3.14*ipt1;
        hasil_kell.setText(Double.toString(kell));
        Double luas = 3.14*ipt1*ipt1/4;
        hasil_luas.setText(Double.toString(luas));
    }

}
