package Java200;

import java.io.Serializable;

public class Billboard implements Serializable {
    private int rank;           //순위
    private String song;        //곡명
    private int lastweek;       //전 주 순위
    private String imagessrc;   //가수 사진
    private String artistsrc;   //가수 정보
    private String artist;      //가수 이름

    public Billboard(){}
    public Billboard(int rank, String song, int lastweek, String imagessrc, String artistsrc, String artist){
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagessrc = imagessrc;
        this.artistsrc = artistsrc;
        this.artist = artist;
    }
    public Billboard(int rank,String song,int lastweek,String imagessrc,String artist){
        super();
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagessrc = imagessrc;
        this.artist = artist;
    }
    @Override
    public String toString(){
        return "{rank=" + rank + ", song=" + song + ",lastweek="
                + lastweek + ", imagesrc=" + imagessrc + ", artist=" + artist+ "]";
    }

    public int getRank() {
        return rank;
    }

    public String getSong() {
        return song;
    }

    public int getLastweek() {
        return lastweek;
    }

    public String getImagessrc() {
        return imagessrc;
    }

    public String getArtistsrc() {
        return artistsrc;
    }

    public String getArtist() {
        return artist;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setLastweek(int lastweek) {
        this.lastweek = lastweek;
    }

    public void setImagessrc(String imagessrc) {
        this.imagessrc = imagessrc;
    }

    public void setArtistsrc(String artistsrc) {
        this.artistsrc = artistsrc;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
