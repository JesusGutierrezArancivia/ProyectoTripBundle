package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Season;

import java.util.List;

public interface ISeasonService {
    public List<Season> list();

    public void insert(Season season);

    public void update(Season season);

}
