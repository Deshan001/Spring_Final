package lk.ijse.gdse63.finalproject.repo;


import lk.ijse.gdse63.finalproject.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin, String> {

    Admin findByEmail(String email);

}
