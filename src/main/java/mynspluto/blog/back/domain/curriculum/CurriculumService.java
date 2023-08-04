package mynspluto.blog.back.domain.curriculum;

import lombok.RequiredArgsConstructor;;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumQueryParam;
import mynspluto.blog.back.domain.workbook.Workbook;
import org.springframework.stereotype.Service;
import mynspluto.blog.back.domain.curriculum.dao.CurriculumRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurriculumService {
    private final CurriculumRepository curriculumRepository;

    public Curriculum save(Curriculum curriculum) {
        return curriculumRepository.save(curriculum);
    }

    public Curriculum saveWithWorkbooks(Curriculum curriculum, List<Workbook> workbooks) {

        return null;
    }

    public List<Curriculum> findBySubject(CurriculumQueryParam curriculumQueryParam) {
        return curriculumRepository.findBySubject(curriculumQueryParam);
    }

    //1. curriculum 생성
    //2. workbook 생성하면서 curriculum_id 삽입(프론트에서 엑셀로 workbooks 삽입)
    //3. schedule-master, schedule-detail 도메인 생성 및 구현
    //4. 시간표 생성, 조회, 수정 기능 구현

}
