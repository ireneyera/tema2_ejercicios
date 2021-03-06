package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    public static final String TAG = "Ejercicio1";

    private TextView firstTextView;
    private TextView secondTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        firstTextView = (TextView)findViewById(R.id.firstTextViewEj1);
        secondTextView = (TextView)findViewById(R.id.secondTextViewEj1);
    }

    public void compareObjects(View v) {


        String resultFirstTextView = firstTextView.equals(v) ? " " : " NO ";
        Log.i(TAG, "El primer TextView" + resultFirstTextView + "es igual que el parámetro View");

        String resultSecondTextView = secondTextView.equals(v) ? " " : " NO ";
        Log.i(TAG, "El segundo TextView" + resultSecondTextView + "es igual que el parámetro View");

    }
}
