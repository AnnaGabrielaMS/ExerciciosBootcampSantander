package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    private final String NOME_PLATAFORMA = "DIO";
    private static List<Bootcamp> listaBootcamps;

    public Plataforma() {
        this.listaBootcamps = new ArrayList<>();
    }

    public String getNOME_PLATAFORMA() {
        return NOME_PLATAFORMA;
    }

    public List<Bootcamp> getListaBootcamps() {
        return listaBootcamps;
    }

    public void setListaBootcamps(List<Bootcamp> listaBootcamps) {
        this.listaBootcamps = listaBootcamps;
    }

    public static void adicionarBootcamp(Bootcamp bootcamp) {
        listaBootcamps.add(bootcamp);
    }

    public void removerBootcamp(Bootcamp bootcamp) {
        listaBootcamps.remove(bootcamp);
    }

    public int quantidadeDeBootcamp() {
        return listaBootcamps.size();
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "NOME_PLATAFORMA='" + NOME_PLATAFORMA + '\'' +
                '}';
    }
}
