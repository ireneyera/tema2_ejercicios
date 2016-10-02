package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio13 extends AppCompatActivity {

    public static final String URL = "URL";
    private EditText anUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13);

        anUrl = (EditText)findViewById(R.id.editTextEj13);
    }

    public void clickWeb(View v) {
        Intent anIntent = new Intent(this, Ejercicio13a.class);
        anIntent.putExtra(URL, anUrl.getText().toString());
        startActivity(anIntent);
    }
}
