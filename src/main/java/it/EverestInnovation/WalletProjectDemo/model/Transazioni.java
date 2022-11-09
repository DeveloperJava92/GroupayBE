package it.EverestInnovation.WalletProjectDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transazioni")
public class Transazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idTransazioni;

    private String descrizione;
    private Date timestamp;
    private float transazioniOp;


}
