package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import th.ac.ku.atm.config.ATMConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        ATM atm = context.getBean(ATM.class);

        String name = atm.validateCustomer(2, 2345);
        atm.deposit(200);
        System.out.println(name + " has "+ atm.getBalance());
    }
}
