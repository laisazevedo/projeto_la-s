package ifpi.projeto_Laís.modelos;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {

    private String titulo;
    private String descricao;
    private double valor;
    private String bairro;
    private String dataPublicacao;

    public Anuncio(String titulo, String descricao, double valor, String bairro, String dataPublicacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.bairro = bairro;
        this.dataPublicacao = dataPublicacao;
    }

    public static List<Anuncio> obterAnunciosFake(){
        List<Anuncio> anuncios = new ArrayList<>();

        Anuncio a = new Anuncio("Bolsas de Couro",
                "Excelente Kit bolsas femininas Luxo",
                700, "Maravilha", "26/Maio/2019");
        Anuncio b = new Anuncio("Bolsa Com Chaveiro",
                "Bolsa rosa com chaveiro de Ursinho . Em otimo estado",
                200, "Boca de Barro", "23/Fevereiro/2019");

        anuncios.add(a);
        anuncios.add(a);
        anuncios.add(a);
        anuncios.add(b);
        anuncios.add(b);

        return anuncios;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
