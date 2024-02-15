/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication32;

/**
 *
 * @author viti
 */
public class Ejemplo1 {
    public int valor1;
    public double valor2;
    private String correo;
    private String pasword="pasword";
    public Estados estado;

    public Ejemplo1() {
        valor1=1;
        valor2=20;
        correo="hola@correo.net";
        pasword="123456";
        estado=Estados.Activo;
    }

    public Ejemplo1(int valor1, double valor2, String correo, Estados estado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.correo = correo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "values{" + "valor1=" + valor1 + ", valor2=" + valor2 + ", correo=" + correo + ", pasword=" + pasword + '}';
    }
    
    

      
    
    
    public void saludo(){
        System.out.println("Los saludo a todos");
    }
    
    public void miMetodo1(String parametro1){
        System.out.println("IMprime el parametro " + parametro1);
        parametro1 = "Nuevo valor";
    }

    public String getCorreo() {
        System.out.println(correo.indexOf("@"));
        if (correo.contains("@")){
            System.out.println("Si contiene @");
        }else
            System.err.println("No contiene @");
        
        if (correo.indexOf("@")  >=0)
            return correo.substring(0,3)+ "......" +correo.substring(correo.indexOf("@"));
        else 
            return "Correo invalido";
        
           
    }

    public void setCorreo(String correo) {
        //this.correo = correo+"@gmail.com";
        this.correo = correo;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getPasword() {
        return "*********";
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
}
