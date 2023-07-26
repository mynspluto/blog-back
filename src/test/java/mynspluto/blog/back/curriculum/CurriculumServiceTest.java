package mynspluto.blog.back.curriculum;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import mynspluto.blog.back.domain.curriculum.CurriculumQueryParam;
import mynspluto.blog.back.domain.curriculum.CurriculumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Service
@SpringBootTest
public class CurriculumServiceTest {

    @Autowired
    CurriculumRepository curriculumRepository;

    @Test
    public void save() {
        Curriculum curriculum = curriculumRepository.save(new Curriculum("과학 3-1", "과학8123"));
        System.out.println("curriculum");
        System.out.println(curriculum);

        assertThat(true).isEqualTo(true);
    }

    @Test
    public void test2() {
        curriculumRepository.save(new Curriculum("과학 3-1", "과학8123"));
        curriculumRepository.save(new Curriculum("사회 3-1", "사회123"));

        CurriculumQueryParam curriculumQueryParam = new CurriculumQueryParam();
        curriculumQueryParam.setName("123");
        curriculumQueryParam.setName("456");

        List<Curriculum> curriculumList = curriculumRepository.findBySubject(curriculumQueryParam);
        System.out.println("curriculumList");
        System.out.println(curriculumList);
    }
}
