package arey.es.tema2_ejercicios;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio13a extends AppCompatActivity {

    private TextView aTextView;
    private String receivedURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13a);

        aTextView = (TextView)findViewById(R.id.textView1Ej13);
        Intent receivedData = getIntent();
        receivedURL = receivedData.getStringExtra(Ejercicio13.URL);
        aTextView.setText(receivedURL);
    }

    public void openWeb(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(Uri.parse(receivedURL));
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void goBack(View v) {
        finish();
    }
}
