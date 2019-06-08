package lk.avalanche.pos.service;

import lk.avalanche.pos.dto.SuperDTO;

import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 2:12 PM}
 */


public interface SuperService<T extends SuperDTO> {

    List<T> findAll();

    T getrById(int id);

    void update(T t);

    void delete(int id);

    void insert(T t);

}
