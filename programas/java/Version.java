public class Version {
  private int versionNumber;
  public Version(int versionNumber) {
     assert versionNumber >= 0;
     this.versionNumber = versionNumber;
  }
  public Version() {
     this(0);
  }
  public int getVersionNumber() {
     return versionNumber;
  }
  public Version incrVersionNumber() {
      return new Version(versionNumber + 1);
  }
  public String toString() {
      return "" + versionNumber;
  }
}
