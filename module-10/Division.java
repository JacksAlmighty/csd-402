
 //Jackson Webster
 //11/6/2025
 //Assignment M10
 //Abstract superclass for company divisions.
 //Contains fields for division name and account number.
 //Each subclass must implement the display() method.
 

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    
    public abstract void display();
}

