package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio12 extends AppCompatActivity {

    private EditText aName;
    private EditText aLastName;

    public static final String NAME = "NAME";
    public static final String LASTNAME = "LASTNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12);

        aName = (EditText)findViewById(R.id.editText1Ej12);
        aLastName = (EditText)findViewById(R.id.editText2Ej12);
    }

    public void callHelloWorldActivity(View v) {
        String dataName = aName.getText().toString();
        String dataLastName = aLastName.getText().toString();
        if ((dataName != null) && (dataName.length() > 0) && (dataLastName != null) && (dataLastName.length() > 0)) {
            // Al heredar Activity de Context, podemos obtener el contexto con "this"
            Intent anIntent = new Intent(this, Ejercicio12b.class);

            anIntent.putExtra(NAME, dataName);
            anIntent.putExtra(LASTNAME, dataLastName);

            startActivity(anIntent);
        }
    }
}
