
public class Main2 {
        public static void main(String[] args) {
        int amount = 100;
        int transfer = 1100;
        int amountTotal = (amount + transfer);
        
        System.out.println(amountTotal);
        
        int bonus = (transfer) / 100;

        System.out.println(bonus); 

        int limit = 1000;
        if (transfer > limit) {
        transfer = limit;
        }
        
        int totalBonus = (amountTotal + bonus);
        
        System.out.println(totalBonus);
    
    }
    }
