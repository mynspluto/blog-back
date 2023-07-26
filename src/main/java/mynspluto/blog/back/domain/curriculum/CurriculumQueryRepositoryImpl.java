package mynspluto.blog.back.domain.curriculum;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;

import static mynspluto.blog.back.domain.curriculum.QCurriculum.curriculum;


public class CurriculumQueryRepositoryImpl implements CurriculumQueryRepository {
    private final JPAQueryFactory queryFactory;

    public CurriculumQueryRepositoryImpl(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<Curriculum> findBySubject(CurriculumQueryParam curriculumParam) {
        return queryFactory
                .select(Projections.bean(Curriculum.class, curriculum.name, curriculum.subject))
                .from(curriculum)
                .fetch();
    }
}
