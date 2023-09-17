package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener , AdapterView.OnItemClickListener {

    ListView lv;
    TextView tx1,tx2,tx3,tx4;
    Spinner spin;

    String [] continents={"Asia","Europe","Africa","Australia","North_America","South_America","Antarctica"};
    String[] Asia = {"Israel","India","China","Indonesia","Japan","South Korea","Nepal"};
    String[] Europe = {"Germany","France","Italy","Poland","Ukraine","Romania","Belgium"};
    String[] Africa = {"Nigeria","Kenya","Algeria","Sudan","Uganda","South Africa","Morocco"};
    String[] Australia = {"Australia","Fiji","Kiribati","New Zealand","Palau","Papua New Guinea","Tonga"};
    String[] North_America = {"U.S.A.","Mexico","Canada","Guatemala","Cuba","Panama","Jamaica"};
    String[] South_America = {"Brazil","Colombia","Argentina","Peru","Chile","Ecuador","Bolivia"};
    String[] Antarctica = {"Argentina","Australia","Chile","France","Norway","United Kingdom","New Zealand"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1=findViewById(R.id.textView);
        tx2=findViewById(R.id.textView2);
        tx3=findViewById(R.id.textView3);
        tx4=findViewById(R.id.textView4);
        lv =findViewById(R.id.listview);
        lv.setOnItemClickListener(this);


        spin=findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,continents);
        spin.setAdapter(adp);
    }

    @Override
    public void onItemSelected(AdapterView<?> perent, View view, int pos, long rowid) {//spinner
//        tx1.setText("position: "+pos+" row id: "+rowid+"\n- "+town[pos]);
        ArrayAdapter<String> adapter1;
        if(spin.getSelectedItem().toString().equals("Asia")){
            adapter1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Asia);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("Europe")){
            adapter1=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Europe);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("Africa")){
            adapter1=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Africa);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("Australia")){
            adapter1=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Australia);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("North_America")){
            adapter1=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,North_America);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("South_America")){
            adapter1=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,South_America);
            lv.setAdapter(adapter1);
        }
        else if(spin.getSelectedItem().toString().equals("Antarctica")){
            adapter1=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Antarctica);
            lv.setAdapter(adapter1);
        }
//        tx3.setText(spin.getSelectedItem().toString());
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //listview
//        tx2.setText((String) lv.getItemAtPosition(i));
        if(spin.getSelectedItem().toString().equals("Asia")){
            if(lv.getItemAtPosition(i).equals("Israel")){
                tx1.setText("Jerusalem");
                tx2.setText("9.364 million");
                tx3.setText("Hebrew");
                tx4.setText("Hatikvah");
            }
            else if(lv.getItemAtPosition(i).equals("India")){
                tx1.setText("New Delhi");
                tx2.setText("1.408 billion");
                tx3.setText("Hindi");
                tx4.setText("Jana Gana Mana");
            }
            else if(lv.getItemAtPosition(i).equals("China")){
                tx1.setText("Beijing");
                tx2.setText("1.412 billion");
                tx3.setText("Mandarin");
                tx4.setText("March of the Volunteers");
            }
            else if(lv.getItemAtPosition(i).equals("Indonesia")){
                tx1.setText("Jakarta");
                tx2.setText("273.8 million");
                tx3.setText("Indonesian");
                tx4.setText("Indonesia Raya");
            }
            else if(lv.getItemAtPosition(i).equals("Japan")){
                tx1.setText("Tokyo");
                tx2.setText("125.7 million");
                tx3.setText("Japanese");
                tx4.setText("Kimigayo");
            }
            else if(lv.getItemAtPosition(i).equals("South Korea")){
                tx1.setText("Seoul");
                tx2.setText("51.74 million");
                tx3.setText("Korean");
                tx4.setText("Aegukga");
            }
            else if(lv.getItemAtPosition(i).equals("Nepal")){
                tx1.setText("Kathmandu");
                tx2.setText("30.03 million");
                tx3.setText("Nepali");
                tx4.setText("Sayaun Thunga Phulka");
            }
        }


        if(spin.getSelectedItem().toString().equals("Europe")){
            if(lv.getItemAtPosition(i).equals("Germany")){
                tx1.setText("Berlin");
                tx2.setText("83.2 million");
                tx3.setText("German");
                tx4.setText("Deutschlandlied");
            }
            else if(lv.getItemAtPosition(i).equals("France")){
                tx1.setText("Paris");
                tx2.setText("67.75 million");
                tx3.setText("French");
                tx4.setText("Lyrics");
            }
            else if(lv.getItemAtPosition(i).equals("Italy")){
                tx1.setText("Rome");
                tx2.setText("59.11 million");
                tx3.setText("Italian");
                tx4.setText("Il Canto degli Italiani");
            }
            else if(lv.getItemAtPosition(i).equals("Poland")){
                tx1.setText("Warsaw");
                tx2.setText("37.75 million");
                tx3.setText("Polish");
                tx4.setText("Mazurek Dąbrowskiego");
            }
            else if(lv.getItemAtPosition(i).equals("Ukraine")){
                tx1.setText("Kyiv");
                tx2.setText("43.79 million");
                tx3.setText("Ukrainian");
                tx4.setText("Shche ne vmerla Ukrainy i slava, i volia");
            }
            else if(lv.getItemAtPosition(i).equals("Romania")){
                tx1.setText("Bucharest");
                tx2.setText("19.12 million");
                tx3.setText("Romanian ");
                tx4.setText("Deșteaptă-te, române!");
            }
            else if(lv.getItemAtPosition(i).equals("Belgium")){
                tx1.setText("Brussels");
                tx2.setText("11.59 million ");
                tx3.setText("Dutch (Flemish), French, and German");
                tx4.setText("La Brabançonne");
            }
        }

        if(spin.getSelectedItem().toString().equals("Africa")){
            if(lv.getItemAtPosition(i).equals("Nigeria")){
                tx1.setText("Abuja");
                tx2.setText("213.4 million");
                tx3.setText("English");
                tx4.setText("Arise, O Compatriots");
            }
            else if(lv.getItemAtPosition(i).equals("Kenya")){
                tx1.setText("Nairobi");
                tx2.setText("53.01 million");
                tx3.setText("Swahili,English");
                tx4.setText("Ee Mungu Nguvu Yetu");
            }
            else if(lv.getItemAtPosition(i).equals("Algeria")){
                tx1.setText("Algiers");
                tx2.setText("44.18 million");
                tx3.setText("Arabic,Tamazight");
                tx4.setText("Kassaman");
            }
            else if(lv.getItemAtPosition(i).equals("Sudan")){
                tx1.setText("Khartoum");
                tx2.setText("45.66 million");
                tx3.setText("Arabic,English,Nobiin language");
                tx4.setText("Nahnu Jund Allah Jund Al-watan");
            }
            else if(lv.getItemAtPosition(i).equals("Uganda")){
                tx1.setText("Kampala");
                tx2.setText("45.85 million");
                tx3.setText("Swahili,English");
                tx4.setText("Oh Uganda, Land of Beauty");
            }
            else if(lv.getItemAtPosition(i).equals("South Africa")){
                tx1.setText("Cape Town,Bloemfontein,Pretoria");
                tx2.setText("59.39 million");
                tx3.setText("Sepedi, Sesotho, Setswana...");
                tx4.setText("Die Stem van Suid-Afrika");
            }
            else if(lv.getItemAtPosition(i).equals("Morocco")){
                tx1.setText("Rabat");
                tx2.setText("37.08 million");
                tx3.setText("Arabic,Moroccan");
                tx4.setText("Cherifian Anthem");
            }
        }

        if(spin.getSelectedItem().toString().equals("Australia")){
            if(lv.getItemAtPosition(i).equals("Australia")){
                tx1.setText("Canberra");
                tx2.setText("25.69 million");
                tx3.setText("English");
                tx4.setText("Advance Australia Fair");
            }
            else if(lv.getItemAtPosition(i).equals("Fiji")){
                tx1.setText("Suva");
                tx2.setText("924,610");
                tx3.setText("Fijian,English,Fiji Hindi");
                tx4.setText("Meda Dau Doka");
            }
            else if(lv.getItemAtPosition(i).equals("Kiribati")){
                tx1.setText("Tarawa");
                tx2.setText("128,874");
                tx3.setText("English");
                tx4.setText("Ioteba Tamuera Uriam");
            }
            else if(lv.getItemAtPosition(i).equals("New Zealand")){
                tx1.setText("Wellington");
                tx2.setText("5.123 million");
                tx3.setText("Māori,English");
                tx4.setText("God Defend New Zealand");
            }
            else if(lv.getItemAtPosition(i).equals("Palau")){
                tx1.setText("Ngerulmud");
                tx2.setText("18,024 ");
                tx3.setText("Palauan,English");
                tx4.setText("Belau rekid");
            }
            else if(lv.getItemAtPosition(i).equals("Papua New Guinea")){
                tx1.setText("Port Moresby");
                tx2.setText("9.949 million");
                tx3.setText("Tok Pisin,English,Hiri Motu");
                tx4.setText("O Arise, All You Sons");
            }
            else if(lv.getItemAtPosition(i).equals("Tonga")){
                tx1.setText("Nuku'alofa");
                tx2.setText("106,017");
                tx3.setText("Tongan,English");
                tx4.setText("Ko e fasi ʻo e tuʻi ʻo e ʻOtu Tonga");
            }
        }

        if(spin.getSelectedItem().toString().equals("North_America")){
            if(lv.getItemAtPosition(i).equals("U.S.A.")){
                tx1.setText("Washington, D.C.");
                tx2.setText("331.9 million");
                tx3.setText("English");
                tx4.setText("The Star-Spangled Banner");
            }
            else if(lv.getItemAtPosition(i).equals("Mexico")){
                tx1.setText("Mexico City");
                tx2.setText("126.7 million");
                tx3.setText("Spanish");
                tx4.setText("Mexican National Anthem");
            }
            else if(lv.getItemAtPosition(i).equals("Canada")){
                tx1.setText("Ottawa");
                tx2.setText("38.25 million");
                tx3.setText("French,English");
                tx4.setText("O Canada");
            }
            else if(lv.getItemAtPosition(i).equals("Guatemala")){
                tx1.setText("Guatemala City");
                tx2.setText("17.11 million");
                tx3.setText("Spanish");
                tx4.setText("Himno Nacional de Guatemala");
            }
            else if(lv.getItemAtPosition(i).equals("Cuba")){
                tx1.setText("Havana");
                tx2.setText("11.26 million");
                tx3.setText("Spanish");
                tx4.setText("El Himno de Bayamo");
            }
            else if(lv.getItemAtPosition(i).equals("Panama")){
                tx1.setText("Panama City");
                tx2.setText("4.351 million");
                tx3.setText("Spanish");
                tx4.setText("Himno Istmeño");
            }
            else if(lv.getItemAtPosition(i).equals("Jamaica")){
                tx1.setText("Kingston");
                tx2.setText("2.828 million");
                tx3.setText("English");
                tx4.setText("Jamaica, Land We Love");
            }
        }

        if(spin.getSelectedItem().toString().equals("South_America")){
            if(lv.getItemAtPosition(i).equals("Brazil")){
                tx1.setText("Brasília");
                tx2.setText("214.3 million");
                tx3.setText("Portuguese");
                tx4.setText("Brazilian National Anthem");
            }
            else if(lv.getItemAtPosition(i).equals("Colombia")){
                tx1.setText("Bogotá");
                tx2.setText("51.52 million");
                tx3.setText("Spanish");
                tx4.setText("National Anthem of the Republic of Colombia");
            }
            else if(lv.getItemAtPosition(i).equals("Argentina")){
                tx1.setText("Buenos Aires");
                tx2.setText("45.81 million");
                tx3.setText("Spanish");
                tx4.setText("Argentine National Anthem");
            }
            else if(lv.getItemAtPosition(i).equals("Peru")){
                tx1.setText("Lima");
                tx2.setText("33.72 million");
                tx3.setText("Spanish");
                tx4.setText("Himno Nacional del Perú");
            }
            else if(lv.getItemAtPosition(i).equals("Chile")){
                tx1.setText("Santiago");
                tx2.setText("19.49 million");
                tx3.setText("Spanish");
                tx4.setText("Canción Nacional");
            }
            else if(lv.getItemAtPosition(i).equals("Ecuador")){
                tx1.setText("Quito");
                tx2.setText("17.8 million");
                tx3.setText("Spanish");
                tx4.setText("¡Salve, Oh Patria!");
            }
            else if(lv.getItemAtPosition(i).equals("Bolivia")){
                tx1.setText("La Paz");
                tx2.setText("12.08 million");
                tx3.setText("Aymara, Quechua, Chiquitano...");
                tx4.setText("Bolivianos, el Hado Propicio");
            }
        }

        if(spin.getSelectedItem().toString().equals("Antarctica")){
            if(lv.getItemAtPosition(i).equals("UK")){
                tx1.setText("London");
                tx2.setText("67.33 million");
                tx3.setText("Spanish");
                tx4.setText("God Save The Queen");
            }
            else if(lv.getItemAtPosition(i).equals("Australia")){
                tx1.setText("Canberra");
                tx2.setText("25.69 million");
                tx3.setText("there is no official language in Australia");
                tx4.setText("Advance Australia Fair");
            }
            else if(lv.getItemAtPosition(i).equals("Chile")){
                tx1.setText("Santiago");
                tx2.setText("19.49 million");
                tx3.setText("Spanish");
                tx4.setText("Canción Nacional");
            }
            else if(lv.getItemAtPosition(i).equals("France")){
                tx1.setText("Paris");
                tx2.setText("67.75 million");
                tx3.setText("French");
                tx4.setText("La Marseillaise");
            }
            else if(lv.getItemAtPosition(i).equals("Norway")){
                tx1.setText("Oslo");
                tx2.setText("5.408 million");
                tx3.setText("Norwegian");
                tx4.setText("Ja, vi elsker dette landet");
            }
            else if(lv.getItemAtPosition(i).equals("United Kingdom")){
                tx1.setText("London");
                tx2.setText("67.33 million");
                tx3.setText("English");
                tx4.setText("God Save the King");
            }
            else if(lv.getItemAtPosition(i).equals("New Zealand")){
                tx1.setText("Wellington");
                tx2.setText("5.123 million");
                tx3.setText("English,Māori");
                tx4.setText("God Defend New Zealand");
            }
        }
    }
}
