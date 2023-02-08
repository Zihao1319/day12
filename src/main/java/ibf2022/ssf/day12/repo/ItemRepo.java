package ibf2022.ssf.day12.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ibf2022.ssf.day12.model.Item;

//more for liaising with database
@Repository
public class ItemRepo {

    private List<Item> itemList;

    public List<Item> getCartItems() {

        itemList = new ArrayList<Item>();

        Item itm = new Item();
        itm.setItemName("louis vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("hermes");
        itm.setQuantity(6);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("prada");
        itm.setQuantity(10);
        itemList.add(itm);

        return itemList;
    }

}
