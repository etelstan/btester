package btester.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
@Data
@Entity(name = "testPlan")
public class TestPlan {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @ManyToMany
    @JoinTable(name = "testPlan2test",
            joinColumns = {@JoinColumn(name = "fk_testPlanId")},
            inverseJoinColumns = {@JoinColumn(name = "fk_testId")}
    )
    private List<Test> tests;

    @ManyToOne
    @JoinColumn(name = "fk_iterationId")
    private Iteration iteration;

    @ManyToMany
    @JoinTable(name = "testPlan2label",
            joinColumns = {@JoinColumn(name = "fk_testPlanId")},
            inverseJoinColumns = {@JoinColumn(name = "fk_labelId")}
    )
    private List<Label> labels;

    @ManyToOne
    @JoinColumn(name = "fk_assigneeId")
    private User assignee;

}
