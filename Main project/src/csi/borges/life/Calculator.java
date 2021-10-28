package csi.borges.life;

public class Calculator {
	else if(i<55) {
        String location = "PR";

        // salary - 10% tax
        double salary = 50_000 * 0.9; 

        // 2 bedroom apartment + electric/water/wi-fi bills
        double rent = 12 * (1500 + 400);

        // 30$ daily food stipend
        double food = 30 * 365; 

        // 60$ per month on gas.
        // Approximately 1000$ a year on car reparations, tolls, licenses, oil and tire changes.
        // Monthly car payment of 400$
        double carAndExpenses = 60*12 + 1_000 + 400*12; 
                
        cash += salary;
        cash -= food;
        cash -= rent;
        cash -= carAndExpenses;
        
        System.out.println("Balance at age: " + i + " is: " + cash + " with a debt of " + debt + " and " + invested + " invested." );

}
}
}
