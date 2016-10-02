package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio12b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12b);

        TextView result = (TextView)findViewById(R.id.textView1Ej12);

        Intent anIntent = getIntent();

        StringBuilder aBuilder = new StringBuilder();
        aBuilder.append(anIntent.getStringExtra(Ejercicio12.NAME));
        aBuilder.append(" ");
        aBuilder.append(anIntent.getStringExtra(Ejercicio12.LASTNAME));

        result.setText(aBuilder.toString());
    }
}
