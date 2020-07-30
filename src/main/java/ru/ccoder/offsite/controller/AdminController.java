package ru.ccoder.offsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import ru.ccoder.offsite.dto.AddNewsRequest;
import ru.ccoder.offsite.entity.EntityNews;
import ru.ccoder.offsite.repository.NewsRepository;

@Api(
        value = "/ap"
)
@RestController
@RequestMapping({"/ap"})
@Slf4j
public class AdminController {
	
	@Autowired
	NewsRepository repository;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void addNews(AddNewsRequest request) {
		EntityNews eNews = AddNewsRequest.toEntity(request);
		repository.save(eNews);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<EntityNews> getAll() {
		return repository.findAll();
	}
	
}