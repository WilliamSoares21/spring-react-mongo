package org.will.spring_react_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
  @Autowired
  private MovieService movieService;

  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies() {
    return new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.OK);
  }

  @GetMapping("/{imdbId}")
  public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String imdbId) {
    return new ResponseEntity<>(movieService.findMovieByImdbId(imdbId), HttpStatus.OK);
  }
}
