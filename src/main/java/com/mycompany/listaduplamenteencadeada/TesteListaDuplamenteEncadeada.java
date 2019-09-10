/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listaduplamenteencadeada;

/**
 *
 * @author Estudante
 */
public class TesteListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        //lista.add(10);
        //lista.add(18);
        lista.add(20);
        System.out.println(lista.get(108));
        lista.remover(20);
        lista.listar();
    }
}
