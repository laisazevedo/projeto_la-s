package ifpi.projeto_Laís;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ifpi.projeto_Laís.adapters.ComidasAdapter;
import ifpi.projeto_Laís.modelos.Comida;

public class ListaComidasActivity extends AppCompatActivity {

    private RecyclerView rvComidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_comidas);

        rvComidas = findViewById(R.id.rv_comidas);

        atualizarViews();
    }

    private void atualizarViews() {
        ComidasAdapter adapter = new ComidasAdapter(this, Comida.getComidas());

        rvComidas.setAdapter(adapter);

        rvComidas.setLayoutManager(new LinearLayoutManager(this));

    }


}
