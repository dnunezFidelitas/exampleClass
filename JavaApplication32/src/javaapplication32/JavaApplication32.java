/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String parametro1=" aa";
        System.out.println("Parametro utilizando static" + parametro1);
        miMetodo1(parametro1);
        System.out.println("Parametro utilizando static" + parametro1);
        
        Ejemplo1 ejemplo1= new Ejemplo1(); //Instanciar un objeto 
        Ejemplo1 ejemplo2= new Ejemplo1(3,99,"este@correoNuevo.org", Estados.Inactivo); //Instanciar un objeto 
        
        System.out.println( ejemplo1.toString());
        
        System.out.println( ejemplo2.toString());
    
     
        
        //ejemplo1.saludo();
        //Ejemplo1 example1= new Ejemplo1();
        //example1.saludo();
        ejemplo1.setCorreo("viti123@outlook.net");
        System.out.println(ejemplo1.getCorreo()); 
        
        System.out.println(ejemplo1.getPasword());
        /*
        System.out.println("Parametro con la instacia del objeto" + parametro1);
        ejemplo1.miMetodo1(parametro1);
        System.out.println("Parametro con la instacia del objeto" + parametro1);
        
        Ejemplo2 miSegundaClase = new Ejemplo2();
        miSegundaClase.metodo1();
        miSegundaClase.metodo2();
        System.out.println(" resutaldo "+ miSegundaClase.metodo3(true));
        */
        /*
        String resultado ="";
        resultado=miMetodo1("123123", "45646");
        
        System.out.println(resultado);
        System.out.println(miMetodo1("123123", "45646"));
        
        saludo();
        System.out.println(mulplicador(3, 2));*/
       
            
    }
    
    
    
    public static String miMetodo1 (String hola, String segundo){
        //System.out.println("IMprime el parametro " + hola);
        return hola + " mas algo" +segundo;
    }
    
    public static void saludo(){
        String nombre = JOptionPane.showInputDialog ("Escriba su nombre");
        System.out.println("Hola " + nombre);
    }
    
    public static void miMetodo1 (String hola){
        System.out.println("IMprime el parametro " + hola);
        hola = "Nuevo valor";
    }
    
    public static int mulplicador (int a, int b){
        //return a* b;
        int result = 0;
        result= a*b;
        return result;
    }
}
