package ru.ccoder.offsite.repository;

import org.springframework.data.repository.CrudRepository;

import ru.ccoder.offsite.entity.EntityNews;

public interface NewsRepository extends CrudRepository<EntityNews, Integer> {
	
}
