package ik.ijse.gdse63.finalproject.repo;


import ik.ijse.gdse63.finalproject.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
    User findByUsernameAndEmail(String username , String email);

    User findByEmail(String email);

}
