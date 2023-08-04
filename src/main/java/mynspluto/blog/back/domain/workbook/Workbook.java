package mynspluto.blog.back.domain.workbook;

import lombok.Data;
import mynspluto.blog.back.domain.curriculum.Curriculum;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Workbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    public Curriculum getCurriculum() {
        return this.curriculum;
    }

    public String getName() {
        return this.name;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
        System.out.println("this.curriculum = curriculum");
        if (!curriculum.getWorkbooks().contains(this)) {
            System.out.println("workbook this");
            System.out.println(this);
            curriculum.getWorkbooks().add(this);
        }
    }

    public Workbook(String name) {
        this.name = name;
    }

    public Workbook(String name, Curriculum curriculum) {
        this.name = name;
        this.curriculum = curriculum;
    }
}
