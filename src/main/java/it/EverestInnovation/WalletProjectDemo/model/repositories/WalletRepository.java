package it.EverestInnovation.WalletProjectDemo.model.repositories;

import it.EverestInnovation.WalletProjectDemo.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

    //public List<Wallet> getWalletByUser(Integer userId);
}
