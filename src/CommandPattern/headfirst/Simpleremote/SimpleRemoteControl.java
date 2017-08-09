package CommandPattern.headfirst.Simpleremote;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
        //this.slot = slot;
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
