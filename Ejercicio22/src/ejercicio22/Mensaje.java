/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

public class Mensaje {
    public static String calcularSalario(double s, double h, String n){
        String resp;
        
        if(s*h>450000){
            resp = "Su nombre es " + n + " y su salario es de $" + s*h;
        }else{
            resp = "Su nombre es " + n;
        }
        
        return resp;
    }
}
