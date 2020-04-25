package strategydesign;

public interface Flys {
	String flys();
}

class ItFlys implements Flys{

	@Override
	public String flys() {
		return "Flying High";
	}
}

class CanotFly implements Flys{

	@Override
	public String flys() {
		return "Can not Fly";
	}
}
