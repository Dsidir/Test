
package bankaccount;

/**
 *
 * @author dsid
 */
public class BankAccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount sidirakisDimitris = new BankAccount();
        sidirakisDimitris.setName("John");
        sidirakisDimitris.setNumber(123654);
        sidirakisDimitris.setActive(true);
        BankAccount sidirakiMaria = new BankAccount( "Maria Sidiraki", 356214);
        sidirakiMaria.setActive(true);
        BankAccount sidirakisGiorgos = new BankAccount("Giorgos Sidirakis", 452147, true);
        sidirakisGiorgos.deposit(200);
        sidirakisGiorgos.withdraw(100);
        sidirakisGiorgos.deposit(400);
        sidirakisGiorgos.showTransactions();
    }
    
}
