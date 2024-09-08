package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Rol;

import java.util.List;

public interface IRolService {

    public List<Rol> list();

    public void insert(Rol rol);

    public void update(Rol rol);

    public void delete(int id);
}
