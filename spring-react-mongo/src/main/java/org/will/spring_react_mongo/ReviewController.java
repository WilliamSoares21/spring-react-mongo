package org.will.spring_react_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews") // Endpoint específico para reviews
public class ReviewController {

  @Autowired
  private ReviewService reviewService;

  @PostMapping
  public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
    return new ResponseEntity<>(
        reviewService.createReview(
            payload.get("reviewBody"),
            payload.get("imdbId")),
        HttpStatus.CREATED // Status 201 é mais apropriado para criação
    );
  }
}
