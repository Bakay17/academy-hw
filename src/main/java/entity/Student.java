package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student_it")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "course_id", nullable = false)
    @ManyToOne
    private Course course;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @JoinColumn(name = "mentor_id", nullable = false)
    @ManyToOne
    private Mentor mentor;
}
