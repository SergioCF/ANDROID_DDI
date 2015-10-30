package com.example.sergio.actividad1f;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText del cual se obtiene la url
        final EditText url = (EditText) findViewById(R.id.url);
        // Boton de acción que ejecutara la busqueda
        final  Button btBuscar = (Button) findViewById(R.id.btBuscar);
        // Widget webView
        final WebView webView = (WebView) this.findViewById(R.id.webView);

        // BOTON:
        // AL HACER CLICK:
        btBuscar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Cargará la vista webView con la url proporcionada
                webView.loadUrl(String.valueOf(url.getText()));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
