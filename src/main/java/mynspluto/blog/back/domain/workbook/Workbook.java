package mynspluto.blog.back.domain.workbook;

import lombok.Data;
import mynspluto.blog.back.domain.curriculum.Curriculum;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Workbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    public Workbook(String name) {
        this.name = name;
    }
}
