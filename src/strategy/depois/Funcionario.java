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
public abstract class Funcionario {

    protected Salario salario;
    protected Ferias ferias;
       
    public void calcularSalario(){
        salario.calcularSalario();
    };
    
    public void tipoFerias(){
        ferias.verificaFerias();
    };
    
}
