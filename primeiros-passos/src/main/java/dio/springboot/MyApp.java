package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("O resultado eh: " + calculadora.somar(5,4));
        
    }

    @Autowired
    private Calculadora calculadora;



    
}
