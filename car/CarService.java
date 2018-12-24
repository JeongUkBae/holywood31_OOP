package car;

public interface CarService {
	/**
	 * 판매할 차량을 입고 시킨다.
	 * */
	public void add(String brand,String color, 
			String gearType, int door);
	/**
	 * 목록보기
	 * */
	public void list();
	/**
	 * 찾기
	 * */
	public void find();
	/**
	 * 
	 * */
	public void sell();
}
