package 자바리플랙션;

public class Music {
    private String singer;
    private String title;

    public Music(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

}
