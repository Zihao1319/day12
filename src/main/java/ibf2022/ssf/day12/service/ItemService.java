package ibf2022.ssf.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.ssf.day12.model.Item;
import ibf2022.ssf.day12.repo.ItemRepo;

// more for getting data and doing some computing from database, can liaiase with more than 1 repo (db)
@Service
public class ItemService {

    @Autowired
    ItemRepo itmRepo;

    public List<Item> retrieveItemList() {
        return itmRepo.getCartItems();
    }

}
