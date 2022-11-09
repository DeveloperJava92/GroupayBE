package it.EverestInnovation.WalletProjectDemo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    @Size(max = 254, message = "Email può contenere fino a 254 caratteri")
    @Pattern(regexp = "[^@]+@[^\\.]+\\..+", message = "Formato Email non valido")
    private String email;

    @Column(name = "username", unique = true, nullable = false)
    @Size(min = 3, max = 30, message = "Username deve contenere un minimo di 3 caratteri ed un massimo di 30")
    @Pattern(regexp = "[\\w]+", message = "Username può contenere lettere maiuscole, underscore e numeri")
    private String username;

    @NotNull
    @Column(name = "password")
    @Size(min = 6, max = 8, message = "La password deve contenere minimo 6 caratteri, massimo 8 caratteri")
    private String password;

    @NotNull
    @Column(name = "conferma_password")
    @Size(min = 6, max = 8)
    private String confermaPassword;

    @NotNull
    private String tipoUtenza;

    @NotNull
    private String tipoWallet;


}

