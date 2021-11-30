package com.example.d25m10y21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {

    Country israel = new Country("israel","Jesusalem","Haticva",9000000,"Hebrew");
    Country italy = new Country("Italy","Rome","Il Canto degli Italiani",60359415,"italian");
    Country spin = new Country("spin","Madrid"," La Marcha Real",46775633,"Spanish");
    Country portugal = new Country("Portugal","lisbon","A Portuguesa",10162455,"Portuguese");
    Country usa = new Country("usa","Washington","The Star-Spangled Banner",333236063,"English");
    Country britain = new Country("Britain","London","God Save the Queen",68296383,"English");
    Country egypt = new Country("Egypt","kahir","بلادي بلادي بلادي",104549910,"Arabic");
    String []countriesName = {israel.getName(),italy.getName(),spin.getName(),portugal.getName(),usa.getName(),britain.getName(),egypt.getName()};
    String [] capital = {israel.getCupital(),italy.getCupital(),spin.getCupital(),portugal.getCupital(),usa.getCupital(),britain.getCupital(),egypt.getCupital()};
    String[]info;
    int[] logos = new int[7];

    Spinner spinner;
    TextView countryNamet,mainCity,mainSong,populationt,languages;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        countryNamet = (TextView) findViewById(R.id.textView);
        mainCity = (TextView) findViewById(R.id.textView2);
        mainSong = (TextView) findViewById(R.id.textView3);
        populationt = (TextView) findViewById(R.id.textView4);
        languages = (TextView) findViewById(R.id.textView5);



        place_image(logos);

        spinner.setOnItemSelectedListener(this);
        CustomAdapter customadp = new CustomAdapter(this,countriesName,capital,logos);
        spinner.setAdapter(customadp);



    }
    public void place_image(int[] logos){
        logos[0] = R.drawable.israel;
        logos[1] = R.drawable.italy;
        logos[2] = R.drawable.spinf;
        logos[3] = R.drawable.portugal1;
        logos[4] = R.drawable.usa;
        logos[5] = R.drawable.britan;
        logos[6] = R.drawable.egypt1;

    }
    public void placeInfo(int index){
        if (index == 0){
            info = israel.getInfo();
        }
        else if(index == 1){
            info = italy.getInfo();
        }
        else if(index == 2){
            info = spin.getInfo();
        }
        else if(index == 3){
            info = portugal.getInfo();
        }
        else if(index == 4){
            info = usa.getInfo();
        }
        else if(index == 5){
            info = britain.getInfo();
        }else{
            info = egypt.getInfo();
        }

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        placeInfo(position);
        countryNamet.setText("name: "+info[0]);
        mainCity.setText("capital city: "+info[1]);
        mainSong.setText("national anthem: "+info[2]);
        populationt.setText("population: "+info[3]);
        languages.setText("language: "+info[4]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
