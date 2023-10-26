package lk.ijse.gdse63.finalproject.service;

import lk.ijse.gdse63.finalproject.dto.HotelDTO;
import lk.ijse.gdse63.finalproject.exception.DeleteFailException;
import lk.ijse.gdse63.finalproject.exception.NotFoundException;
import lk.ijse.gdse63.finalproject.exception.SaveFailException;
import lk.ijse.gdse63.finalproject.exception.UpdateFailException;

import java.util.List;

public interface HotelService {
    int save(HotelDTO hotelDTO) throws SaveFailException;
    void update(HotelDTO hotelDTO) throws UpdateFailException;
    void delete(int id) throws DeleteFailException, NotFoundException;
    HotelDTO search(int id) throws NotFoundException;
    List<HotelDTO> findByStarRate(int id) throws NotFoundException;
}
