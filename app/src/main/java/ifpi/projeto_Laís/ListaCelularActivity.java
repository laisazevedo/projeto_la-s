package ifpi.projeto_Laís;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ifpi.projeto_Laís.adapters.CelularAdapter;
import ifpi.projeto_Laís.modelos.Celular;

public class ListaCelularActivity extends AppCompatActivity {

    RecyclerView rvCelulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_celular);

        rvCelulares = findViewById(R.id.rv_celulares);
    }

    @Override
    protected void onResume() {
        super.onResume();
        obterCelulares();
    }

    private void obterCelulares() {
        List<Celular> celulars = Celular.getCelulares();

        CelularAdapter adapter = new CelularAdapter(celulars, this);
        rvCelulares.setAdapter(adapter);

        rvCelulares.setLayoutManager(new LinearLayoutManager(this));


    }
}
