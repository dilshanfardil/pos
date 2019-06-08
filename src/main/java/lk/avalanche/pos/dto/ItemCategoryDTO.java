package lk.avalanche.pos.dto;

import javax.persistence.Column;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 1:51 PM}
 */


public class ItemCategoryDTO extends SuperDTO{

    private int itemCategoryId;
    private String name;
    private double discount;

    public ItemCategoryDTO() {
    }

    public ItemCategoryDTO(int itemCategoryId, String name, double discount) {
        this.itemCategoryId = itemCategoryId;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ItemCategoryDTO{" +
                "itemCategoryId=" + itemCategoryId +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }

    public int getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
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
}
