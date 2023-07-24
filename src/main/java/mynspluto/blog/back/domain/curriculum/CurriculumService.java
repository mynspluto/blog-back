package mynspluto.blog.back.domain.curriculum;

import lombok.RequiredArgsConstructor;;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurriculumService {
    private final CurriculumRepository curriculumRepository;

    public Curriculum save(Curriculum curriculum) {
        return curriculumRepository.save(new Curriculum(curriculum.getName(), curriculum.getSubject()));
    }
}
