import java.util.ArrayList;
import java.util.Collections;


import pojo.People;

public class MainDemo {

	public static void main(String[] args){
		ArrayList<People> value = new ArrayList<People>();
		People p1 = new People("����","1994-3-3","45612346548",'��',26,50);
		People p2 = new People("����","2000-5-24","16546165746",'��',20,60);
		People p3 = new People("����","1997-2-3","156461656487",'��',23,70);
		People p4 = new People("������","1996-6-13","36548588788",'Ů',24,90);
		//�������ĸ�Ԫ����ӵ�ArrayList������
		value.add(p1);
		value.add(p2);
		value.add(p3);
		value.add(p4);
		SortClass cn = new SortClass();
		
		System.out.println("\n���ɼ�����");//����\n��ʾ����
		Collections.sort(value,cn);
		for(int i = 0; i < value.size(); i++)
			System.out.println(value.get(i).toString());

	}
	}


