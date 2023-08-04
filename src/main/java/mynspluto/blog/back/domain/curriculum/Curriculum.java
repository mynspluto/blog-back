package mynspluto.blog.back.domain.curriculum;

import lombok.*;
import mynspluto.blog.back.domain.workbook.Workbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL)
    private List<Workbook> workbooks = new ArrayList<Workbook>();

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public List<Workbook> getWorkbooks() {
        return this.workbooks;
    }

    public Curriculum(String name, String subject, List<Workbook> workbooks) {
        this.name = name;
        this.subject = subject;
        this.workbooks = workbooks;
    }

    public void addWorkbook(Workbook workbook) {
        this.workbooks.add(workbook);
        if (workbook.getCurriculum() != this) {
            System.out.println("workbook.getCurriculum() != this");
            workbook.setCurriculum(this);
        }
    }
}
