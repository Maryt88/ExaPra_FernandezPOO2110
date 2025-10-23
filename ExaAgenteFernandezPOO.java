/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaagentefernandezpoo;

import jade.core.Agent;/**

 * @author FERNANDEZDELARAPOO
 */
public class ExaAgenteFernandezPOO extends Agent{

    public void setup(){
    System.out.println("Agente Activo");
    System.out.println("Hola, el agente: "+getAID().getName()+" esta listo");
    System.out.println("Hola, soy el agente :"+getLocalName());
    
    }
    public void takeDown(){
        System.out.println("Agente Inactivo");
        
    }        
}
