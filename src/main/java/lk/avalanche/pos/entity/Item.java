package lk.avalanche.pos.entity;

import javax.persistence.*;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 1:41 PM}
 */

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue()
    @Column(name = "item_id")
    private int item_id;

    @ManyToOne
    @JoinColumn(name = "item_category_id", referencedColumnName = "item_category_id")
    private ItemCategory item_category_id;

    @Column(name = "item_code")
    private int item_code;

    @Column(name = "name")
    private String name;

    @Column(name = "discount")
    private double discount;

    @Column(name = "selling_price")
    private double selling_price;

    @Column(name = "available_qty")
    private double available_qty;

    public Item() {
    }

    public Item(ItemCategory item_category_id, int item_code, String name, double discount, double selling_price, double available_qty) {
        this.item_category_id = item_category_id;
        this.item_code = item_code;
        this.name = name;
        this.discount = discount;
        this.selling_price = selling_price;
        this.available_qty = available_qty;
    }



    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", item_category_id=" + item_category_id +
                ", item_code=" + item_code +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", selling_price=" + selling_price +
                ", available_qty=" + available_qty +
                '}';
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public ItemCategory getItem_category_id() {
        return item_category_id;
    }

    public void setItem_category_id(ItemCategory item_category_id) {
        this.item_category_id = item_category_id;
    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
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

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

    public double getAvailable_qty() {
        return available_qty;
    }

    public void setAvailable_qty(double available_qty) {
        this.available_qty = available_qty;
    }
}
