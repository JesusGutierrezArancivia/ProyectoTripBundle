package pe.edu.upc.tripbundle.serviceinterfaces;

import pe.edu.upc.tripbundle.entities.Users;

import java.util.List;

public interface IUsersService {
        public List<Users>list();

        public void insert(Users users);

        public void update(Users users);

        public void delete(int id);
}
