package mynspluto.blog.back.domain.scheduleMaster.dao;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import mynspluto.blog.back.domain.scheduleMaster.ScheduleMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleMasterRepository extends JpaRepository<ScheduleMaster, Long>, ScheduleMasterQueryRepository {
}
