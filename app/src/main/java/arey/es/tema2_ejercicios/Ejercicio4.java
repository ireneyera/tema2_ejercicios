package arey.es.tema2_ejercicios;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ejercicio4 extends AppCompatActivity {

    public static final String TAG = "Ejercicio4";

    private EditText name;
    private EditText lastName;
    private EditText address;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        name = (EditText)findViewById(R.id.editTextNameEj4);
        lastName = (EditText)findViewById(R.id.editTextLastNameEj4);
        address = (EditText)findViewById(R.id.editTextAddressEj4);
        email = (EditText)findViewById(R.id.editTextEmailEj4);
    }

    public void check(View v) {


        if (name.getText().length() <= 3) {
            Log.i(TAG, "El nombre no tiene una longitud de más de tres letras");
        }

        String lastNameString = lastName.getText().toString();
        if ((lastNameString.length()<3) || (lastName.getText().toString().indexOf(" ") == -1)) {
            Log.i(TAG, "El apellido no está formado por dos palabras");
        }

        if (address.getText().length() <= 10) {
            Log.i(TAG, "La dirección no tiene una longitud de más de diez letras");
        }

        String emailString = email.getText().toString();
        int locationAt = emailString.indexOf("@");
        int locationDot = emailString.indexOf(".");
        // Longitud mínima de un email válido = 6 (a@a.es)
        if ((emailString.length()<6) || (locationAt == -1) || (locationDot == -1) || (locationAt > locationDot - 1) || (locationDot + 2 > emailString.length())) {
            Log.i(TAG, "El email no es correcto");
        }

    }
}
