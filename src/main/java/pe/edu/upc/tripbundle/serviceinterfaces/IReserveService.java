package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Reserve;

import java.util.List;

public interface IReserveService {
    public List<Reserve> list();

    public void insert(Reserve reserve);

    public void update(Reserve reserve);

    public void delete(int id);
}
