package com.ayankhan.springBlog.service;

import com.ayankhan.springBlog.model.Blog;
import com.ayankhan.springBlog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog); // Save the blog
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll(); // Get all blogs
    }

    public Optional<Blog> getBlogById(String id) {
        return blogRepository.findById(id); // Find by ID
    }

    public Blog updateBlog(String id, Blog newBlog) {
        Optional<Blog> existingBlog = blogRepository.findById(id);
        if (existingBlog.isPresent()) {
            Blog blog = existingBlog.get();
            blog.setTitle(newBlog.getTitle());
            blog.setContent(newBlog.getContent());
            return blogRepository.save(blog);
        }
        return null;
    }

    public void deleteBlog(String id) {
        blogRepository.deleteById(id); // Delete by ID
    }

    public Blog saveBlog(Blog blog) {
    return blogRepository.save(blog);
}


    public List<String> getAllAuthors() {
    return blogRepository.findAllAuthors();
}

}
