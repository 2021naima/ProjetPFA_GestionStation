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
    @Getter
    @Setter
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(name="nomeCarburant")
    private String nomProduit;
    @Getter
    @Setter
    @Column(name = "prixU", nullable = false)
    private float prixU;
    @Getter
    @Setter
    @Column(name = "quantite", nullable = false)
    private float quantite;



}
