class GroceryException extends Exception{ 
 GroceryException(){ 
 System.out.println("The count of the grocery items is not correct\nCheck again."); 
 } 
 } 
 public class throwsThrowable { 
 public static void main(String[] args) throws GroceryException{ 
 int groceryItems=10; 
 int groceryTaken=15; 
 if(groceryItems==groceryTaken){ 
 System.out.println("The count of the grocery items are proper."); 
 } 
 else{ 
 try{ 
 throw new GroceryException(); 
 }catch(GroceryException e){ 
 } 
 } 
 } 
 } 
