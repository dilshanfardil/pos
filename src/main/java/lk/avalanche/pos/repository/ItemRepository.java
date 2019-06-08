package lk.avalanche.pos.repository;

import lk.avalanche.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/8/2019
 * Time: 2:07 PM}
 */


public interface ItemRepository extends JpaRepository<Item, Integer> {
}
