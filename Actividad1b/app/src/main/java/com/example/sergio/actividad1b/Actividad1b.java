package com.example.sergio.actividad1b;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad1b extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1b);

        // Defino el botón btContador que hace referencia al btCont creado en el diseño
        Button btContador = (Button) findViewById(R.id.btCont);

        // Defino la función que va a realizar la acción en nuestro botón
        btContador.setOnClickListener(new View.OnClickListener() { // Hacemos click en el botón y...
            // Defino el TextView que hace referencia a nuestro "textocontador" que modificaremos mas adelante
            TextView textoContView = (TextView) findViewById(R.id.textocontador);
            // Defino e inicio un "contador" a 0
            int contador = 0;
            // Añado la funcionalidad al click del botón
            public void onClick(View v){
                contador++; // Sumo 1 en cada click
                textoContView.setText("Contador: " + contador); // Añado el contador y lo sumo a nuestro "textocontador"
            }
        });

    }

}
