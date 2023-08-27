package mynspluto.blog.back.domain.scheduleMaster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import mynspluto.blog.back.domain.scheduleDetail.ScheduleDetail;
import mynspluto.blog.back.domain.workbook.Workbook;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity(name = "schedule_master")
public class ScheduleMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Getter
    private String schoolLevel;

    @NonNull
    @Getter
    private String grade;

    @NonNull
    @Getter
    private String term;

    @NonNull
    @Getter
    private String ccIds;

    @OneToMany(mappedBy = "scheduleMaster", cascade = CascadeType.ALL)
    @Getter
    private List<ScheduleDetail> scheduleDetailList = new ArrayList<ScheduleDetail>();

    public ScheduleMaster(String schoolLevel, String grade, String term, String ccIds) {
        this.schoolLevel = schoolLevel;
        this.grade = grade;
        this.term = term;
        this.ccIds = ccIds;
    }

    public void addScheduleDetail(ScheduleDetail scheduleDetail) {
        this.scheduleDetailList.add(scheduleDetail);
        if (scheduleDetail.getScheduleMaster() != this) {
            System.out.println("scheduleDetail.getScheduleMaster() != this");
            scheduleDetail.setScheduleMaster(this);
        }
    }
}
