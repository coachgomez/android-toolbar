package com.example.aplicacionpractica;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button ACTIVIDAD_1;
    Button ACTIBIDAD_2;
    Button ACTIBIDAD_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ACTIVIDAD_1 = (Button) findViewById(R.id.button);
        ACTIBIDAD_2 = (Button) findViewById(R.id.button2);
        ACTIBIDAD_3 = (Button) findViewById(R.id.button3);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        ACTIVIDAD_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Usuario", "Gomez Mauricio");
                startActivity(i);
            }
        });

        ACTIBIDAD_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, MainActivity3.class);
                j.putExtra("Usuario", "Gomez Mauricio");
                startActivity(j);
            }
        });

        ACTIBIDAD_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(MainActivity.this, MainActivity3.class);
                z.putExtra("Usuario", "Gomez Mauricio");
                startActivity(z);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onCreateOptionsSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1){
            Toast.makeText(getApplicationContext(), "option1", Toast.LENGTH_SHORT).show();
            String a = "algo";
            return true;
        }
        if (id == R.id.opcion2) {
            finish();
            return true;
        }
        if (id == R.id.opcion3){
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //nro1 =findViewById(R.id.etNro1);
        //nro2 =findViewById(R.id.etNro2);

        Toolbar Toolbar =findViewById(R.id.myToolbar);
        setSupportActionBar(Toolbar);
        getActionBar().setTitle("");
        }

        /*public Void open2(View view) {
        Intent i=new Intent(MainActivity.this, MainActivity.class)
        i.putExtra("nro1",nro1.getText(),tosString().isEmpity()?1:int*/
    }


