package infinity.blog.repositories;

import java.util.List;

import infinity.blog.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

    public List<Post> findAllByTitle(String heading);
    public Post findById(String id);

}
