package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class pompe {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "code", nullable = false)
    private Long code;
    @ManyToOne(fetch = FetchType.EAGER)
    private citerne citerne;





}
