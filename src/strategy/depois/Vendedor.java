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
public class Vendedor extends Funcionario {
    
     public Vendedor() {
        
        salario = new SalarioComissao();
        ferias = new SemFerias();
    }
    
    
}
