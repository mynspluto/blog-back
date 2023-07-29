package mynspluto.blog.back.domain.workbook.dao;

import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;

public class WorkbookQueryRepositoryImpl implements WorkbookQueryRepository {
    private final JPAQueryFactory queryFactory;

    public WorkbookQueryRepositoryImpl(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager);
    }
}
