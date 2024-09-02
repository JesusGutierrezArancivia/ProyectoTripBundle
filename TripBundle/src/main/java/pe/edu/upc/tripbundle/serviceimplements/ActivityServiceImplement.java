package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Activity;
import pe.edu.upc.tripbundle.repositories.IActivityRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IActivityService;
import pe.edu.upc.tripbundle.serviceinterfaces.IActivityService;

import java.util.List;

@Service
public class ActivityServiceImplement implements IActivityService {
    @Autowired
    private IActivityRepository aR;

    @Override
    public List<Activity> list() {
        return aR.findAll();
    }

    @Override
    public void insert(Activity activity) {
        aR.save(activity);
    }

    @Override
    public void update(Activity activity) {
        aR.save(activity);
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }
}
