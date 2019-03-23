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
public class SemSalario implements Salario{
    
     @Override
    public void calcularSalario() {
        System.out.println("Sem Salario");
    }
    
    
}
