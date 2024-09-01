package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Reserve;
import pe.edu.upc.tripbundle.repositories.IReserveRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IReserveService;

import java.util.List;

@Service
public class ReserveServiceImplement implements IReserveService {
    @Autowired
    private IReserveRepository rR;

    @Override
    public List<Reserve> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Reserve reserve) {
        rR.save(reserve);
    }

    @Override
    public void update(Reserve reserve) {
        rR.save(reserve);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }
}
