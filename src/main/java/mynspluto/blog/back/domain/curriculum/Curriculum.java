package mynspluto.blog.back.domain.curriculum;

import lombok.*;
import mynspluto.blog.back.domain.workbook.Workbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "curriculum")
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String subject;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Workbook> workbooks = new ArrayList<Workbook>();

    public Curriculum(String name, String subject, List<Workbook> workbooks) {
        this.name = name;
        this.subject = subject;
        this.workbooks = workbooks;
    }
}
