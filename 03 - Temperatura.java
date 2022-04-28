package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
    	
     //formula para converter temperatura (°F − 32) × 5/9 =°C
    	
     final double fator = 5.0 / 9.0;
     final double ajuste = 32;
     
     double fahrenheit = 86;
     double celsius = (fahrenheit - ajuste) * fator;
     
     System.out.println("o resultado e " + celsius + "°C");
     
     //alterar volor de fahrenheit e celsius 
     
     fahrenheit = 150;
     celsius = ( fahrenheit - ajuste) * fator;   		 
    	
     System.out.println("o resultado e " + celsius + "°C");
     
    }  

}
