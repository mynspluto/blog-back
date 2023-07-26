package mynspluto.blog.back.domain.curriculum;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long>, CurriculumQueryRepository {
    List<Curriculum> findBySubject(String subject);
}
