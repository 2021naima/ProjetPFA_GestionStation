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
public class fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "RaisonSocial")
    private String RaisonSocial;
    @Column(name="tel")
    private String tel;
    @Column(name="adresse")
    private String adresse;
}
