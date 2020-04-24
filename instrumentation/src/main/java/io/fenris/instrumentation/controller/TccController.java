package io.fenris.instrumentation.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.fenris.instrumentation.model.TccModel;
import io.fenris.instrumentation.repository.TccRepository;

@RestController()
@RequestMapping(path = "/fenris", produces = { APPLICATION_JSON_VALUE }, consumes = MediaType.APPLICATION_JSON_VALUE)
public class TccController {

	@Autowired
	TccRepository tccRepository;

	@PostMapping("/insert")
	public ResponseEntity<Void> insertInfo(@RequestBody TccModel tccModel) {
		tccRepository.save(tccModel);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
