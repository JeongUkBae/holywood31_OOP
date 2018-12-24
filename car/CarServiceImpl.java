package car;

public class CarServiceImpl implements CarService{

	@Override
	public void add(String brand,String color, 
			String gearType, int door) {
	CarBean carBean = new CarBean();
	carBean.setBrand(brand);
	carBean.setColor(color);
	carBean.setGearType(gearType);
	carBean.setDoor(door);
	}

	@Override
	public void list() {
		
	}

	@Override
	public void find() {
		
	}

	@Override
	public void sell() {
		
	}

}
