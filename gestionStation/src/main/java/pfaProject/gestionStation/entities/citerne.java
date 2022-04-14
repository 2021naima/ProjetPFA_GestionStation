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
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idCiterne;
    @Getter
    @Setter
    @Column(name="capacite")
    private String capacite;
    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="pompes")
    private List<pompe> pompes;



}
