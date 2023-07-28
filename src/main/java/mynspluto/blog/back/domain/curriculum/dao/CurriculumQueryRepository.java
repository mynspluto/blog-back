package mynspluto.blog.back.domain.curriculum.dao;

import mynspluto.blog.back.domain.curriculum.Curriculum;

import java.util.List;

public interface CurriculumQueryRepository {
    List<Curriculum> findBySubject(CurriculumQueryParam curriculumQueryParam);
}
