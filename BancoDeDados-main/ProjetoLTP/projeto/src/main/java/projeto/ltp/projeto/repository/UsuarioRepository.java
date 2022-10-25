package projeto.ltp.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import projeto.ltp.projeto.model.Usuario;

public interface UsuarioRepository<Historia> extends CrudRepository<Usuario, Long>{

    Usuario findByName(String username);
    
}
