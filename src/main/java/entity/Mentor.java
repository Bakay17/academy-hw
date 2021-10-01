package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mentors_it")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Mentor {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "group_id", nullable = false)
    @ManyToOne
    private Group group;
}
