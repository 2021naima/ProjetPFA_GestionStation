package pfaProject.gestionStation.entities;

import lombok.*;

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
    @Getter
    @Setter
    @Column(name="nomProduit")
    private String nomProduit;
    @Getter
    @Setter
    @Column(name = "prixU", nullable = false)
    private float prixU;
    @Getter
    @Setter
    @Column(name = "typeProduit", nullable = false)
    private float typeProduit;


}
