package lk.ijse.gdse63.finalproject.api;

import lk.ijse.gdse63.finalproject.dto.GuideDTO;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/guide")
@CrossOrigin
public class GuideApi {
        @GetMapping(value = "/{id:\\d+}")

        public void search(@PathVariable String id){
            System.out.println("Search Pressed" + id);

        }
        @PostMapping
        public void save(@RequestBody GuideDTO guideDTO){
            System.out.println("Save Pressed" + guideDTO);

        }
        @PutMapping
        public void update(@RequestBody GuideDTO guideDTO){
            System.out.println("Update Pressed" +guideDTO);

        }
        @DeleteMapping(value = "/{id:\\d+}")
        public void delete(@PathVariable int id){
            System.out.println("Delete Pressed" + id);

        }

}
