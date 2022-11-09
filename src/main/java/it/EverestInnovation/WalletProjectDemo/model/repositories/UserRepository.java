package it.EverestInnovation.WalletProjectDemo.model.repositories;

import it.EverestInnovation.WalletProjectDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    //public List<User> getUserByWalletId(Integer userId);


}