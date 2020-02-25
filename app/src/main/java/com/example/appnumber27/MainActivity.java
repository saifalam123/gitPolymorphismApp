package com.example.appnumber27;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtAnimal = (TextView)findViewById(R.id.txtAnimal);
        TextView txtLion = (TextView)findViewById(R.id.txtLion);
        TextView txtPolymorphism = (TextView)findViewById(R.id.txtPolymorphism);

        Animal myAnimal = new Animal("Beer" , "Black" , -1 , -1);
        Lion myLion = new Lion("Lion" ,"Yellow" , -1 , -1 , true , 170);

        txtAnimal.setText(myAnimal.toString());
        txtLion.setText(myLion.toString());

        // txtAnimal.setText(myAnimal.toString()); is different from txtAnimal.setText(myAnimal + toString()); kyun kay phele wala ka matlab hai kay tostring method ko call karo jo kay myAnimal object ki class Animal main hai or dosre wala ka matlab hai kay usko string main convert kardou


        // Polymorphism
        Animal myAnimal1 = myLion;
        txtPolymorphism.setText(myAnimal1.toString()); /* It will call the to string method which is inside the myLion class because the object "Myanimal1" is equal to mylion object
         and we call the MyAnimal1.toString() method so it will call the method inside the Lion class*/


    }


}
