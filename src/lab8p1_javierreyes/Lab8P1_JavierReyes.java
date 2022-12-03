
package lab8p1_javierreyes;
import java.util.Scanner;

/**
 *
 * @author Javier Reyes
 */
public class Lab8P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner lea = new Scanner(System.in); 
        // TODO code application logic here
       boolean salir = false;
       int opcion;
       while(!salir){
           System.out.println("Bienvenido al menu de laboratorio 8");
           System.out.println("las opciones del menu son las siguientes");
           System.out.println("1. Pocket Monsters ");
           System.out.println("2. DC vrs Marvel ");
           System.out.println("3. Salir ");
           opcion = lea.nextInt();
           switch (opcion){
               case 1:
                   System.out.println("");
                   Pocket_monsters();
                   break;
               case 2:
                   System.out.println("");
                   DC_vrs_marvel();
                   break;
      
                   case 3:
                   salir=true;
               break;
           }  
       }  
        System.out.println("Gracias por haber utilizado el menu del laboratorio");
        System.out.println("fin del menu"); 
    }
    
      public static void Pocket_monsters(){      
      Scanner entrada = new Scanner(System.in);
      System.out.println("selecciono Pocket monsters");
          System.out.println(" seleccione un pokemon de la lista: ");
          System.out.println("Sylveon");
          System.out.println("Gyarados");
          System.out.println("Blaziken");
          System.out.println("Togepi");
          System.out.println("Jigglypuff");
          System.out.println("Giratina");
          System.out.println("Dragonite");
          
          
              
      
      
      
         
      
      
      
      
      System.out.println(""); 
    }    
      public static void DC_vrs_marvel(){
      Scanner alo = new Scanner(System.in);
      System.out.println("selecciono DC vrs marvel");
          System.out.println("Puede ingresar un super heroe o buscar a uno: ");
          String heroe = alo.nextLine();
          if (hero =)
          
          
        
        
        
     
    
        
        
        
        System.out.println("");   
    
        
    }
    
}
