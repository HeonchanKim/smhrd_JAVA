package Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		TempEmployee te = new TempEmployee("SMHRD001", "�ڹ���", 3000);
		RegularEmployee re = new RegularEmployee("SMHRD002", "ȫ�浿", 4000, 400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "���嵶", 10, 10);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());

		//��ĳ����(�ڵ�����ȯ)
		Employee e1 = te;
		Employee e2 = re;
		Employee e3 = pe;
		
		Employee[] emp_arr = new Employee[3];
		//emp_arr[0] = e1;
		emp_arr[0] = te; // TempEmployee�� Employee Ÿ������ �ڵ�����ȯ(��ĳ����) �Ȼ��·� �������� �Ҵ�
		//emp_arr[1] = e2;
		emp_arr[1] = re;
		//emp_arr[2] = e3;
		emp_arr[2] = pe;
	}
}