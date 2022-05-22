package cl.infoclub.imdb.service;

import java.util.List;

import cl.infoclub.imdb.model.Rating;



public interface RatingService {

	void save(Rating rating);
	void update(Rating rating);
	List<Rating> findAll();
	Rating findById(Long id);
	void delete(Rating rating);
	
}
