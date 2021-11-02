package com.example.d25m10y21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {

    Country israel = new Country("israel","Jesusalem","Haticva",9000000,"Hebrew");
    Country italy = new Country("Italy","Rome","Il Canto degli Italiani",60359415,"italian");
    Country spin = new Country("spin","Madrid"," La Marcha Real",46775633,"Spanish");
    Country portugal = new Country("Portugal","lisbon","A Portuguesa",10162455,"Portuguese");
    Country usa = new Country("us","Washington","The Star-Spangled Banner",333236063,"English");
    Country britain = new Country("Britain","London","God Save the Queen",68296383,"English");
    Country egypt = new Country("Egypt","kahir","بلادي بلادي بلادي",104549910,"Arabic");
    String []countriesName = {israel.getName(),italy.getName(),spin.getName(),portugal.getName(),usa.getName(),britain.getName(),egypt.getName()};
    String [] capital = {israel.getCupital(),italy.getCupital(),spin.getCupital(),portugal.getCupital(),usa.getCupital(),britain.getCupital(),egypt.getCupital()};
    int[] logos = new int[7];

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        place_image(logos);
        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),countriesName,capital,logos);
        spinner.setAdapter(customadp);
        spinner.setOnItemSelectedListener(this);



    }
    public void place_image(int[]logos){
        logos[0] = R.drawable.israel;
        logos[1] = R.drawable.italy;
        logos[2] = R.drawable.spinf;
        logos[3] = R.drawable.portugal;
        logos[4] = R.drawable.usa;
        logos[5] = R.drawable.britan;
        logos[6] = R.drawable.egypt;

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}