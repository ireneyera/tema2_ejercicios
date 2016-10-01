package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Ejercicio9 extends AppCompatActivity {

    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private TextView aTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        radio1 = (RadioButton)findViewById(R.id.radioButton1Ej9);
        radio2 = (RadioButton)findViewById(R.id.radioButton2Ej9);
        radio3 = (RadioButton)findViewById(R.id.radioButton3Ej9);
        aTextView = (TextView)findViewById(R.id.textViewEj9);
    }

    public void printStudies(View v) {
        StringBuilder aBuilder = new StringBuilder(getResources().getString(R.string.resultEj8));
        if (radio1.isChecked()) {
            aBuilder.append(radio1.getText());
            aBuilder.append(" ");
        } // Debería ser if-else por eficiente, pero incluimos únicamente un if para que se verifique que la exclusión con el radioButton se ha realizado
        if (radio2.isChecked()) {
            aBuilder.append(radio2.getText());
            aBuilder.append(" ");
        }
        if (radio3.isChecked()) {
            aBuilder.append(radio3.getText());
            aBuilder.append(" ");
        }
        aTextView.setText(aBuilder.toString());
    }
}
