package org.will.spring_react_mongo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  Optional<Movie> findByImdbId(String imdbId); // Nome do método corrigido
}
