//import java.util.Date;//because I didn't use it actually but put it because it's required 
public class Main { 
	public static void main(String []args) {
    int currentYear=2020;
    int currentMonth=11;
    int x;//the guarantee due to month
    
    x=currentMonth+6;
    if (x>12) {
    	x=x-12;//the month of the next year
    }
    
    Car []cars= new Car[5];
    //Initialize the array of cars
    cars[0]=new Car("0123-A",2020,11,"red",50000.00,"Mercedes",currentYear,x );
    cars[1]=new Car("1230-A",2016,8,"blue",40000.00,"BMW",currentYear,x );
    cars[2]=new Car("2130-A",2011,5,"yellow",20000.00,"Mazda",currentYear,x );
    cars[3]=new Car("1320-A",2013,9,"white",30000.00,"Kia",currentYear,x ); 
    cars[4]=new Car("3210-A",2009,6,"green",10000.00,"Nissan",currentYear,x );
    
    //pass the array to the method printCarsInfo 
    printCarsInfo(cars);
    
    //pass the array to the method
    System.out.println("Max car price is: ");
    System.out.println(maxPrice(cars));
	}
	
	public static void printCarsInfo( Car [ ] cars) {
  //this method is to print all information about cars with ages and guarantee due to.	
		for(int i=0;i<cars.length;i++) {
			System.out.println(""+ cars[i].toString());
		} 
	}
	
	public static Car maxPrice( Car [ ] cars) {
 //this method is to return the maximum price of cars 
		double maxPrice = cars[0].getPrice();
	    int indexOfMaxPrice = -1;
	    for(int i = 0; i < cars.length; i++) {
	        if(cars[i].getPrice() > maxPrice) {
	        	maxPrice = cars[i].getPrice();
	        	indexOfMaxPrice = i;
	        }
	    }
	    return cars[indexOfMaxPrice+1]; 
	}
} 
