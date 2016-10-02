package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Ejercicio10 extends AppCompatActivity {

    public static final String TAG = "Ejercicio10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);
        Log.i(TAG, "onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    public void call(View v) {
        Intent anIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(anIntent);
    }
}
