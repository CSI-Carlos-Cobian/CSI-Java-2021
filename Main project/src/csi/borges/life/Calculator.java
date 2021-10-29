package csi.borges.life;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		
		double initial= 6000; 
		double cash= initial; 
		
		double debt= 0;
		double invested= 500; 
		
		for( int age= 0; age<= 81; age++) {
			
			if (age <17) {// highschool 
				
				String location= "PR"; 
				double salary= 0; 
				
				cash += salary; 
				
			} else if ( age <19) { //// Penn state University 
				
				String location = "PA"; 
				double salary= 29_000;
				double tuition= 35_000+ 45_000-15_000; 
				double costOfLiving= 37_000; 
				
				double LoanInterest = 0.00; 
				
				cash+= salary; 
				debt-= tuition; 
				debt-= costOfLiving; 
				debt+= ({LoanInterest * debt) * 12);
				
				} else if (age <24 ) { //residency 
					
					String location= "PA";
					double salary = 68_000; 
					double tuition = 200; 
					double costOfLiving= 40_000; 
					double Investment = 5_000; 
					double rent= 12* (2_000*500); 
					double food= 20*365; 
					double InvestmentInterest= 1.00; 
					double LoanInterest= 0.00; 
					
					cash+= salary; 
					debt-= tuition; 
					debt-= costOfLiving; 
					debt += ({LoanInterest* debt)*12); 
					
					} else if (age <38) {//work 
						
						String location= "PR"; 
						double salary= 125_000; 
						double costOfLiving= 50_000; 
						double investment= 10_000; 
						double food= 500*12;
						double InvestmentInterest= 1.00;
						double LoanInterest= 0.00; 
						double carAndExpenses= 20_000 + 200 *12 *2000 + 1000 *12; 
						double rent = 12*(1600+500); 
						
						cash += salary; 
						debt-= food; 
						debt-= costOfLiving;
						debt+= ({LoanInterest * debt)* 12; 
						debt-= carAndExpenses; 
						
						
						} else if (age<65) (//retire
								// salary - 12% tax 
								double salary = 200_000 * 1.0; 
								
								// 2 bedroom house with 2 bathrooms + electric/ water/ wi-fi bills
								double rent = 12*(2000+ 600); 
								
								// 30$ daily food stipend 
								double food= 50*365; 
								
								// 100 monthly dollars o gas 
								// 4,000 a year on car fixes
								//montly car payment 500
								double carAndExpenses= 200 * 12 + 2_000 * 1_000 * 12; 
								
								cash+= salary; 
								cash-= food; 
								cash-= rent;
								cash-= carAndExpenses; 
					} else if (age< 80) {// Living the dream 
					}
					System.out.println("Balance at age: "+ age + "is"+ cash + "with a debt of" + debt+ )
								
								
								
								
								
								
					}
					
				}
				
				
				
				
				
				
				
				
				
				
			
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}