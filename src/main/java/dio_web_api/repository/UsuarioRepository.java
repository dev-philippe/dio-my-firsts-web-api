package dio_web_api.repository;

import dio_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void    save (Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário ", id));
        System.out.println(id);

    }

    public List<Usuario> findAll(){
        System.out.println("LIST - listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Philippe","passaword"));
        usuarios.add(new Usuario("Willian","Masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/username - Recebendo o id: %d para localizar o usuário", id));
        return new Usuario("Philippe", "password");


    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar um usuário",username));
        return new Usuario("Philippe", "password");
    }


}
