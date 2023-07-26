package mynspluto.blog.back.domain.curriculum;

import java.util.List;

public interface CurriculumQueryRepository {
    List<Curriculum> findBySubject(CurriculumQueryParam curriculumQueryParam);
}
