package btester.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
@Entity(name = "test")
public class Test {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private TestType testType;

    @Column
    private String description;

    @OneToMany(mappedBy = "test")
    private List<TestStep> steps;

    @ManyToOne
    @JoinColumn(name = "fk_iterationId")
    private Iteration iteration;

    @ManyToMany
    @JoinTable(name = "test2product",
            joinColumns = {@JoinColumn(name = "fk_testId")},
            inverseJoinColumns = {@JoinColumn(name = "fk_productId")}
    )
    private List<Product> products;

    @ManyToMany
    @JoinTable(name = "test2label",
            joinColumns = {@JoinColumn(name = "fk_testId")},
            inverseJoinColumns = {@JoinColumn(name = "fk_labelId")}
    )
    private List<Label> labels;

    @ManyToOne
    @JoinColumn(name = "fk_ownerId")
    private User owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TestStep> getSteps() {
        return steps;
    }

    public void setSteps(List<TestStep> steps) {
        this.steps = steps;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
