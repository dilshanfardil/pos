package lk.avalanche.pos.dto;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 1:51 PM}
 */


public class ItemDTO extends SuperDTO{

    private int ItemId;
    private ItemCategoryDTO itemCategory;
    private int itemCode;
    private String name;
    private double discount;
    private double sellingPrice;
    private double availableQty;

    public ItemDTO() {
    }

    public ItemDTO(int itemId, ItemCategoryDTO itemCategory, int itemCode, String name, double discount, double sellingPrice, double availableQty) {
        ItemId = itemId;
        this.itemCategory = itemCategory;
        this.itemCode = itemCode;
        this.name = name;
        this.discount = discount;
        this.sellingPrice = sellingPrice;
        this.availableQty = availableQty;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "ItemId=" + ItemId +
                ", itemCategory=" + itemCategory +
                ", itemCode=" + itemCode +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", sellingPrice=" + sellingPrice +
                ", availableQty=" + availableQty +
                '}';
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public ItemCategoryDTO getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategoryDTO itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
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

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(double availableQty) {
        this.availableQty = availableQty;
    }
}
