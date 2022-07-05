package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class UTRandomMethod {

  // ALPHANUMERIC "aZ1c45"
  public String generateString() {
    return RandomStringUtils.randomAlphanumeric(16);
  }

  public String generateString(int stringLengthArg) {
    return RandomStringUtils.randomAlphanumeric(stringLengthArg);
  }

  public String generateString(int stringMinLengthArg, int stringMaxLengthArg) {
    return RandomStringUtils.randomAlphanumeric(stringMinLengthArg, stringMaxLengthArg);
  }

  // ALPHABETIC "aZlfHJadR"
  public String generateCharSet() {
    return RandomStringUtils.randomAlphabetic(16);
  }

  public String generateCharSet(int stringLengthArg) {
    return RandomStringUtils.randomAlphabetic(stringLengthArg);
  }

  public String generateCharSet(int stringMinLengthArg, int stringMaxLengthArg) {
    return RandomStringUtils.randomAlphabetic(stringMinLengthArg, stringMaxLengthArg);
  }

  // NUMERIC "38439457"
  public int generateInt() {
    return Integer.parseInt(RandomStringUtils.randomNumeric(16));
  }

  public int generateInt(int intLengthArg) {
    return Integer.parseInt(RandomStringUtils.randomNumeric(intLengthArg));
  }

  public int generateInt(int intMinLengthArg, int intMaxLengthArg) {
    return Integer.parseInt(RandomStringUtils.randomNumeric(intMinLengthArg, intMaxLengthArg));
  }
}