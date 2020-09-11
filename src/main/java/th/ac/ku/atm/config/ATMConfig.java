package th.ac.ku.atm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import th.ac.ku.atm.ATM;
import th.ac.ku.atm.DataSourceFile;
import th.ac.ku.atm.DataSource;
import th.ac.ku.atm.Bank;

@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource(){
        return new DataSourceFile("customers.txt");
    }

    @Bean
    public Bank bank(){
        return new Bank("My Bank", dataSource());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }
}
