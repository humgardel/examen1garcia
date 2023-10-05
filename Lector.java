/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1garcia;
import java.util.ArrayList;
/**
 *
 * @author HUMGARDEL
 */
public class Lector {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private ArrayList<Prestamo> libros;
    private int numero=0;
    
    public Lector(String nombre_, String apellidos_, String dni_, String direccion_){
        this.nombre=nombre_;
        this.apellidos=apellidos_;
        this.dni=dni_;
        this.direccion=direccion_;
        this.libros= new ArrayList<Prestamo>();
    }
    
    public void nuevoPrestamo(Prestamo lib){
        if (this.numero==3){
            System.out.println("No puede prestar más libros");
        }
        else{
            this.libros.add(lib);
            this.numero++;
        }
    }
    
    public void devolverLibro(String idlib){
        this.libros.remove(idlib);
    }
}
