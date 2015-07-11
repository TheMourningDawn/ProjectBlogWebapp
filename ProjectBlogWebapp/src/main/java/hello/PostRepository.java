package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

    public List<Post> findAllByTitle(String heading);
    public Post findById(String id);

}
