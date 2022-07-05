package interfaces;

import java.util.Collection;
import java.util.Optional;

public interface INRepository<T> {

  T insertObject(T objectArg);
  Optional<T> findById(String objectId);
  String generateRandomId();
  Collection<T> findAllRecords();
}
