/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.antes;

/**
 *
 * @author gpa
 */
public class Estagiario extends Funcionario {

    @Override
    public void calculaSalario() {
        System.out.println("Salario de Estagiario - É Salario por hora");
    }
    
}
