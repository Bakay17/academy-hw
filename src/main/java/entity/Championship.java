package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "championship")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @JoinColumn(name = "country_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Country country;

    @Column(name = "type_to_sport_id", nullable = false)
    @OneToMany(fetch = FetchType.LAZY)
    @ToString.Exclude
    private TypeToSport typeToSport;
}
