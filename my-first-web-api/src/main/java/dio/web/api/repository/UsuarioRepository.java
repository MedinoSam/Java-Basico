package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    
    public void save(Usuario usuario){
        if (usuario.getLogin()== null)
            throw new CampoObrigatorioException("login");

        if (usuario.getPassword()== null)
            throw new CampoObrigatorioException("password");

        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
            
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("samuel","teste"));
        usuarios.add(new Usuario("steve","jobs"));
        return usuarios;
    }
    public Usuario finByName(String nome){
        System.out.println(String.format("GET/nome - Recebendo o nome: %s para localizar um usuário", nome));
        return new Usuario("samuel","medino");
    }
}
