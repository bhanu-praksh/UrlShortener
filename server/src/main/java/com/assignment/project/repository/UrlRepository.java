package com.assignment.project.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.assignment.project.model.Url;


@Repository
public interface UrlRepository extends MongoRepository<Url, Integer> {
	
	public Url findByShortLink(String shortLink);

}
