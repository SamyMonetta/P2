package com.portfolio.sam.Security.Repository;

import com.portfolio.sam.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    @Bean
    boolean existsByNombreUsuario(String nombreUsuario);
    @Bean
    boolean existsByEmail(String email);
}
