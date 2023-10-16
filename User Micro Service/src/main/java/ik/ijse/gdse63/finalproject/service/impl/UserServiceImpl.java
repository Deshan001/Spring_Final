package ik.ijse.gdse63.finalproject.service.impl;


import ik.ijse.gdse63.finalproject.entity.User;
import ik.ijse.gdse63.finalproject.repo.UserRepo;
import ik.ijse.gdse63.finalproject.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    private final UserRepo userRepository;

    public UserServiceImpl(UserRepo userRepository){
        this.userRepository = userRepository;

    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        List<String> roles = new ArrayList<>();
        roles.add("USER");
        UserDetails userDetails =
                org.springframework.security.core.userdetails.User.builder()
                        .username(user.getEmail())
                        .password(user.getPassword())
                        .roles(roles.toArray(new String[0]))
                        .build();
        return userDetails;
    }
}
