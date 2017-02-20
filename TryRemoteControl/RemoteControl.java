public interface RemoteControl {
	boolean powerOnOff();
	int volumeUp(int increment);
	int volumeDown(int decrement);
	void mute();
	int setChannel(int channel);
	int channelUp();
	int channelDown();
}
