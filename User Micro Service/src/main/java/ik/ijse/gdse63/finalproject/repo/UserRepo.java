package ik.ijse.gdse63.finalproject.repo;


import ik.ijse.gdse63.finalproject.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByEmail(String email);
    void deleteByEmail(String email);

    @Modifying
    @Transactional
    @Query(value = "update user u set u.profile_pic = ? , u.nic_front_img = ? ," + "u.nic+rear_img = ? where u.email = ?",
            nativeQuery = true)
    void updateImages(String ProfilePic, String nicFrontImg,String nicRearImg, String email);

    @Modifying
    @Query("update user u set u.username = : username, u.password = :password, u.usernic = :usernic, u.contact = :contact, u,birthday = :birthday, u.gender = :gender, u.remark = :remark where  u.email = :email")
    void updateUserInfoByEmail(
            String username,
            String paawaord,
            String usernic,
            String contact,
            String email,
            String birthday,
            String gender,
            String remark
    );
}
