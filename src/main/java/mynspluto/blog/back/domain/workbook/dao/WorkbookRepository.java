package mynspluto.blog.back.domain.workbook.dao;

import mynspluto.blog.back.domain.workbook.Workbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkbookRepository extends JpaRepository<Workbook, Long> {
}

