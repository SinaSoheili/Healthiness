package net.sinasoheili.healthiness.BloodPressure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class BloodPressureEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private float systolic;

    @Column(nullable = false)
    private float diastolic;

    @Column(nullable = false)
    private LocalDateTime localDateTime;
}
