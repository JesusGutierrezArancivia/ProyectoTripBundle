package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.City;
import pe.edu.upc.tripbundle.repositories.ICityRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.ICityService;

import java.util.List;

@Service
public class CityServiceImplement implements ICityService {
    @Autowired

    private ICityRepository cR;

    @Override
    public List<City> list() {
        return cR.findAll();
    }
}
