package 抗力1;

public class AddressListMain {
	public static void main(String[] args) {

		//按眉(牢胶畔胶) 积己
		AddressList al = new AddressList();
		
		al.name = "辫清蛮";
		al.address = "堡林堡开矫 悼备";
		al.pNumber = "010-0000-0000";
		
		al.showAddr();
		
		System.out.println();
		
		AddressList al1 = new AddressList();
		
		al1.name = "辫清蛮2";
		al1.address = "堡林堡开矫 悼备2";
		al1.pNumber = "010-1111-1111";
		
		al1.showAddr();
	}
}
