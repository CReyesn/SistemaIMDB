package cl.infoclub.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.infoclub.imdb.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

	public List<Rating> findAll();
}
