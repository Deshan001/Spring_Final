package lk.ijse.gdse63.usertravelpackagemicroservice.service;

import lk.ijse.gdse63.usertravelpackagemicroservice.dto.UserTravelPackageDTO;
import lk.ijse.gdse63.usertravelpackagemicroservice.exception.SaveFailException;

public interface UserTravelPackageService {
    int save(UserTravelPackageDTO ob) throws SaveFailException;

}
