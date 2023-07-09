package testing.static_fabric;

public class SongOrder {
  private String singer;
  private String songName;

  public SongOrder(String singer, String songName) {
    this.singer = singer;
    this.songName = songName;
  }

  public SongOrder(String singer) {
    this.singer = singer;
  }

  public static SongOrder of(String singer) {
    return new SongOrder(singer);
  }

  public static SongOrder of(String singer, String songName) {
    return new SongOrder(singer, songName);
  }

  @Override
  public String toString() {
    if (songName == null) {
      return "Play any " + singer + " song";
    }
    if (singer != null) {
      return "Play " +  singer + " song called " + "\"" + songName +"\"";
    }
    return "You haven't chosen a singer. Please make your choice)";
  }
}
