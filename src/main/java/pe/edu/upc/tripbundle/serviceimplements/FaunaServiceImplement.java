package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Fauna;
import pe.edu.upc.tripbundle.repositories.IFaunaRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IFaunaService;

import java.util.List;
@Service
public class FaunaServiceImplement implements IFaunaService {
    @Autowired
    private IFaunaRepository fR;

    @Override
    public List<Fauna> list() {
        return fR.findAll();
    }

    @Override
    public void insert(Fauna fauna) {
        fR.save(fauna);
    }

    @Override
    public void update(Fauna fauna) {
        fR.save(fauna);
    }
}
