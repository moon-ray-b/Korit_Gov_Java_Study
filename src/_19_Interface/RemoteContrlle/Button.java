package _19_Interface.RemoteContrlle;

/*
 * extends 단일 상속
 * implements 다중 상속
 * */
public abstract class Button implements Press,Up, Down{
    @Override
    public void ondown() {}

    @Override
    public abstract void onPresses();

    @Override
    public void onup() {}
}
