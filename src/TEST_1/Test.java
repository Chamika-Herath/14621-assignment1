package TEST_1;

public class Test {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);


        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undoButtonWasPressed();


        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.undoButtonWasPressed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}

