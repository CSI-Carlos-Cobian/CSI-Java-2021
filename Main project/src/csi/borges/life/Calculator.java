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
					
					String location= "PA"
					double salary = 68_000; 
					double tuition = 200; 
					double costOfLiving= 40_000; 
					double Investment = 5_000; 
					double rent= 12* (2_000*500)
					double food= 20*365; 
					double InvestmentInterest= 1.00; 
					double LoanInterest= 0.00; 
					
					cash+= salary; 
					debt-= tuition; 
					debt-= costOfLiving; 
					debt += ({LoanInterest* debt)*12); 
					
					} else if (age <38) {//work 
					
				}
				
				
				
				
				
				
				
				
				
				
				
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}