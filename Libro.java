/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1garcia;
//import java.util.Date;
/**
 *
 * @author HUMGARDEL
 */
public class Libro {
    private String titulo;
    private String anho;
    private Categoria categoria;
    private Editorial editorial;
    private Autor autor;
    
    public Libro(String titulo_, String anho_, Categoria categoria_, Editorial editorial_, Autor autor_){
        this.titulo=titulo_;
        this.anho=anho_;
        this.categoria=categoria_;
        this.editorial=editorial_;
        this.autor=autor_;
    }
}
