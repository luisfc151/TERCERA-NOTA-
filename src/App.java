public class App {

    
    public static class BancoApp {
        // atributos 
        String accountNumber;
        String owner;
        double balance;
        
        // metodos
        void deposit(double amount){
            balance += amount;
            System.out.println("deposito" + amount + "nuevo balance: " + balance);
        }
    }
     
        public static void main(String[] args) throws Exception {
            BancoApp account1 = new BancoApp(); 
            account1. accountNumber = "555-555-555";
            account1. balance = 2000000;
            account1. owner = "luis";
            account1.deposit(5000000);
             
            System.out.println(account1.balance);

           
            System.out.println(account1.owner);
                      
        }
     
        
       }
    