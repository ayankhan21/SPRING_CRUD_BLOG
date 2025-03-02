    package com.blog.server.controller;

import com.ayankhan.springBlog.model.Blog;
import com.ayankhan.springBlog.service.BlogService;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("/api/blogs")
    public class BlogController {

        @Autowired
        private BlogService blogService;

        // Create Blog
        @PostMapping
        public Blog createBlog(@RequestBody Blog blog) {
            return blogService.saveBlog(blog);
        }

        // Get All Blogs
        @GetMapping
        public List<Blog> getAllBlogs() {
            return blogService.getAllBlogs();
        }

        @GetMapping("/authors")
    public List<String> getAllAuthors() {
        return blogService.getAllAuthors();
    }


        // Get Blog by ID
        @GetMapping("/{id}")
        public Optional<Blog> getBlogById(@PathVariable String id) {
            return blogService.getBlogById(id);
        }
    }
