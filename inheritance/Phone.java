package inheritance;

interface Camera {
	void photo();
}

interface Music {
	void music();
}

public class Phone implements Camera, Music {

	public static void main(String[] args) {

		Phone p=new Phone();
		p.photo();
		p.music();
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("play the music");
	}

	@Override
	public void photo() {
		System.out.println("take the snap");
	}

}
