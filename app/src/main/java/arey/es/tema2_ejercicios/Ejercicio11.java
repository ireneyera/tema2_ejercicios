package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio11);
    }

    public void call(View v) {
        Intent anIntent = new Intent(Intent.ACTION_DIAL);
        anIntent.setData(Uri.parse("tel:666555444"));
        startActivity(anIntent);
    }

    public void openGoogle(View v) {
        Intent anIntent = new Intent(Intent.ACTION_VIEW);
        anIntent.setData(Uri.parse("http://www.google.com"));
        startActivity(anIntent);
    }

    public void openMap(View v) {
        Intent anIntent = new Intent(Intent.ACTION_VIEW);
        anIntent.setData(Uri.parse("geo:41.44,0.56?z=8")); // El parámetro z indica la precisión del zoom.
        startActivity(anIntent);
    }

    public void sendMail(View v) {
        // Envío de un correo
        Intent anIntent = new Intent(Intent.ACTION_SEND);
        //anIntent.setType("message/rfc822"); // Sólo en un terminal real. Si no: anIntent.setType("text/plain")
        // Es posible indicar varias direcciones en el To, así que se deben incluir en un vector
        anIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"irene@gmail.com"});
        anIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo");
        anIntent.putExtra(Intent.EXTRA_TEXT, "Este es el texto del correo");
        startActivity(anIntent);
    }
}
