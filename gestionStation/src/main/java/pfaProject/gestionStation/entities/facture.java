package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class facture {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idFacture;
    @Getter
    @Setter
    @Column(name="dateFacture")
    private LocalDate dateFacture;
    @Getter
    @Setter
    @Column(name="quantiteProduit")
    private Long quantiteProduit;
    @Getter
    @Setter
    @Column(name="montant")
    private Long montant;




}
