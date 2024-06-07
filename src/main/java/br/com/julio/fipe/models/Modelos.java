package br.com.julio.fipe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(
        //se o nome da varíavel é o mesmo do campo json não é necessário @JsonAlias
        List<Dados> modelos
) {}




