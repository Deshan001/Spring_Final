package lk.ijse.gdse63.finalproject.service;

import lk.ijse.gdse63.finalproject.dto.GuideDTO;
import lk.ijse.gdse63.finalproject.exception.DeleteFailException;
import lk.ijse.gdse63.finalproject.exception.SaveFailException;
import lk.ijse.gdse63.finalproject.exception.SearchFailException;
import lk.ijse.gdse63.finalproject.exception.UpdateFailException;

public interface GuideService {
    int saveGuide(GuideDTO guideDTO) throws SaveFailException;
    void updateGuide(GuideDTO guideDTO) throws UpdateFailException;
    void deleteGuide(int id) throws DeleteFailException;
    GuideDTO getGuide(int id) throws SearchFailException;
}
