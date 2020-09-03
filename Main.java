public class Main {
        public static void main(String[] args) {
        
          int transfer1 = 100;
          int limit = 1000;

          int bonus = (transfer1) / 100;
        
          if (transfer1 < limit){
          bonus = 0;
          }
        
          System.out.println(bonus);

          int transfer2 = 1100;
          
          if (transfer2 > limit) {
           transfer2 = limit;
          }
        
          int totalBonus = ((transfer2) / 100) + 1;
        
          System.out.println(totalBonus);
    
    

    }
    }
