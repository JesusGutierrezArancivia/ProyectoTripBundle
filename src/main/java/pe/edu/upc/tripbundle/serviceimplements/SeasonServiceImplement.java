package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Season;
import pe.edu.upc.tripbundle.repositories.ISeasonRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.ISeasonService;

import java.util.List;

@Service
public class SeasonServiceImplement implements ISeasonService {
    @Autowired
    private ISeasonRepository sR;

    @Override
    public List<Season> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Season season) {
        sR.save(season);
    }

    @Override
    public void update(Season season) {
        sR.save(season);
    }

}
