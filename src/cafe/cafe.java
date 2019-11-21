package cafe;
import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import beverages.*;
import snacks.*;


public class cafe extends pizza {
	
	public String order = "";
	public int total = 0 ,sum = 0 ,discount = 0;
	
	 
	       
	   public void displayMain() {  
		   Scanner input = new Scanner(System.in);
		   main main = new main();
		   String finalname = "";
		   FileReader fr = null; //File Handling concept used to map data of result array
	        int ch;               //from authenticate class to inherited result array  
	                              //in this class.
	        try
	        {
	            fr = new FileReader("name.txt"); 
	            finalname = String.valueOf(main.nameArray);
	            fr.close();
	        }
	        catch(Exception e)
	        {
	        }
	        

		   		System.out.println("==================================================");
       			System.out.println("\t\tCafe's Menu");
       			System.out.println("\t\t"+" "+"Beverages\n");
	            System.out.println("1.Coffee");
	            System.out.println("2.Tea");
	            System.out.println("3.Cold Drink");
	            System.out.println("4.Fresh Juice");
	            System.out.println("==============================="+" "+" "+" "+" ");
	            System.out.println("\t\t"+" "+" "+"Snacks\n");
	           
	        	System.out.println("5.Burger");
	            System.out.println("6.Pastry");
	            System.out.println("7.Pizza");
	            System.out.println("Enter (8) Checkout/Quit");
	            System.out.println("-----------------------");
	            System.out.println("Choose Your Order: ");
	           
	            int choice = input.nextInt();
	            
	            switch(choice){
                case 1: {
                			System.out.println("\n");
           					coffee();
           					break;
        				}
                	
                case 2: {
                			System.out.println("\n");
                			tea();
                			break;
        				}
                	
                case 3: {
                			System.out.println("\n");
           					colddrink();
           					break;
        				}
                	
                case 4: {
                			System.out.println("\n");
           					freshjuice();
           					break;
        				}
                	
                case 5: {
                			System.out.println("\n");
           					burger();
           					break;
        				}
                	
                case 6:	{
                			System.out.println("\n");
           					pastry();
           					break;
        				}	

                case 7: {
                			System.out.println("\n");
                   			pizza();
                   			break;
                		}
                  		
                case 8:
                {
                	try
                	{
                		System.out.println("\n");
                		Thread.sleep(2000);
                		order = order.concat(ordercf);
                    	order = order.concat(ordercd);
                    	order = order.concat(orderfj);                    	
                    	order = order.concat(orderte);
                    	order = order.concat(orderbu);
                    	order = order.concat(orderpa);
                    	order = order.concat(orderpi);
                    	sum = sumcf + sumcd + sumfj + sumte + sumbu+ sumpa +sumpi;
                    	 int refs;
                         refs = 1350 + (int) (Math.random()*4000);
                         int ref = (refs);
                        if(sum>0) { 
                         Calendar timer = Calendar.getInstance();
                         timer.getTime();
                         SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
                         tTime.format(timer.getTime());
                         SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
                         Tdate.format(timer.getTime()); 
                    	 System.out.println("==============================================");
                    	 System.out.println("\t\tCAFE RECIEPT\n\n"+
                    			 "Date: "+ Tdate.format(timer.getTime()) +
                                 "\t\tTime: " + tTime.format(timer.getTime())+
                                 "\nReference Num:\t"+ref+"\n");
                    	 
                    	System.out.println(finalname+"'s Order:\n"+order);
                    	if(sum>200) {
                    	System.out.println("Sub Total:\t\t\t"+sum+".00"+" Rs");
                    	discount = (int)(sum*0.1);
            			
            			total = (int)(sum*1.11)+25 - (int)discount;
            			System.out.println("Service Tax:\t\t\t11%");
            			System.out.println("Internet Handling Fees:\t\t25 Rs");
            	        System.out.println("Discount:\t\t\t"+discount);   
            		    System.out.println("Total Amount: \t\t\t"+total+" Rs");
            		    System.out.println("===============================================");
             			System.out.println("\t\t"+" "+" "+"Thank you!");
            		    }
                    	else {
                        System.out.println("Sub Total:\t\t\t"+sum+".00"+" Rs");
                        	                			
                		total = (int)(sum*1.11)+25;
                		System.out.println("Service Tax:\t\t\t11%");
                		System.out.println("Internet Handling Fees:\t\t25 Rs");
                		System.out.println("Total Amount: \t\t\t"+total+" Rs");
            			System.out.println("===============================================");
             			System.out.println("\t\t"+" "+" "+"Thank you!");
                    	
                        }
                    	System.exit(0);
                    	}
                        else {
                        System.out.println("===============================================");
             			System.out.println("\t\t"+" "+" "+"Thank you!");
             			System.exit(0);
                        }	
                	}
                	
                	catch(InterruptedException e) {}
                	break;
                }
                default: 
                	System.out.println("Wrong Input");
                	System.out.println("\n");
                	displayMain();
            }
	            displayMain(); 
 	}
}
