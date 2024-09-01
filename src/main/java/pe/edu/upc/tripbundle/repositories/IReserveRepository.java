package pe.edu.upc.tripbundle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tripbundle.entities.Reserve;

@Repository
public interface IReserveRepository extends JpaRepository<Reserve,Integer> {
}
