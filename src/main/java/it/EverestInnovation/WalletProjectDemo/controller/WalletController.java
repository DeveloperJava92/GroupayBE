package it.EverestInnovation.WalletProjectDemo.controller;

import it.EverestInnovation.WalletProjectDemo.model.Wallet;
import it.EverestInnovation.WalletProjectDemo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    WalletService walletService;

    @GetMapping("")
    public List<Wallet> listAllWallet(){
        return walletService.listAllWallet();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Wallet> getWallet(@PathVariable Integer id){
        return walletService.getWallet(id);
    }

    @PostMapping("")
    public void addWallet(@RequestBody Wallet wallet){
        walletService.saveWallet(wallet);
    }

    @PutMapping("")
    public Wallet update(@RequestBody Wallet wallet){
        return walletService.updateWallet(wallet);
    }

    @DeleteMapping("/{id}")
    public void deleteWallet(@PathVariable Integer id){
        walletService.deleteWallet(id);
    }
}
