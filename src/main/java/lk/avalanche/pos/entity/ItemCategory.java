package lk.avalanche.pos.entity;

import javax.persistence.*;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 1:42 PM}
 */

@Entity
@Table(name = "item_category")
public class ItemCategory {

    @Id
    @GeneratedValue()
    @Column(name = "item_category_id")
    private int item_category_id;

    @Column(name = "name")
    private String name;

    @Column(name = "discount")
    private double discount;

    public ItemCategory() {
    }

    public ItemCategory(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public int getItem_category_id() {
        return item_category_id;
    }

    public void setItem_category_id(int item_category_id) {
        this.item_category_id = item_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ItemCategoryDTO{" +
                "item_category_id=" + item_category_id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}
