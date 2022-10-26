package pe.edu.upc.arquiwebtb3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.arquiwebtb3.entities.Cliente;


import java.util.List;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
    @Query("from Cliente c where c.nombreCliente like %:nombreCliente")
    List<Cliente> search(@Param("nombreCliente") String nombreCliente);
}
