package dawissem.Spring_Boot_CRUD.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Produit_list")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantite;
    private double prix;


}
