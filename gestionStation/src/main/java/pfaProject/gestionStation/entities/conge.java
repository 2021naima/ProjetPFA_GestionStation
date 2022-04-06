package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class conge {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(name="debut")
    private LocalDate debut;

}
