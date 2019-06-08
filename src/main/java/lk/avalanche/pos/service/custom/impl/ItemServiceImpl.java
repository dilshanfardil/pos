package lk.avalanche.pos.service.custom.impl;

import lk.avalanche.pos.dto.ItemCategoryDTO;
import lk.avalanche.pos.dto.ItemDTO;
import lk.avalanche.pos.entity.Item;
import lk.avalanche.pos.entity.ItemCategory;
import lk.avalanche.pos.repository.ItemRepository;
import lk.avalanche.pos.service.custom.ItemCategoryService;
import lk.avalanche.pos.service.custom.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 2:07 PM}
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<ItemDTO> findAll() {
        List<Item> all = itemRepository.findAll();

        List<ItemDTO> returnList = new ArrayList<>();

        for (int i = 0; i < all.size(); i++) {

            Item item = all.get(i);
            ItemCategory itemCategory = item.getItem_category_id();
            ItemCategoryDTO itemCategoryDTO = new ItemCategoryDTO(
                    itemCategory.getItem_category_id(),
                    itemCategory.getName(),
                    itemCategory.getDiscount());


            returnList.add(new ItemDTO(
                    item.getItem_id(), itemCategoryDTO, item.getItem_code(), item.getName(), item.getDiscount(), item.getSelling_price(), item.getAvailable_qty()
            ));


        }

        return returnList;
    }

    @Override
    public ItemDTO getrById(int id) {
        return null;
    }

    @Override
    public void update(ItemDTO itemDTO) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(ItemDTO itemDTO) {

    }
}
