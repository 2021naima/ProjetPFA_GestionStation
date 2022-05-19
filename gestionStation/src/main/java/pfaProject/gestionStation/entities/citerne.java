package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class citerne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="code_citerne")
    private String code;
    @Column(name="capacite")
    private String capacite;
    @Column(name="produit")
    private String produit;
    @Column(name="stockRestant")
    private float stockRestant;
    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="pompes")
    private List<pompe> pompes;



}
