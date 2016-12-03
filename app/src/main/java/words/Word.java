package words;

public class Word {
    private static final int NO_IMAGE= -1;

    private int englishId;
    private int miwokId;
    private int imageId;
    private int audioId;

    public Word(int englishId, int miwokId, int audioId){
        this.englishId = englishId;
        this.miwokId = miwokId;
        this.audioId = audioId;
        imageId=NO_IMAGE;
    }

    public Word(int englishId, int miwokId,int imageId, int audioId){
        this(englishId, miwokId, audioId);
        this.imageId = imageId;
    }
    public int getEnglishId(){
        return englishId;
    }
    public int getMiwokId(){
        return miwokId;
    }
    public int getAudioId(){return audioId;}
    public boolean hasImage(){return imageId != NO_IMAGE;}
    public int getImageId(){return imageId;}
}
