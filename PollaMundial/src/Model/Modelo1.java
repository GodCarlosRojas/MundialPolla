/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.Vista1;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Modelo1 {
    
    private Vista1 vista1;
    private ArrayList<String> selecciones;
    private ArrayList<String> grupo;
    
    public Modelo1(Vista1 vista1, ArrayList<String> paises) {
        this.vista1=vista1;
        this.selecciones=paises;
        this.grupo = crear_grupos();
    }
    
    public void grupo(int i, int j) {
        this.vista1.lblgrupo.setText(this.grupo.get(j));
        this.vista1.enfrentamiento11.setText(selecciones.get(i));
        this.vista1.enfrentamiento12.setText(selecciones.get(i+1));
        this.vista1.enfrentamiento21.setText(selecciones.get(i));
        this.vista1.enfrentamiento22.setText(selecciones.get(i+2));
        this.vista1.enfrentamiento31.setText(selecciones.get(i));
        this.vista1.enfrentamiento32.setText(selecciones.get(i+3));
        this.vista1.enfrentamiento41.setText(selecciones.get(i+1));
        this.vista1.enfrentamiento42.setText(selecciones.get(i+2));
        this.vista1.enfrentamiento51.setText(selecciones.get(i+1));
        this.vista1.enfrentamiento52.setText(selecciones.get(i+3));
        this.vista1.enfrentamiento61.setText(selecciones.get(i+2));
        this.vista1.enfrentamiento62.setText(selecciones.get(i+3));
    }

    private ArrayList<String> crear_grupos() {
        ArrayList<String> grupos = new ArrayList();
        grupos.add("GRUPO A");
        grupos.add("GRUPO B");
        grupos.add("GRUPO C");
        grupos.add("GRUPO D");
        grupos.add("GRUPO E");
        grupos.add("GRUPO F");
        grupos.add("GRUPO G");
        grupos.add("GRUPO H");
        return grupos;
    }
    
}
