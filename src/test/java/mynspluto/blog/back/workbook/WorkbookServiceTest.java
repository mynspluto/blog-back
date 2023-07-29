package mynspluto.blog.back.workbook;

import mynspluto.blog.back.domain.workbook.Workbook;
import mynspluto.blog.back.domain.workbook.dao.WorkbookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@Service
@SpringBootTest
public class WorkbookServiceTest {

    @Autowired
    WorkbookRepository workbookRepository;

    @Test
    public void save() {
        Workbook workbook = workbookRepository.save(new Workbook("123"));
        System.out.println("workbook");
        System.out.println(workbook);
    }
}
