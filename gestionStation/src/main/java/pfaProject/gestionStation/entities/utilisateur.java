package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class utilisateur {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(name="email")
    private String email;
    @Getter
    @Setter
    @Column(name="password")
    private String password;
    @Getter
    @Setter
    @Column(name="nom")
    private String nom;
    @Getter
    @Setter
    @Column(name="prenom")
    private String prenom;

}
