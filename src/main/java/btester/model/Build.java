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
@Entity(name = "build")
public class Build {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_productId", nullable = false)
    private Product product;

    @Column(nullable = false)
    private String buildNumber;

    @ManyToOne
    @JoinColumn(name = "fk_iterationId")
    private Iteration iteration;
}
