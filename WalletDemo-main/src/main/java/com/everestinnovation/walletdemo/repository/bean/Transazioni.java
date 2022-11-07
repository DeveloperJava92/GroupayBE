package com.everestinnovation.walletdemo.repository.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "transazioni")
public class Transazioni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idTransazioni;

    private String descrizione;
    private Date timestamp;
    private float transazioniOp;


}
