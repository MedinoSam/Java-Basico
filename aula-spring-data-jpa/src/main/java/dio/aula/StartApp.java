package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.Usuario;
import dio.aula.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        
        Usuario usuario = new Usuario();
        usuario.setName("samuel");
        usuario.setUsername("Sam");
        usuario.setPassword("sam123");

        repository.save(usuario);


        for(Usuario u: repository.findAll()){
            System.out.println(u);
        }
    }

}
