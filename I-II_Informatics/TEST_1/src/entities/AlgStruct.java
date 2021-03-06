package entities;

/**
 * Created by Mihail on 21.03.2017.
 */
public class AlgStruct  extends Subject {

    private int balls;

    public AlgStruct(){
        balls = 0;
    }

    public void add(int ball) {
        balls += ball;
        if (balls > 30) {
            balls = 30;
        }
    }

    public void add(int note, int  nOfTest){
        if(nOfTest == 1){
            passTest1(note);
        } else if(nOfTest == 2) {
            passTest2(note);
        } else throw  new IllegalArgumentException();
    }

    public void passTest1(int note){
        if(note > -1 && note < 6){
            add(note * 2);
        } else throw new IllegalArgumentException();
    }

    public void passTest2(int note){
        if(note > -1 && note < 6){
            add(note * 2);
        } else throw new IllegalArgumentException();
    }

    public int getBall(){
        return balls;
    }

}
