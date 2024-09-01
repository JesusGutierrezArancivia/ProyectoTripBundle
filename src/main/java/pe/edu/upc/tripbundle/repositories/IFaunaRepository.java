package pe.edu.upc.tripbundle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tripbundle.entities.Fauna;
@Repository
public interface IFaunaRepository extends JpaRepository<Fauna,Integer> {
}
