package arey.es.tema2_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Los botones tienen asignado su valor en el atributo "tag"
 */
public class Ejercicio6 extends AppCompatActivity {

    // Valores asignados en el atributo tag a las operaciones
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;
    public static final int TOTAL = 5;
    public String[] operations = {"", "+", "-", "*", "/"};

    private TextView result;
    private int operatorNumber = 0; // Tres estados: 0 (poner vacío el resultado), 1 (estamos leyendo el 1er operando), 2 (estamos leyendo el 2do operando)
    private StringBuilder firstNumber = new StringBuilder();
    private StringBuilder secondNumber = new StringBuilder();
    private int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        result = (TextView)findViewById(R.id.resultEj6);
    }

    public void getOperando(View v) {
        String data = (String)v.getTag();
        if (operatorNumber == 0) {
            operatorNumber++;
            result.setText("");
        }
        if (operatorNumber == 1) {
            firstNumber.append(data);
        } else {
            secondNumber.append(data);
        }
        result.append(data);
    }

    public void getOperador(View v) {
        String data = (String)v.getTag();
        int auxOperation = Integer.parseInt(data);
        int aux = 0;
        if ((auxOperation == TOTAL) && (operatorNumber == 2)) {
            // Realizamos la operación
            int auxFirstNumber = Integer.parseInt(firstNumber.toString());
            int auxSecondNumber = Integer.parseInt(secondNumber.toString());

            switch (operation) {
                case SUMA: aux = auxFirstNumber + auxSecondNumber; break;
                case RESTA: aux = auxFirstNumber - auxSecondNumber; break;
                case MULTIPLICACION: aux = auxFirstNumber * auxSecondNumber; break;
                case DIVISION: if (auxSecondNumber != 0) {
                                    aux = auxFirstNumber / auxSecondNumber;
                                }
                                break;
            }
            result.append("=");
            result.append(String.valueOf(aux));

            // Inicializamos los valores para la siguiente operación
            operatorNumber = 0;
            firstNumber = new StringBuilder();
            secondNumber = new StringBuilder();
            operation = 0;

        } else if ((operatorNumber == 1) && (auxOperation != TOTAL) ) { // Guardamos la operación para cuando la realicemos
            operation = auxOperation;
            operatorNumber = 2; // A partir de ahora, es el segundo operador.
            result.append(operations[operation]); // Mostramos el símbolo de la operación
        } // Si recibimos '=' sin haber recibido el segundo operador, o una operación sin el primer operador, descartamos
    }
}
