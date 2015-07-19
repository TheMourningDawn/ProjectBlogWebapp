package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplyItemRepository extends MongoRepository<SupplyItem, String> {

    public List<SupplyItem> findAllByDescription(String heading);
    public SupplyItem findById(String id);
    public List<SupplyItem> findAll();

}
