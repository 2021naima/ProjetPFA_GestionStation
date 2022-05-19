package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class produit {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(name="code")
    private String code;
    @Getter
    @Setter
    @Column(name="designation")
    private String designation;
    @Getter
    @Setter
    @Column(name = "typeProduit", nullable = false)
    private String type;

    @Getter
    @Setter
    @Column(name = "prixU", nullable = false)
    private float prixU;
    @Getter
    @Setter
    @Column(name = "Quantite_restante", nullable = false)
    private float quantiteRestante;




}
