package mynspluto.blog.back.domain.curriculum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/curriculum")
public class CurriculumController {
    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
        try {
            return String.format("curriculum hi", name);
        }
        catch(Exception e) {
            System.out.println("catch");
            System.out.println(e);
            return null;
        }
    }
}
