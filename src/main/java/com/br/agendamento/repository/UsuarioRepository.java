package com.br.agendamento.repository;

import com.br.agendamento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

     @Query(value = "SELECT u.tipoUsuario FROM Usuario u WHERE u.tipoUsuario IN ('CLIENTE', 'PROFISSIONAL') AND u.codigoPessoa = :codigo", nativeQuery = true)
     List<String> findTipoUsuariobyCodigoPessoa(@Param("codigo") String codigo);

//     @Query("SELECT u FROM usuario u WHERE u.tipo_usuario= IN ('CLIENT','PROFISSIONAL') AND U.codigo_pessoa=:codigo")
//     Usuario findbyUsuario(@Param("codigo") String codigo);

}
