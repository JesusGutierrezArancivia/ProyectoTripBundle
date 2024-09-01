package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Fauna;

import java.util.List;

public interface IFaunaService {

    public List<Fauna> list();

    public void insert(Fauna fauna);

    public void update(Fauna fauna);
}
