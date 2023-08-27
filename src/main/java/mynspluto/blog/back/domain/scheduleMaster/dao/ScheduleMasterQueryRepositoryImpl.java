package mynspluto.blog.back.domain.scheduleMaster.dao;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import mynspluto.blog.back.domain.curriculum.Curriculum;

import javax.persistence.EntityManager;
import java.util.List;

import static mynspluto.blog.back.domain.curriculum.QCurriculum.curriculum;


public class ScheduleMasterQueryRepositoryImpl implements ScheduleMasterQueryRepository {
    private final JPAQueryFactory queryFactory;

    public ScheduleMasterQueryRepositoryImpl(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

//    @Override
//    public List<Curriculum> findBySubject(ScheduleMasterQueryParam curriculumParam) {
//        return queryFactory
//                .select(Projections.bean(Curriculum.class, curriculum.name, curriculum.subject))
//                .from(curriculum)
//                .fetch();
//    }
}
