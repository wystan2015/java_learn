import static java.lang.Math.random;

public class TryRemoteControl {
	public static void main(String args[]) {
		RemoteControl remote = null;
		for(int i = 0;i<5;++i) {
			if(random() < 0.5) 
				remote = new TV(random()<0.5 ? "Sony" : "Hitachi",random()<0.5 ? 46 : 48);
			else
				remote = new DVDPlayer(random()<0.5 ? "Panasonic":"JVC");
			remote.powerOnOff();
			remote.channelUp();
			remote.volumeUp(10);
		}
	}

}
