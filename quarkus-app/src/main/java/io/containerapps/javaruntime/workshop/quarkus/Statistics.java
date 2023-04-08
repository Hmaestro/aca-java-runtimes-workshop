package io.containerapps.javaruntime.workshop.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.Duration;
import java.time.Instant;

@Entity
@Table(name = "Statistics_Quarkus")
public class Statistics extends PanacheEntity {

    @Column(name = "done_at")
    public Instant doneAt = Instant.now();
    public Framework framework = Framework.QUARKUS;
    public Type type;
    public String parameter;
    public Duration duration;
    public String description;
}

