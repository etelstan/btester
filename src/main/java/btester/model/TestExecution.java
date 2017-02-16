package btester.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
@Data
@Entity(name = "testExecution")
public class TestExecution {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_testId", nullable = false)
    private Test test;

    @Column(nullable = false)
    private TestResult result;

    @ManyToOne
    @JoinColumn(name = "fk_deploymentId")
    private Deployment deployment;

    @ManyToOne
    @JoinColumn(name = "fk_executorId")
    private User executor;

}
