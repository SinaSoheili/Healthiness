package net.sinasoheili.healthiness.BloodGlucose;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BloodGlucoseEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private LocalDateTime localDateTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodGlucoseState state;
}
