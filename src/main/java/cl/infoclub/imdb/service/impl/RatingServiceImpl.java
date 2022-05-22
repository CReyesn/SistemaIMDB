package cl.infoclub.imdb.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.infoclub.imdb.model.Rating;
import cl.infoclub.imdb.repository.RatingRepository;
import cl.infoclub.imdb.service.RatingService;


@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public void save(Rating rating) {
		ratingRepository.save(rating);
		
	}

	@Override
	public void update(Rating rating) {
		ratingRepository.save(rating);
		
	}

	@Override
	public List<Rating> findAll() {
		return ratingRepository.findAll();
	}

	@Override
	public Rating findById(Long id) {
		return ratingRepository.findById(id).orElse(new Rating());
	}

	@Override
	public void delete(Rating rating) {
		ratingRepository.delete(rating);
		
	}

}
