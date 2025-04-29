package org.will.spring_react_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;

  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies() {
    return new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.OK);
  }

  @GetMapping("/{imdbId}")
  public ResponseEntity<Movie> getMovieByImdbId(@PathVariable String imdbId) {
    return movieService.findMovieByImdbId(imdbId)
        .map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}
