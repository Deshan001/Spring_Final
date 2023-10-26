package lk.ijse.gdse63.finalproject.repo;

import lk.ijse.gdse63.finalproject.entity.Hotel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepo extends CrudRepository<Hotel,Integer> {
    List<Hotel> findByStar(int star);
}