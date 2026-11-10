
package com.mycompany.televisoresq2;


public class Televisoresq2 {

    public static void main(String[] args) {
    
        
        Televisor tv1 = new Televisor("Sony", 65);
        
        Televisor tv2 = new Televisor("Samsung", 32);
        
        
        System.out.println(tv1.getMarca());
        System.out.println(tv2.getMarca());
        
        tv1.setCanal(12);
        
        System.out.println(tv1.marca);
        System.out.println(tv1.tamanio);
        System.out.println(tv1.encendido);
        
        System.out.println(tv2.canal);
        System.out.println(tv2.marca);
        System.out.println(tv2.tamanio);
        System.out.println(tv2.encendido);
        
       tv1.power();
    }
}
