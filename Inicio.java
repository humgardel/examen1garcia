/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1garcia;

/**
 *
 * @author HUMGARDEL
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lector lectortest = new Lector("Humberto","Garcia Delgado","1300870887","Malecon 156");
        Nacionalidad ecuador = new Nacionalidad("Ecuatoriana");
        Autor autor1 = new Autor("Paul Cortazar", "12/10/1940", ecuador);
        Editorial editorialtest = new Editorial("Santillana");
        Categoria suspenso = new Categoria("Suspenso");
        Categoria autobiografia = new Categoria("Autobiografia");
        Categoria ficcion = new Categoria("Ficcion");
        Libro lib1 = new Libro("La rueda ambulante", "1998", suspenso, editorialtest, autor1);
        Libro lib2 = new Libro("Pablo Cortazar", "2005", autobiografia, editorialtest, autor1);
        Libro lib3 = new Libro("Platero y yo", "2001", ficcion, editorialtest, autor1);
        Copia cop1 = new Copia("0001", lib1, "En la biblioteca");
        Copia cop2 = new Copia("0002", lib2, "En la biblioteca");
        Copia cop3 = new Copia("0003", lib1, "En la biblioteca");
        Copia cop4 = new Copia("0004", lib1, "En la biblioteca");
        Prestamo prest1 = new Prestamo("10/10/2016",null,cop1);
        lectortest.nuevoPrestamo(prest1);
        
    }
    
}
