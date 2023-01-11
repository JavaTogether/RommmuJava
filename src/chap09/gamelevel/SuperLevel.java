package chap09.gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프합니다");
    }

    @Override
    public void turn() {
        System.out.println("완전 돕니다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 슈퍼 레벨 입니다 ***");
    }
}
