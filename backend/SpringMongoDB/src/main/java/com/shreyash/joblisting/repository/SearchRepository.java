package com.shreyash.joblisting.repository;

import com.shreyash.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
