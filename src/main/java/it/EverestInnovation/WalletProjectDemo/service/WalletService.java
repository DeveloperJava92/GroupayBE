package it.EverestInnovation.WalletProjectDemo.service;

import it.EverestInnovation.WalletProjectDemo.model.Wallet;
import it.EverestInnovation.WalletProjectDemo.model.repositories.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public List<Wallet> listAllWallet() {
        return walletRepository.findAll();
    }

    public void saveWallet(Wallet wallet) {
        walletRepository.save(wallet);
    }

    public ResponseEntity<Wallet> getWallet(Integer id) {
        try {
            Wallet wallet = walletRepository.findById(id).get();
            return new ResponseEntity<Wallet>(wallet, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Wallet>(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteWallet(Integer id) {
        walletRepository.deleteById(id);
    }

    public Wallet updateWallet(Wallet wallet){
        return walletRepository.saveAndFlush(wallet);
    }

    //public List<Wallet> getWalletByUser(Integer id){
    //return walletRepository.getWalletByUser(id);
    //}
}
