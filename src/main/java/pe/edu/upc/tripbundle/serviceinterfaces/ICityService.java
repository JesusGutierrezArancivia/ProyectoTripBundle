package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.City;

import java.util.List;

public interface ICityService {
    public List <City> list();

    public void insert(City city);

    public void update(City city);

}
