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

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    @JoinColumn(name = "type_of_sport_id", nullable = false)
    private TypeToSport typeToSport;

    @ManyToOne
    @JoinColumn(name = "clubs_id")
    private Clubs clubs;


}
