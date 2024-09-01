package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Activity;

import java.util.List;

public interface IActivityService {
    public List<Activity> list();

    public void insert(Activity activity);

    public void update(Activity activity);

    public void delete(int id);
}
