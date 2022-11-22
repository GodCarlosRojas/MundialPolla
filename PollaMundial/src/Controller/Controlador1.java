/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Modelo1;
import View.Vista1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class Controlador1 implements ActionListener{
    
    private Vista1 vista1;
    private Modelo1 modelo1;
    private int i; //Controla los enfrentamientos
    private int j;//Controla el nombre del grupo

    public Controlador1(Vista1 vista1, Modelo1 modelo1) {
        this.vista1 = vista1;
        this.modelo1 = modelo1;
        this.vista1.btnnext.addActionListener(this);
        this.vista1.btnback.addActionListener(this);
        i=0;
        j=0;
        this.modelo1.grupo(i,j);
    }
    
    public void iniciar(){
        this.vista1.setTitle("Fase de grupos");
        this.vista1.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.vista1.btnnext)
        {
            if(i<28)
            {
                this.i = this.i+4; 
                this.j = this.j+1;
                this.modelo1.grupo(i,j);
            }
            
        }
        else if(e.getSource()==this.vista1.btnback)
        {
            if(i>0)
            {
                this.i = this.i-4; 
                this.j = this.j-1;
                this.modelo1.grupo(i,j);
            }
        }
    }
   
}