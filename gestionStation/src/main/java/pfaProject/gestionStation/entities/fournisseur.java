package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class fournisseur {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Getter
    @Setter
    @Column(name = "RaisonSocial")
    private String RaisonSocial;
    @Getter
    @Setter
    @Column(name="tel")
    private String tel;
    @Getter
    @Setter
    @Column(name="adresse")
    private String adresse;
}
