package br.com.julio.fipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(
        @JsonAlias("codigo") String codigo,
        @JsonAlias("nome") String descricao
) {
    @Override
    public String toString() {
        return "Cod: " + codigo +
                " / Descricao: " + descricao;
    }
}
