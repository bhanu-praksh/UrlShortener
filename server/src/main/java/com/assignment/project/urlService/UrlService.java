package com.assignment.project.urlService;

import org.springframework.stereotype.Service;


import com.assignment.project.model.Url;


@Service
public interface UrlService {
	public Url generateShortLink(Url url);
	
	public Url getEncodedUrl(String url);

}
