package br.com.inottec.minhasFinancas.modelo.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.inottec.minhasFinancas.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
