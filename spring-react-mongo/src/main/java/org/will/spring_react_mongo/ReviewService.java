package org.will.spring_react_mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {

  @Autowired
  private ReviewRepository reviewRepository;

  @Autowired
  private MongoTemplate mongoTemplate;

  public Review createReview(String reviewBody, String imdbId) {
    // Cria a review com timestamp atual
    Review review = reviewRepository.insert(new Review(
        reviewBody,
        LocalDateTime.now(),
        LocalDateTime.now()));

    // Atualiza o filme correspondente para adicionar o ID da review
    mongoTemplate.update(Movie.class)
        .matching(Criteria.where("imdbId").is(imdbId))
        .apply(new Update().push("reviews").value(review.getId()))
        .first();

    return review;
  }
}
