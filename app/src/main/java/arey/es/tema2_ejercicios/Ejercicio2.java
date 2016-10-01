package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    public static final String TAG = "Ejercicio2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        TextView textView2 = (TextView)findViewById(R.id.textViewEj2);
        textView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i(TAG, "Se ha tocado la etiqueta");
                return true;
            }
        });

    }
}
