package br.com.julio.fipe.services;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
    <T> List<T> obterDadosLista(String json, Class<T> classe);
}
