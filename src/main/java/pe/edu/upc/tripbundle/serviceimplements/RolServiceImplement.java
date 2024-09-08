package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Rol;
import pe.edu.upc.tripbundle.repositories.IRolRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IRolService;

import java.util.List;
@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository roR;

    @Override
    public List<Rol> list() {
        return roR.findAll();
    }

    @Override
    public void insert(Rol rol) {
        roR.save(rol);
    }

    @Override
    public void update(Rol rol) {
        roR.save(rol);
    }

    @Override
    public void delete(int id) {
        roR.deleteById(id);
    }
}
