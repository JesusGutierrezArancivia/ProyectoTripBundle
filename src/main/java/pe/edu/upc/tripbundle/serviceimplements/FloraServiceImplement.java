package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Flora;
import pe.edu.upc.tripbundle.repositories.IFloraRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IFloraService;

import java.util.List;
@Service
public class FloraServiceImplement implements IFloraService {

    @Autowired
    private IFloraRepository flR;

    @Override
    public List<Flora> list() {
        return flR.findAll();
    }

    @Override
    public void insert(Flora flora) {
        flR.save(flora);
    }

    @Override
    public void update(Flora flora) {
        flR.save(flora);
    }
}
