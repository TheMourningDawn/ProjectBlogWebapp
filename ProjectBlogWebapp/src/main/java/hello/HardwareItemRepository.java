package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HardwareItemRepository extends MongoRepository<ProjectHardwareItem, String> {

    public List<ProjectHardwareItem> findAllByDescription(String heading);
    public ProjectHardwareItem findById(String id);
    public List<ProjectHardwareItem> findAll();

}
