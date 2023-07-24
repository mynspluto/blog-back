package mynspluto.blog.back.curriculum;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import mynspluto.blog.back.domain.curriculum.CurriculumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.assertj.core.api.Assertions.assertThat;

@Service
@SpringBootTest
public class CurriculumService {

    @Autowired
    CurriculumRepository curriculumRepository;

    @Test
    public void save() {
        Curriculum curriculum = curriculumRepository.save(new Curriculum("과학 3-1", "과학8"));
        System.out.println("curriculum");
        System.out.println(curriculum);

        assertThat(true).isEqualTo(true);
    }
}
