package ik.ijse.gdse63.finalproject.api;

import ik.ijse.gdse63.finalproject.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin

public class UserApi {
    @GetMapping(value = "/{id:\\d+}")

    public void search(@PathVariable String id){
        System.out.println("Search Pressed" + id);

    }
    @PostMapping
    public void save(@RequestBody UserDTO userDTO){
        System.out.println("Save Pressed" + userDTO);

    }
    @PutMapping
    public void update(@RequestBody UserDTO userDTO){
        System.out.println("Update Pressed" +userDTO);

    }
    @DeleteMapping(value = "/{id :\\d+}")
    public void delete(@PathVariable int id){
        System.out.println("Delete Pressed" + id);

    }
}
