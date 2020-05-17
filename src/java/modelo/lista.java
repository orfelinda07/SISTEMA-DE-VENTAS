/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class lista {
    
    public Integer listar(String producto, Integer cantidad, String promocion){
      
        int TV = 800;
          int Radio = 250;
            int Tostadora = 100;
             int respuesta;
             int TRENTINO;
             int JPSegundo;
             int total= 0;
             
        if(producto.equals("TV") && promocion.equals("TRENTINO")){
            
            respuesta =  (cantidad * 800); 
            TRENTINO = (respuesta*20)/100;
            
            total = respuesta-TRENTINO;
        
        }else if(producto.equals("TV") && promocion.equals("JPSegundo")){
            
            respuesta =  (cantidad * 800);
            JPSegundo = (respuesta*50)/100;
            
             total = respuesta-JPSegundo;
            
        }if (producto.equals("Radio")&& promocion.equals("TRENTINO")){
            
           respuesta =  (cantidad * 250); 
            TRENTINO = (respuesta*20)/100;
            
            total = respuesta-TRENTINO;
            
        }else if(producto.equals("Radio") && promocion.equals("JPSegundo")){
            
            respuesta =  (cantidad * 250);
            JPSegundo = (respuesta*50)/100;
            
            total = respuesta-JPSegundo;
            
        }
        if (producto.equals("Tostadora")&& promocion.equals("TRENTINO")){
            
       respuesta =  (cantidad * 100); 
            TRENTINO = (respuesta*20)/100;
            
            total = respuesta-TRENTINO;
            
        }else if(producto.equals("Tostadora") && promocion.equals("JPSegundo")){
            
            respuesta =  (cantidad * 100);
            JPSegundo = (respuesta*50)/100;
            
                      total = respuesta-JPSegundo;
            
        }
         return total;
    }
    
}
