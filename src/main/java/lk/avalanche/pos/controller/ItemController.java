package lk.avalanche.pos.controller;

import lk.avalanche.pos.dto.ItemDTO;
import lk.avalanche.pos.service.custom.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 2:10 PM}
 */

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @GetMapping
    public @ResponseBody
    List<ItemDTO> getClasses(){
        return itemService.findAll();
    }



}
