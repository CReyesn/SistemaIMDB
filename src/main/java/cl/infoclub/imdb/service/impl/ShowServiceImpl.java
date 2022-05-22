package cl.infoclub.imdb.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.infoclub.imdb.model.Showw;
import cl.infoclub.imdb.repository.ShowRepository;
import cl.infoclub.imdb.service.ShowService;


@Service
public class ShowServiceImpl implements ShowService{

	@Autowired
	ShowRepository showRepository;
	
	@Override
	public void save(Showw show) {
		showRepository.save(show);
		
	}

	@Override
	public void update(Showw show) {
		showRepository.save(show);
		
	}

	@Override
	public List<Showw> findAll() {
		return showRepository.findAll();
	}

	@Override
	public Showw findById(Long id) {
		return showRepository.findById(id).orElse(new Showw());
	}

	@Override
	public void delete(Showw show) {
		showRepository.delete(show);
		
	}

}
