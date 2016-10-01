package arey.es.tema2_ejercicios;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio5 extends AppCompatActivity {

    private static final int TOTALCOLORS = 4;

    private int currentColor;
    private Button myButton;
    private int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.WHITE, Color.BLACK};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        myButton = (Button)findViewById(R.id.buttonEj5);
        currentColor = 0;
        myButton.setBackgroundColor(colors[0]);

    }

    public void changeColor(View v) {
        currentColor = (currentColor == TOTALCOLORS) ? 0 : currentColor+1;
        myButton.setBackgroundColor(colors[currentColor]);
    }
}
