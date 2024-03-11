package BackEnd.repository;

import BackEnd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User,Integer>{
//here writing queryes
}
