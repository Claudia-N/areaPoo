/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/**
 *
 * @author nalle
 */
@Named(value = "referencia")
@RequestScoped
public class ctrlArea {

   private double lado;

    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


  
  public void calcular() {
    
    final double area = getLado()*getLado();
    
    String mensaje= "\n El área del cuadrado es: " + String.valueOf(area) + " cm";
    
    
           
    
    
    FacesContext.getCurrentInstance()
    .addMessage(null, new FacesMessage(mensaje));
    
    
  }
    
}
