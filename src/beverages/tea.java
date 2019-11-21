package beverages;
import java.util.Scanner;

;

public class tea extends freshjuice {
	public String orderte="";
	public int sumte = 0;
	
	public void tea() {
		Scanner inp = new Scanner(System.in);
		Boolean quit =false;
		int i= 0;
	    int git=39, blt=39, mat=39, spt=49, sum = 0;
		
        do {
        	System.out.println("\t\t"+" "+" "+"  "+"TEA");
		System.out.println("==================================================");
		System.out.println("Items"+"\t\t\t\t\tMRP");
    	System.out.println("1. Ginger Tea"+"\t\t\t\t"+"29Rs");
        System.out.println("2. Black Tea"+"\t\t\t\t"+"29Rs");
        System.out.println("3. Masala Tea"+"\t\t\t\t"+"39Rs");
        System.out.println("4. Special Tea"+"\t\t\t\t"+"49Rs");
        System.out.println("5. MainMenu/Checkout ");
        System.out.println("==================================================");
        
        System.out.println("Choose Your Order: ");
        if(i!=0)
        	System.out.println("You Ordered:\n"+orderte);	
               
        int choice=inp.nextInt();
        i+=1;
        switch(choice){
            case 1:{ 
            		sumte=sumte+git;
            		orderte=orderte.concat("Ginger Tea"+"\n");
            		break;
            	   }       		
            
            case 2:{
                	sumte=sumte+blt;
                	orderte=orderte.concat("Black Tea"+"\n");
                	break;
               	   }
            
            case 3:{ 
            		sumte=sumte+mat;
            		orderte=orderte.concat("Masala Tea"+"\n");
            		break;
            	   }
            
            case 4:{
            		sumte=sumte+spt;
            		orderte=orderte.concat("Special Tea"+"\n");
            		break;
                   }
            
            case 5:{
            	    quit = true;
            	    break;
            		}
            
            default: 
            	System.out.println("Wrong Input");
               	break;
        	}
		}while(quit != true);
		System.out.println("==================================================");
        System.out.println("Your Order is:\n"+orderte);
  
}

}
