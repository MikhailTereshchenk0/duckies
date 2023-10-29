abstract public class Duck {
    Voice voice;

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void voice() {
        voice.voice();
    }
}
