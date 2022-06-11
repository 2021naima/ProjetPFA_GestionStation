package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class carburant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="nomeCarburant")
    private String nomProduit;

    @Column(name = "prixU", nullable = false)
    private float prixU;

    @Column(name = "quantite", nullable = false)
    private float quantiteStock;



}
