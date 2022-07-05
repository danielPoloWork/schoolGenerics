package repositories;

import interfaces.INEntity;
import interfaces.INRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RPRepository implements INRepository<INEntity> {

  private final Map<String, INEntity> databaseTable;

  public RPRepository() {
    this.databaseTable = new HashMap<>();
  }

  @Override
  public INEntity insertObject(INEntity objectArg) {
    return null;
  }

  @Override
  public Optional<INEntity> findById(String objectId) {
    return Optional.empty();
  }

  @Override
  public String generateRandomId() {
    return null;
  }

  @Override
  public Collection<INEntity> findAllRecords() {
    return null;
  }
}
