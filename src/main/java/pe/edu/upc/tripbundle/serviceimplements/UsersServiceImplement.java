package pe.edu.upc.tripbundle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tripbundle.entities.Users;
import pe.edu.upc.tripbundle.repositories.IUsersRepository;
import pe.edu.upc.tripbundle.serviceinterfaces.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private IUsersRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public void update(Users users) {
        uR.save(users);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }
}
