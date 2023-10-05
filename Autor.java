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
public class Autor {
    private String nombre;
    private String fechaNacimiento;
    private Nacionalidad nacionalidad;
    
    public Autor(String nombre_, String fechaNacimiento_, Nacionalidad nacionalidad_){
        this.nombre=nombre_;
        this.fechaNacimiento=fechaNacimiento_;
        this.nacionalidad=nacionalidad_;
        
    }
}
