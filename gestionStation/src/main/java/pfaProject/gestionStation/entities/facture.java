package pfaProject.gestionStation.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idFacture;
    @Column(name="dateFacture")
    private LocalDate dateFacture;
    @Column(name="quantiteProduit")
    private Long quantiteProduit;
    @Column(name="montant")
    private Long montant;




}
