package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "groups_it")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "course_id", nullable = false)
    @ManyToOne
    @ToString.Exclude
    private Course course;
}
