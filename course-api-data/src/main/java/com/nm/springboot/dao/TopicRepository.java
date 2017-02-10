package com.nm.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.nm.springboot.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
