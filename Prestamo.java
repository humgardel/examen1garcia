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
public class Prestamo {
    private String fechaInicio;
    private String fechaFin;
    private Copia libro;
    
    public Prestamo(String fechaInicio_, String fechaFin_, Copia libro_){
        this.fechaInicio=fechaInicio_;
        this.fechaFin=fechaFin_;
        this.libro=libro_;
    }
}
