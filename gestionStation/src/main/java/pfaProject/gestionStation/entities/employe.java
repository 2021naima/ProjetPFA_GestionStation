package pfaProject.gestionStation.entities;

import lombok.*;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class employe {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(name="nom")
    private String nom;
    @Getter
    @Setter
    @Column(name="prenom")
    private String prenom;
    @Getter
    @Setter
    @Column(name="tel")
    private String tel;
    @Getter
    @Setter
    @Column(name="occupation")
    private String occupation;


}
