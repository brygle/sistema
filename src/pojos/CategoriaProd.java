/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author Bryan
 */
public class CategoriaProd {
    
    private int idCategoria;
    private String nomCategoriaProd;
    private String descCategoriaProd;

    public CategoriaProd(int idCategoria, String nomCategoriaProd, String descCategoriaProd) {
        this.idCategoria = idCategoria; 
        this.nomCategoriaProd = nomCategoriaProd;
        this.descCategoriaProd = descCategoriaProd;
    }

    
    public String getDescCategoriaProd() {
        return descCategoriaProd;
    }

    public void setDescCategoriaProd(String descCategoriaProd) {
        this.descCategoriaProd = descCategoriaProd;
    }

    public String getNomCategoriaProd() {
        return nomCategoriaProd;
    }

    public void setNomCategoriaProd(String nomCategoriaProd) {
        this.nomCategoriaProd = nomCategoriaProd;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    @Override
    public String toString(){
        return this.nomCategoriaProd;
    }
    
    
}
