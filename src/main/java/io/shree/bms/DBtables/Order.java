package io.shree.bms.DBtables;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String price;
    private String orderDate;
    private String delivDate;
    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "customer")

    private List<Customer> cust;
    private String preference;
    private String allergies;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDelivDate() {
        return delivDate;
    }

    public void setDelivDate(String delivDate) {
        this.delivDate = delivDate;
    }


    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public List<Customer> getCust() {
        return cust;
    }

    public void setCust(List<Customer> cust) {
        this.cust = cust;
    }
}
