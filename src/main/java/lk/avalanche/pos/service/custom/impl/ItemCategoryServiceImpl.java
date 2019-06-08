package lk.avalanche.pos.service.custom.impl;

import lk.avalanche.pos.dto.ItemCategoryDTO;
import lk.avalanche.pos.entity.ItemCategory;
import lk.avalanche.pos.repository.ItemCategoryRepository;
import lk.avalanche.pos.repository.ItemRepository;
import lk.avalanche.pos.service.custom.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 2:10 PM}
 */

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    ItemCategoryRepository itemCategoryRepository;

    @Override
    public List<ItemCategoryDTO> findAll() {
        return itemCategoryRepository.findAll().stream().map(c -> {
            return new ItemCategoryDTO(c.getItem_category_id(), c.getName(),c.getDiscount());
        }).collect(Collectors.toList());
    }

    @Override
    public ItemCategoryDTO getrById(int id) {

        ItemCategory itemCategory = itemCategoryRepository.getOne(id);
        return new ItemCategoryDTO(itemCategory.getItem_category_id(), itemCategory.getName(), itemCategory.getDiscount());
    }

    @Override
    public void update(ItemCategoryDTO itemCategoryDTO) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(ItemCategoryDTO itemCategoryDTO) {

    }
}
