package chap09.gamelevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("점프할 줄 모르지롱");
    }

    @Override
    public void turn() {
        System.out.println("턴할 줄 모르지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 초심자 레벨 입니다 ***");
    }
}
