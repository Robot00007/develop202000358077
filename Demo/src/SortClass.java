
import java.util.Comparator;
 import pojo.*;
public class SortClass implements Comparator<People>{
	//���ճɼ���������
	@Override
	public int compare(People p1, People p2) {
		// TODO Auto-generated method stub
		if(p1.getScore()>p2.getScore())
			return 1;
		else return -1;
	}

}