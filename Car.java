//Sondos Ahmad Aabed

//import java.util.Date;//because I didn't use it actually but put it because it's required 

public class Car {
	int currentYear=2020;
    int currentMonth=11;
  //I had this warring of the date methods are deprecated so I couldn't use, 
  //but instead I initialized the year and month  
	private String plateNo;
	private String color;
	private String manufactureby;

	private int yearmanufacture;
	private int monthmanufacture;
	private int guaranteedueyear;
	private int guaranteeduemonth;
	
	private double price; 
	
	public Car() {
		
	}
	
	public Car(String plateNo,int yearmanufacture ,int monthmanufacture ,String color,double
			price,String manufactureby,int guaranteedueyear ,int guaranteeduemonth ) {
		
	}
	
	public int getYearManufacture() {
		return yearmanufacture;
	}
	
	public int getMonthManufacture() {
		return monthmanufacture;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCarAge() {
		int ageYear;
		int ageMonth;
		int age;
		ageYear =currentYear-yearmanufacture;
		if(ageYear>0) {
			ageYear=ageYear*12;//convert it to months
		} 
		ageMonth=currentMonth-monthmanufacture;
		age=ageMonth+ageYear;	
		String y= age +"months";  
		return y ;// y is the string of car age in months
	}	
	
	public String getmanufactureby() {
		return manufactureby;
	}	 

	public String getCalculateGuarantee() {
	    int remainingYears ;
	    int remainingMonth ; 
	    int remaining;
		remainingYears=guaranteedueyear-currentYear;
		if(remainingYears>=0) {
			remainingYears=remainingYears*12;//convert years to months
		}
		else if(remainingYears<0) {
			remainingYears=0;    
		}
		
	    remainingMonth= guaranteeduemonth-currentMonth;
	    if(remainingMonth<0) {
			remainingMonth=0;    
		}
 	    remaining=remainingYears+remainingMonth;	
	  
	 	
		String s= remaining+"months";
		return s;
	}

	public void setYearManufacture(int year) {
		 yearmanufacture=year; 	
	}

	public void setMonthManufacture(int month) {
		monthmanufacture=month;
	}
	
	public void setColor(String newColor) {
		color= newColor;
	}
	
	public void setGuarantee(int month,int year) {
		guaranteedueyear=year;
		guaranteeduemonth=month;
	}	
	
	public String printCarInfo() {
		String s=""+ plateNo + yearmanufacture + monthmanufacture +color+ price+ manufactureby+guaranteedueyear+guaranteeduemonth; 
		System.out.printf(s);
		return s; 
	}
	
} 
