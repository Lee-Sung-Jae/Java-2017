package pink.lsj.study2017.java.test20171101;

public class GetMin {

	public static void main(String[] args) {
		int s[] = { 12000, 3000, 19000, 6000, 18000, 8000, 12000, 4000, 1000, 19000 }, min;
		min = s[0];
		
		for(int i = 1; i < s.length; i++)
			if(min > s[i])
				min = s[i];
		
		System.out.printf("�迭 s[]�� ���� ���� ���� ���� %d�Դϴ�.", min);
	}

}
