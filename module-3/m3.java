//Jackson Webster
//9/28/2025
//Assignment: Module 3
//This Java program prints a centered pyramid of numbers where each row doubles up to a peak and then halves back down then adds a @ symbol at the end


public class m3 {
    public static void main(String[] args) {
        int totalRows = 7;
        
        for (int row = 1; row <= totalRows; row++){
            
            for (int space = 7; space > row; space--){
            System.out.printf("%4s" , "");
            } 
            
            int num = 1;
            
            // Increases numbers
            for (int i = 1; i <= row; i++) {
                System.out.printf("%4d", num);
                num *= 2;
            }
            
            num /= 2;
            
            // Decreases numbers
            for (int i = 1; i < row; i++) {
                num /= 2; 
                System.out.printf("%4d", num);
                  
            
                
             }
            
            int paddingSlots = totalRows - row;
            // Adds @ symbol
            for (int k = 0; k < paddingSlots; k++) {
                System.out.printf("%4s", "");
            }
            System.out.printf("%4s","@");
            System.out.println();
        }        
        

    }
}

