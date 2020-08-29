/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1708;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class aula1708 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String nome, endereco, idade = null;
        int reposta, reposta2, reposta3;
        
       
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        
       
        int resposta = JOptionPane.showConfirmDialog(null, "O seu nome ?: "+nome+"?");
            
           
            if(resposta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "O seu nome é "+nome);
            }else{
                JOptionPane.showMessageDialog(null, "Dados não confirmados"+nome);
    
    }
         idade = JOptionPane.showInputDialog("Qual sua idade?");
        
       
        int resposta3 = JOptionPane.showConfirmDialog(null, "Sua idade ?: "+idade+"?");
            
           
            if(resposta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Sua idade: "+idade);
            }else{
                JOptionPane.showMessageDialog(null, "Dados não confirmados "+idade);
    
    }    
             endereco = JOptionPane.showInputDialog("Qual o seu endereço?");
        
       
        int resposta2 = JOptionPane.showConfirmDialog(null, "O seu endereço ?: "+endereco+"?");
            
           
            if(resposta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Seu endereço é "+endereco);
            }else{
                JOptionPane.showMessageDialog(null, "Dados não confirmados "+endereco);
    
    }
        if(resposta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Bem vindo: "+nome);
            }else{
                JOptionPane.showMessageDialog(null, "Dados não confirmados "+nome);
    
    }         
    }
    
}
