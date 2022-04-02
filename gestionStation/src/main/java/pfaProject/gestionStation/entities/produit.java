package pfaProject.gestionStation.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idProduit;
    @Column(name="nomProduit")
    private String nomProduit;
    @Column(name = "prixU", nullable = false)
    private float prixU;
    @Column(name = "typeProduit", nullable = false)
    private float typeProduit;


}
