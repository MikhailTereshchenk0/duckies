abstract public class Duck {
    protected int HP;

    Voice voice;

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void voice() {
        if (HP > 0) {
            voice.voice();
            HP--;
        }
        else {
            System.out.println("The Duck has already dead.");
        }
    }

    public int getHP() {
        return HP;
    }
}

