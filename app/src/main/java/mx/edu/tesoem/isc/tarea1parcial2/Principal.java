package mx.edu.tesoem.isc.tarea1parcial2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal extends AppCompatActivity {

    ImageView imagen;
    Spinner splista;
    List<String> MiLista = new ArrayList<>(Arrays.asList("Durango", "Chihuahua", "Jalisco", "Nayarit", "Zacatecas", "Puebla", "Estado de México"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        imagen = findViewById(R.id.imagen);
        splista = findViewById(R.id.splista);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MiLista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(Principal.this, "Se seleccionó: " + valor, Toast.LENGTH_SHORT).show();

                switch (valor) {
                    case "Chihuahua":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1xpyJjrFNVlFYSDHzByAG5vqf_wgIEKj2").into(imagen);
                        break;
                    case "Durango":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1tAngVtIrQgbLq3zlSYbFI3GD9ZXOadIQ").into(imagen);
                        break;
                    case "Estado de México":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1qSmZCxyvcsjlb5QAgk67tKG6QxXSFVu1").into(imagen);
                        break;
                    case "Jalisco":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1UwrJlaY2we8uW8NNZLcxH9QW-KCD242C").into(imagen);
                        break;
                    case "Nayarit":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1g9Se359WDAkwqztKdK5F2L55behV5VrJ").into(imagen);
                        break;
                    case "Puebla":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1MWIrxIovwTqaYvMWK7Hlj013b55oDJcp").into(imagen);
                        break;
                    case "Tamaulipas":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=109O8oGM032LDXXV9KyRiHgvBkxwZS3Jn").into(imagen);
                        break;
                    case "Zacatecas":
                        Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1mLRvu0HQCIWoWmMbJHw1XlRFXZW61xLI").into(imagen);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}