/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jprez
 */
public class mercadoDTO {
    private int id;
    private String nome, marca, preco, tipo, quantidade;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getPreco(){
        return preco;
    }
    
    public void setPreco (String preco){
        this.preco = preco;
    }
    
    public String getTipo(){
        return tipo;
    } 
    
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    
    public String getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade (String quantidade){
        this.quantidade = quantidade;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId (int id) {
        this.id = id;
    }
}
