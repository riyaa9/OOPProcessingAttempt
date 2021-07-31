import processing.core.PApplet;
public class MovingBall extends PApplet{
    public static class Speed{
        int currentValue;

        Speed(int currentValue){
            this.currentValue=currentValue;
        }

        public int increaseByOne(){
            return currentValue+1;
        }

        public  int increaseByTwo(){
            return currentValue+2;
        }

        public  int increaseByThree(){
            return currentValue+3;
        }

        public  int increaseByFour(){
            return currentValue+4;
        }

    }

    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int DIAMETER=10;
    public static final int START_Y=100;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
//        ellipse(100,100,100,100);
    }
    public static void main(String[] args){
        PApplet.main("MovingBall",args);
    }

    int ball1,ball2,ball3,ball4=0;

    @Override
    public void draw(){

        Speed s1=new Speed(ball1);
        ball1=s1.increaseByOne();
        ellipse(ball1,START_Y,DIAMETER,DIAMETER);

        Speed s2=new Speed(ball2);
        ball2=s2.increaseByTwo();
        ellipse(ball2,START_Y*2,DIAMETER,DIAMETER);

        Speed s3=new Speed(ball3);
        ball3=s3.increaseByThree();
        ellipse(ball3,START_Y*3,DIAMETER,DIAMETER);

        Speed s4=new Speed(ball4);
        ball4=s4.increaseByFour();
        ellipse(ball4,START_Y*4,DIAMETER,DIAMETER);


    }
}
