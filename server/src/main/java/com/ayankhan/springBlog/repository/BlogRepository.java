package com.ayankhan.springBlog.repository;

import com.ayankhan.springBlog.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {
    @Query(value = "{}", fields = "{'author' : 1}", sort = "{'author' : 1}")
List<String> findAllAuthors();

}
