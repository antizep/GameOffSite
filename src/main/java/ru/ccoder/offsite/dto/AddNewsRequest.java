package ru.ccoder.offsite.dto;

import java.util.Date;


import lombok.Setter;
import ru.ccoder.offsite.entity.EntityNews;
import lombok.Getter;


@Getter
@Setter
public class AddNewsRequest {
	private String header;
	private String body;
	public static EntityNews toEntity(AddNewsRequest request) {
		EntityNews eNews = new EntityNews();
		
		eNews.setHeader(request.header);
		eNews.setDate(new Date());
		eNews.setBody(request.body);
		
		return eNews;
	}
}
