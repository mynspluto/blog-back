package mynspluto.blog.back.domain.scheduleMaster;

import lombok.RequiredArgsConstructor;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumQueryParam;
import mynspluto.blog.back.domain.scheduleMaster.dao.ScheduleMasterRepository;
import mynspluto.blog.back.domain.workbook.Workbook;
import org.springframework.stereotype.Service;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleMasterService {
    private final ScheduleMasterRepository scheduleMasterRepository;

    public ScheduleMaster save(ScheduleMaster scheduleMaster) {
        return scheduleMasterRepository.save(scheduleMaster);
    }

//    public Curriculum saveWithWorkbooks(Curriculum curriculum, List<Workbook> workbooks) {
//        return null;
//    }
//
//    public List<Curriculum> findBySubject(CurriculumQueryParam curriculumQueryParam) {
//        return curriculumRepository.findBySubject(curriculumQueryParam);
//    }
}
