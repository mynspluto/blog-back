package mynspluto.blog.back.domain.curriculum.dao;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long>, CurriculumQueryRepository {
}
