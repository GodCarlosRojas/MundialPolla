
import Controller.Controlador1;
import Model.Modelo1;
import View.Vista1;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Main {
    
    public static void main(String args[]){
        
        ArrayList<String> selecciones;
        selecciones = crear_paises();      
        
        Vista1 vista1 = new Vista1();
        Modelo1 modelo1 = new Modelo1(vista1,selecciones);
        Controlador1 controlador1 = new Controlador1(vista1,modelo1);
        controlador1.iniciar();
        
        vista1.setVisible(true);
    }
    
    public static ArrayList<String> crear_paises(){
        
        ArrayList<String> paises = new ArrayList<>();
        paises.add("QATAR");
        paises.add("ECUADOR");
        paises.add("SENEGAL");
        paises.add("HOLANDA");
        paises.add("INGLATERRA");
        paises.add("IRAN");
        paises.add("EEUU");
        paises.add("GALES");
        paises.add("ARGENTINA");
        paises.add("ARABIA");
        paises.add("MEXICO");
        paises.add("POLONIA");
        paises.add("FRANCIA");
        paises.add("AUSTRALIA");
        paises.add("DINAMARCA");
        paises.add("TUNEZ");
        paises.add("ESPAÑA");
        paises.add("COSTA RICA");
        paises.add("ALEMANIA");
        paises.add("JAPON");
        paises.add("BELGICA");
        paises.add("CANADA");
        paises.add("MARRUECOS");
        paises.add("CROACIA");
        paises.add("BRASIL");
        paises.add("SERBIA");
        paises.add("SUIZA");
        paises.add("CAMERUN");
        paises.add("PORTUGAL");
        paises.add("GHANA");
        paises.add("URUGUAY");
        paises.add("COREA");
        return paises;
    }
}
