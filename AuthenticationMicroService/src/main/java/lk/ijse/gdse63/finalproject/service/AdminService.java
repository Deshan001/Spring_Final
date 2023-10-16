package lk.ijse.gdse63.finalproject.service;

import lk.ijse.gdse63.finalproject.dto.AdminDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService {
    AdminDTO searchUser(String email);
}
