package com.soulcode.goserviceapp.repository;
import com.soulcode.goserviceapp.domain.Endereco;
import com.soulcode.goserviceapp.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
//    Optional<Endereco> findByEmail(String email);
    Optional<Endereco> findById(Long id);


    @Modifying
    @Query(value = "UPDATE endereco e SET e.uf = ? and e.cidade = ? and e.logradouro = ? and e.numero = ? WHERE e.id = ?", nativeQuery = true)
    void update(String uf, String cidade, String logradouro, String numero, Long id);

//    @Query
//    Optional<Endereco> findByEnderecoId(Long email);
//
//    @Query(value="SELECT e.* FROM endereco e JOIN usuarios u ON e.cliente_id = u.id WHERE u.email = ? ORDER BY data", nativeQuery = true)
//    Optional<Endereco> findByEmail(String email);
}
