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
@Entity(name = "testStep")
public class TestStep {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_testId")
    private Test test;

    @Column(nullable = false)
    private Integer ordinal;

    @Column
    private String description;

    @Column
    private String expectedResult;

}
