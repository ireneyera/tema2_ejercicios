package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio3 extends AppCompatActivity {

    private int contador = 0;
    private static final String CONTADOR = "Contador: ";
    private TextView aTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        aTextView = (TextView)findViewById(R.id.textViewEj3);
        aTextView.setText(CONTADOR + " " + contador);
    }

    public void add(View v) {
        contador++;
        aTextView.setText(CONTADOR + " " + contador);
    }
}
