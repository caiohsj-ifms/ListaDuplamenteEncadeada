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

public class ListaDuplamenteEncadeada {
    private int tamanho=0;
    public No raiz=null;
            
    public int size(){
        return tamanho;
    }
    
    public void add(int elemento){
        No no = new No();
        no.setElemento(elemento);
        
        if(raiz==null){
            raiz=no;
        }else{
            raiz.setAnterior(no);
            no.setProximo(raiz);
            raiz=no;
        }
        tamanho++;
    }
    public void remover(int elemento){  
        No temp = raiz;
        
        while(temp.getElemento() != elemento){
            temp = temp.getProximo();
        }
        
        if(size() == 1)
            raiz = null;
        else if(temp == raiz){
            raiz = raiz.getProximo();
            raiz.setAnterior(null);
        } else if(temp.getProximo() == null){
            temp = temp.getAnterior();
            temp.setProximo(null);
        } else {
            No anterior = temp.getAnterior();
            No proximo = temp.getProximo();
            
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
        }
        tamanho--;
    }
    
    public String get(int elemento){
        No no = buscar(elemento);
        
        if(no==null)
            return "Elemento não encontrado!";
        else
            return ""+no.getElemento();
    }
    
    private No buscar(int elemento){
        No atual = raiz;
        for(int i=0; i<size();i++){
            if(atual.getElemento()==elemento)
                return atual;
            atual = atual.getProximo();
        }
        return null;
    }
    
    public void listar(){
        No atual = raiz;
        if(size() == 0){
            System.out.println("Nenhum elemento na lista!");
            return;
        }
        while(atual != null){
            System.out.print(atual.getElemento()+",");
            atual = atual.getProximo();
        }
    }
    
}
