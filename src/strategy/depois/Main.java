/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.depois;

/**
 *
 * @author gpa
 */
public class Main {
    
    public static void main(String[] args) {
        Funcionario e = new Estagiario();
        e.calcularSalario();
        e.tipoFerias();
        
        Funcionario c = new Contratado();
        c.calcularSalario();
        c.tipoFerias();
        
        Funcionario volun = new Voluntario();
        volun.calcularSalario();
        volun.tipoFerias();
        
        Funcionario vend = new Vendedor();
        vend.calcularSalario();
        vend.tipoFerias();
        
    }
    
}
