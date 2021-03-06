package desiginmode.behaviour.command;

/**
 * @author Jay
 * @date 2019/7/6 17:48
 * @description 命令接收者
 */
public class Tv {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("The televisino is on.");
    }

    public void turnOff() {
        System.out.println("The television is off.");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}
