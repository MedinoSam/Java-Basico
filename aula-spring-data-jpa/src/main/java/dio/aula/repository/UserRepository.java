package dio.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.aula.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer>{
    
}
