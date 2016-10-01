package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Ejercicio7 extends AppCompatActivity {

    private ToggleButton aToggleButton;
    private EditText anEditText;
    private Button aButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        aToggleButton = (ToggleButton)findViewById(R.id.toggleButtonEj7);
        anEditText = (EditText)findViewById(R.id.editTextEj7);
        aButton = (Button)findViewById(R.id.buttonEj7);
    }

    public void checkToggle(View v) {

        if (aToggleButton.isChecked()) {
            anEditText.setEnabled(false);
            aButton.setEnabled(false);
        } else {
            anEditText.setEnabled(true);
            aButton.setEnabled(true);
        }
    }
}
