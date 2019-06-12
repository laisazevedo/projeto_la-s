package ifpi.projeto_Laís;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ifpi.projeto_Laís.adapters.ListagemAnunciosAdapter;
import ifpi.projeto_Laís.modelos.Anuncio;

public class ListagemAnunciosActivity extends AppCompatActivity {

    private RecyclerView rvAnuncios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_anuncios);

        rvAnuncios = findViewById(R.id.rv_anuncios);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListagemAnunciosAdapter adapter = new ListagemAnunciosAdapter(Anuncio.obterAnunciosFake(), this);

        rvAnuncios.setAdapter(adapter);

        rvAnuncios.setLayoutManager(new LinearLayoutManager(this));

    }
}








