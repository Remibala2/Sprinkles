package org.generation.Sprinkles.repository;

import org.generation.Sprinkles.repository.entity.Item;
import org.springframework.data.repository.*;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}

//ItemRepository extends CrudRepository class
// and is able to access the methods that is available in the CrudRepository class

