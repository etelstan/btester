package btester.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
@Entity(name = "deployment")
public class Deployment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_environmentId", nullable = false)
    private Environment environment;

    @ManyToOne
    @JoinColumn(name = "fk_buildId", nullable = false)
    private Build build;

    @Column
    private LocalDateTime rolloutDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public LocalDateTime getRolloutDatetime() {
        return rolloutDatetime;
    }

    public void setRolloutDatetime(LocalDateTime rolloutDatetime) {
        this.rolloutDatetime = rolloutDatetime;
    }
}
