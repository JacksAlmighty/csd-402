 //Jackson Webster
 //11/6/2025
 //Assignment M10
 //UseDivision.java
 //Creates and displays two Domestic and two International Division objects.
 

public class UseDivision {
    public static void main(String[] args) {
        
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", 1001, "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Europe Marketing", 1002, "Germany", "German");

        
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Operations", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Logistics", 2002, "California");

        
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
