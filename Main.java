public class Main {
        public static void main(String[] args) {
          int amount = 100;
          int transfer = 1100;
          int limit = 1000;        
          int bonus;
  
          if(transfer < limit) {
          bonus = 0;
          } else {
          bonus = transfer / 100;
          }
        
         System.out.println(bonus);
          
         int totalAmount = amount + transfer + bonus;
         System.out.println(totalAmount);
    }
