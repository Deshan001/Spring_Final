package lk.ijse.gdse63.finalproject.api;

import lk.ijse.gdse63.finalproject.dto.HotelDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotel")
@CrossOrigin
public class HotelApi {
    @GetMapping(value = "/{id:\\d+}")

    public void search(@PathVariable String id){
        System.out.println("Search Pressed" + id);

    }
    @PostMapping
    public void save(@RequestBody HotelDTO hotelDTO){
        System.out.println("Save Pressed" + hotelDTO);

    }
    @PutMapping
    public void update(@RequestBody HotelDTO hotelDTO){
        System.out.println("Update Pressed" +hotelDTO);

    }
    @DeleteMapping(value = "/{id:\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete Pressed" + id);

    }

}
