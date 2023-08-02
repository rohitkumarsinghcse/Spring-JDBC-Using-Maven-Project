package sbi.main;

import java.util.Scanner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sbi.customerdata.SBI_Customer_Data;
import sbi.operation.SBI_Data_Base_Operation;

public class SBI_Data_Base_Main_Application
{

						public static void main(String[] args) 
						{
	                            @SuppressWarnings("resource")
								AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
	                            context.scan("sbi.*");
	                            context.refresh();
	                            
	                            while(true)
	                            {
	                            		@SuppressWarnings("resource")
										Scanner sc = new Scanner(System.in);
	                            		System.out.println("------------------------------------------------ Option ------------------------------------------------");
	                            		System.out.println(String.format("%85s", "[1] Insert Customer Data ")+"\n"+String.format("%85s", "[2] Delete Customer Data ")+"\n"+String.format("%68s", "[3] Exit"));
	                            		System.out.print("Enter The Option : ");
	                            		switch(sc.nextInt())
	                            			{
	                            				case 1:
	                            	                       SBI_Customer_Data objectInsert = context.getBean(SBI_Customer_Data.class);
	                            	                       System.out.print("Enter The Account Number of The Customer : ");
	                            	                       objectInsert.setAccountNumber(Long.parseLong(sc.next()));
	                            	                       System.out.print("Enter The Account Holder Name of The Customer : ");
	                            	                       objectInsert.setAccountHolderName(sc.next());
	                            	                       System.out.print("Enter The Total Amount of The Customer : ");
	                            	                       objectInsert.setTotalAmount(Long.parseLong(sc.next()));
	                            	                       
	                            	                       SBI_Data_Base_Operation insertTask = context.getBean(SBI_Data_Base_Operation.class);
	                            	                       int resultInsert = insertTask.addDetails(objectInsert);
	                            	                       if(resultInsert>0)
	                            	                       {
	                            	                    	   System.out.println(resultInsert+"  Row Created .............................");
	                            	                       }
	                            	                       else
	                            	                       {
	                            	                    	   System.out.println("Failed ............................");
	                            	                       }
	                            					break;
	                            				case 2:
	                            					SBI_Customer_Data objectdelete = context.getBean(SBI_Customer_Data.class);
                         	                        System.out.print("Enter The Account Number of The Customer : ");
                         	                        objectdelete.setAccountNumber(Long.parseLong(sc.next()));
                         	                       SBI_Data_Base_Operation  deleteTask = context.getBean(SBI_Data_Base_Operation.class);
                        	                       int resultDelete =  deleteTask.deleteDetails(objectdelete);
                        	                       if(resultDelete>0)
                        	                       {
                        	                    	   System.out.println(resultDelete+"  Row Deleted .............................");
                        	                       }
                        	                       else
                        	                       {
                        	                    	   System.out.println("Failed ............................");
                        	                       }
	                            					break;
	                            				case 3:
	                            					System.out.println("Exit SuccessFully ........................");
	                            	                 System.exit(0);
	                            					break;
	                            		   }
	                            }
						}
}
