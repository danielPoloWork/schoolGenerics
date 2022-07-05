package repositories;

import interfaces.INEntity;
import interfaces.INRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import utils.UTRandomMethod;

public class RPRepository implements INRepository<INEntity> {

  private static final int ID_LENGTH = 9;
  private final Map<String, INEntity> databaseTable;

  public RPRepository() {
    this.databaseTable = new HashMap<>();
  }

  @Override
  public INEntity insertObject(INEntity objectArg) {
    return this.databaseTable.put(objectArg.getId(), objectArg);
  }

  @Override
  public Optional<INEntity> findById(String objectId) {
    return Optional.ofNullable(this.databaseTable.get(objectId));
  }

  @Override
  public String generateRandomId() {
    UTRandomMethod random = new UTRandomMethod();
    String id =  random.generateString(ID_LENGTH);
    while (this.databaseTable.containsKey(id)) {
      id = random.generateString(ID_LENGTH);;
    }
    return id;
  }

  @Override
  public Collection<INEntity> findAllRecords() {
    return null;
  }
}
