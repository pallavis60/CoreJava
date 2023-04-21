package com.xworkz.classobjectmethods.family;

public class Family {
	public String nameOfFamily ;
	public int totalMembers;
	public String location;
	public int childrensPresent;
	public int incomeOfTheFamily;
	

//creating  constructor
    public Family(String nameOfFamily,int totalMembers,String location,int childrensPresent,int incomeOfTheFamily ) {
    		this.nameOfFamily = nameOfFamily;
    		this.totalMembers=totalMembers;
    		this.location=location;
    		this.childrensPresent=childrensPresent;
    		this.incomeOfTheFamily=incomeOfTheFamily;		
    		
    		}
    
    
    //toString method
    public String toString() {
    	return "nameOfFamily = " + nameOfFamily  +   "    totalMembers ="+ totalMembers   + "    location="+location       + "    childrensPresent=" + childrensPresent      + "   incomeOfTheFamily="+  incomeOfTheFamily ;
    	
    }
    
    //equals method
    public boolean equals(Family obj1) {
		if(this.nameOfFamily.equals(obj1.nameOfFamily) & this.totalMembers==obj1.totalMembers  & this.childrensPresent==obj1.childrensPresent) {
			return true;
    	}
		else {
		return false;
		}   
}
}