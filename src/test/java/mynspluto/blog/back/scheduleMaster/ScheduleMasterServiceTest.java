package mynspluto.blog.back.scheduleMaster;

import mynspluto.blog.back.domain.curriculum.Curriculum;
import mynspluto.blog.back.domain.curriculum.CurriculumService;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumQueryParam;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumRepository;
import mynspluto.blog.back.domain.scheduleDetail.ScheduleDetail;
import mynspluto.blog.back.domain.scheduleMaster.ScheduleMaster;
import mynspluto.blog.back.domain.scheduleMaster.ScheduleMasterService;
import mynspluto.blog.back.domain.workbook.Workbook;
import mynspluto.blog.back.domain.workbook.WorkbookService;
import mynspluto.blog.back.domain.workbook.dao.WorkbookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Service
@SpringBootTest
public class ScheduleMasterServiceTest {

    @Autowired
    ScheduleMasterService scheduleMasterService;

    @Autowired
    WorkbookService workbookService;


    @Test
    public void save() {
        ScheduleMaster scheduleMaster = scheduleMasterService.save(new ScheduleMaster("초등", "3", "1", "1;2;3"));
        System.out.println("scheduleMaster");
        System.out.println(scheduleMaster.getCcIds());

        assertThat(true).isEqualTo(true);
    }

    @Test
    public void saveWithDetails() {
        ScheduleMaster scheduleMaster = scheduleMasterService.save(new ScheduleMaster("초등", "3", "1", "1;2;3"));
        scheduleMaster.addScheduleDetail(new ScheduleDetail(3, LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 8)));
        scheduleMaster.addScheduleDetail(new ScheduleDetail(3, LocalDate.of(2021, 5, 5), LocalDate.of(2022, 6, 15)));


        scheduleMasterService.save(scheduleMaster);
        System.out.println(scheduleMaster);
    }
//
//    @Test
//    public void test2() {
//        curriculumService.save(new Curriculum("과학 3-1", "과학8123"));
//        curriculumService.save(new Curriculum("사회 3-1", "사회123"));
//
//        CurriculumQueryParam curriculumQueryParam = new CurriculumQueryParam();
//        curriculumQueryParam.setName("123");
//        curriculumQueryParam.setName("456");
//
//        List<Curriculum> curriculumList = curriculumService.findBySubject(new CurriculumQueryParam());
//        System.out.println("curriculumList");
//        System.out.println(curriculumList);
//    }
}
