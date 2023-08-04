package mynspluto.blog.back.curriculum;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import mynspluto.blog.back.domain.curriculum.CurriculumService;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumQueryParam;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumRepository;
import mynspluto.blog.back.domain.workbook.Workbook;
import mynspluto.blog.back.domain.workbook.WorkbookService;
import mynspluto.blog.back.domain.workbook.dao.WorkbookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Service
@SpringBootTest
public class CurriculumServiceTest {

    @Autowired
    CurriculumService curriculumService;

    @Autowired
    WorkbookService workbookService;


    @Test
    public void save() {
        Curriculum curriculum = curriculumService.save(new Curriculum("과학 3-1", "과학8123"));
        System.out.println("curriculum");
        System.out.println(curriculum);

        assertThat(true).isEqualTo(true);
    }

    @Test
    public void saveWithWorkbooks() {
        Curriculum curriculum = new Curriculum("과학 3-1", "과학8123");
        curriculum.addWorkbook(new Workbook("345"));
        curriculum.addWorkbook(new Workbook("567"));


        curriculumService.save(curriculum);
        System.out.println(curriculum);
    }

    @Test
    public void test2() {
        curriculumService.save(new Curriculum("과학 3-1", "과학8123"));
        curriculumService.save(new Curriculum("사회 3-1", "사회123"));

        CurriculumQueryParam curriculumQueryParam = new CurriculumQueryParam();
        curriculumQueryParam.setName("123");
        curriculumQueryParam.setName("456");

        List<Curriculum> curriculumList = curriculumService.findBySubject(new CurriculumQueryParam());
        System.out.println("curriculumList");
        System.out.println(curriculumList);
    }
}
