package ik.ijse.gdse63.finalproject.service;

import ik.ijse.gdse63.finalproject.dto.UserDTO;
import ik.ijse.gdse63.finalproject.exeption.CreateFailException;
import ik.ijse.gdse63.finalproject.exeption.DeleteFailException;
import ik.ijse.gdse63.finalproject.exeption.UpdateFailException;
import ik.ijse.gdse63.finalproject.exeption.UserNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDTO searchUserByEmail(String email) throws UserNotFoundException;
    void  updateUser(UserDTO email) throws UpdateFailException;
    int addUsers(UserDTO email) throws CreateFailException;
    void deleteUser(String email) throws DeleteFailException;

    List<UserDTO> getAll(String email) throws UserNotFoundException;
}
