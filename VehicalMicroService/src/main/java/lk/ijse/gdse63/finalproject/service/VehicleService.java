package lk.ijse.gdse63.finalproject.service;

import lk.ijse.gdse63.finalproject.dto.VehicleDTO;
import lk.ijse.gdse63.finalproject.exception.DeleteFailException;
import lk.ijse.gdse63.finalproject.exception.NotFoundException;
import lk.ijse.gdse63.finalproject.exception.SaveFailException;
import lk.ijse.gdse63.finalproject.exception.UpdateFailException;

import java.util.List;

public interface VehicleService {
    int saveVehicle(VehicleDTO dto) throws SaveFailException;

    VehicleDTO searchVehicle(int id) throws NotFoundException;

    List<VehicleDTO> searchByCategory(String category) throws NotFoundException;

    void updateVehicle(VehicleDTO dto) throws UpdateFailException;

    void deleteVehicle(int id) throws NotFoundException, DeleteFailException;

}
