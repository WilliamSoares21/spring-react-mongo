package org.will.spring_react_mongo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;

@Document(collection = "movies")
@Data // Gera getters, setters, toString, etc.
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
  @Id
  private String id; // Mantido como ObjectId

  private String imdbId;
  private String title;
  private String releaseDate;
  private String trailerLink;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;

  @DocumentReference
  private List<Review> reviews;

  // Construtor sem ID (para inserções)
  public Movie(String imdbId, String title, String releaseDate,
      String trailerLink, String poster, List<String> genres,
      List<String> backdrops) {
    this.imdbId = imdbId;
    this.title = title;
    this.releaseDate = releaseDate;
    this.trailerLink = trailerLink;
    this.poster = poster;
    this.genres = genres;
    this.backdrops = backdrops;
  }
}
