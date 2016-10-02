package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Ejercicio14 extends AppCompatActivity {

    public static final String TAG = "Ejercicio14";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio14);
    }

    public void openActivity(View v) {
        String className = (String)v.getTag();

        try {
            Intent newIntent = new Intent(this, Class.forName(className));
            startActivity(newIntent);
        } catch (ClassNotFoundException e) {
            Log.i(TAG, "Activity no encontrada");
        }
    }
}
