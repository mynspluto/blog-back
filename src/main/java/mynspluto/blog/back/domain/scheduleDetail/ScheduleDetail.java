package mynspluto.blog.back.domain.scheduleDetail;

import lombok.*;
import mynspluto.blog.back.domain.scheduleMaster.ScheduleMaster;
import mynspluto.blog.back.domain.workbook.Workbook;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity(name = "schedule_detail")
public class ScheduleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Getter
    private int week;

    @NonNull
    @Getter
    private LocalDate startDate;

    @NonNull
    @Getter
    private LocalDate endDate;

    @Getter
    @ManyToOne
    @JoinColumn(name = "schedule_master_id")
    private ScheduleMaster scheduleMaster;

    public ScheduleDetail(int week, LocalDate startDate, LocalDate endDate) {
        this.week = week;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setScheduleMaster(ScheduleMaster scheduleMaster) {
        this.scheduleMaster = scheduleMaster;
        if (!scheduleMaster.getScheduleDetailList().contains(this)) {
            scheduleMaster.getScheduleDetailList().add(this);
        }
    }
}