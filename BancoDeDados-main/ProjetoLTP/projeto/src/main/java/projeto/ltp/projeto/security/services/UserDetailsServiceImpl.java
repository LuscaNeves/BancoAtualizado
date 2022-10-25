package projeto.ltp.projeto.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import projeto.ltp.projeto.model.Usuario;
import projeto.ltp.projeto.repository.UsuarioRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Encontra um usuário no banco de dados
        Usuario user = userRepository.findByName(username);
        // Depois retorna um objeto UserDetailsImpl com base no usuário encontrado
        return new UserDetailsImpl(user);        
    } 
}
