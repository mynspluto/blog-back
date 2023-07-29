package mynspluto.blog.back.domain.workbook;

import lombok.RequiredArgsConstructor;
import mynspluto.blog.back.domain.workbook.dao.WorkbookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkbookService {
    private final WorkbookRepository workbookRepository;

    public Workbook save(Workbook workbook) {
        return workbookRepository.save(new Workbook(workbook.getName(), workbook.getCurriculum()));
    }
}
