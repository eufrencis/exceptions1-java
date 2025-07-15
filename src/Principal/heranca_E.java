package Principal;

import java.util.ArrayList;
import java.util.List;

import Assistente.account_E;
import Assistente.businessAccount_E;
import Assistente.savingAccount_E;

public class heranca_E {
    
    public static void main(String[] args) {
        


        businessAccount_E bacc = new businessAccount_E  (1002, "Maria", 0.5, 500.0);

        //UPCASTING subclasse para superclasse

        account_E  acc1 = bacc;
        account_E  acc2 = new businessAccount_E   (1003, "BOB", 0.0, 200.0);
        account_E  acc3 = new savingAccount_E (1004, "ana", 0.0, 0.01);

        System.out.println(acc1.getBalance());

        // DOWNCASTING  superclasse para subclasse

        businessAccount_E  acc4 = (businessAccount_E ) acc2; /*acc2 é account. Não posso converter um account para business account */
        // nesse caso uso um casting para poder utilizar
        
       // businessAccount_E acc5 = (businessAccount_E ) acc3; //Essa operação não é permitida pois eu to fazendo o caasting errado acc3 é uma saving account. Compilador nao percebe.
        // Para ver se está certo utilizamos o instaceof:

        if (acc3  instanceof businessAccount_E  ){
            businessAccount_E acc5 = (businessAccount_E ) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof savingAccount_E){
            savingAccount_E acc5 = (savingAccount_E) acc3;
            acc5.updateBalance();
            System.out.println("Uptate");
        }

        /*-----------------------------------------------------------------------------------------------------------------------------------------------
       
       
       
        Em cada um destas instaciações tem um valor diferente de taxa mostrando a sobreposição da superclasse account*/


        account_E accc1 = new account_E(1001, "alex", 1000.0);
        accc1.withdraw(200.0);
        System.out.println(accc1.getBalance());

        account_E accc2 = new savingAccount_E(1002, "Maria", 1000.0, 0.01);
        accc2.withdraw(200.0);
        System.out.println(accc2.getBalance());

        account_E accc3 = new businessAccount_E(1003, "bob", 1000.0, 500.0);
        accc3.withdraw(200.0);
        System.out.println(accc3.getBalance());


        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        List <account_E> list = new ArrayList<>();

        list.add(new savingAccount_E(1001, "Alex", 500.0,0.01));
        list.add(new businessAccount_E(1002, "Maria", 1000.0, 400.0));
        list.add(new savingAccount_E(1004, "bob", 300.0, 0.01));
        list.add(new businessAccount_E(1005, "anna", 500.0, 500.0));

        
        for (account_E conta : list){
            conta.deposit(10.0);
        }
        


    }
}
