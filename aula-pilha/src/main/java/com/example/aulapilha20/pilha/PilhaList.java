package com.example.aulapilha20.pilha;

import java.util.ArrayList;
import java.util.List;

public class PilhaList {

    private List<Object> pratos;

    public PilhaList() {
        this.pratos = new ArrayList<>();
    }

    public void empilhar(Object prato) {
        pratos.add(prato);
    }

    public Object desempilhar() {
        if (!pratos.isEmpty()) {
            return pratos.remove(pratos.size() - 1);
        } else {
            System.out.println("Pilha vazia!");
            return null;
        }
    }

    public void lista() {
        for (Object prato : pratos) {
            System.out.println(prato);
        }
    }

    public int quantidadeDePratos() {
        return pratos.size();
    }

    public void remover(int posicao) {
        if (posicao >= 0 && posicao < pratos.size()) {
            pratos.remove(posicao);
        } else {
            System.out.println("Posição inválida!");
        }
    }
}