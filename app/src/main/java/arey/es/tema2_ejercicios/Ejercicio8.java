package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Ejercicio8 extends AppCompatActivity {

    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private TextView aTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        check1 = (CheckBox)findViewById(R.id.checkBox1Ej8);
        check2 = (CheckBox)findViewById(R.id.checkBox2Ej8);
        check3 = (CheckBox)findViewById(R.id.checkBox3Ej8);
        aTextView = (TextView)findViewById(R.id.textViewEj8);
    }

    public void printStudies(View v) {
        StringBuilder result = new StringBuilder();
        result.append(getResources().getString(R.string.resultEj8));

        if (check1.isChecked()) {
            result.append(check1.getText());
            result.append(" ");
        }
        if (check2.isChecked()) {
            result.append(check2.getText());
            result.append(" ");
        }
        if (check3.isChecked()) {
            result.append(check3.getText());
            result.append(" ");
        }
        aTextView.setText(result.toString());
    }
}
