package pe.edu.upc.arquiwebtb3.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.arquiwebtb3.entities.Talla;


import java.util.List;

@Repository
public interface ITallaRepository extends JpaRepository<Talla,Integer> {
    @Query("from Talla t where t.letraTalla like %:letraTalla")
    List<Talla> search(@Param("letraTalla") String letraTalla);
}

