package pfaProject.gestionStation.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "codeClient")
    private String code;
    @Column(name = "Nom")
    private String Nom;
    @Column(name="tel")
    private String tel;
    @Column(name="adresse")
    private String adresse;
}
