import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		String max="";//�����ֵ
		int sum=0;
		String mix="";
		double mid=0.0,average=0.0;
		double pass=0.0,fine=0.0;
		int s20=0,s40=0,s60=0,s80=0,s100=0;//ͳ������
		List<String> listPass = new ArrayList<String>();
		List<String> listFine = new ArrayList<String>();
		List<String> lists = new ArrayList<String>();
		
		
		lists.add("50");
		lists.add("70");
		lists.add("90");
		lists.add("60");
		lists.add("85");
		
		ScoreDeal scoreDeal=new ScoreDeal(lists);
		System.out.println("�ɼ�ͳ�ƣ�"+lists);
		
		List<Integer> mylist= new ArrayList<Integer>();
		
		mylist.add(70);
		mylist.add(90);
		mylist.add(60);
		mylist.add(85);
		mylist.add(80);
		
		////////////////////SortClass sc=new SortClass();
		///                 sc.sort(att);
		
		
		// lists�еĶ���String ������compareTo���������Կ���ֱ�ӵ���sort����������Ȼ˳�����򣬼���������
		//Collections.sort(lists);
		
		SortA sorta=new SortA();
		sorta.SortResult(lists);
		
		
		////////////////////////
		
		//�����ֵ
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo(max) >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
//			{
//				max=lists.get(i);
//			}
//		}
		max=scoreDeal.Max();
		
		//��Сֵ
//		for(int i=0;i<lists.size();i++) {
//			mix=lists.get(0);
//			if(lists.get(i).compareTo(mix) <0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
//			{
//				mix=lists.get(i);
//			}
//		}
		mix=scoreDeal.Mix();
		
		//��ֵ
//		if(lists.size()%2==0)//��������Ϊż��
//		{
//			
//			mid1 = (Integer.parseInt(lists.get(lists.size()/2-1))+Integer.parseInt(lists.get(lists.size()/2)))/2;
//			  
//		}else 
//		{
//			
//			mid1 = Integer.parseInt(lists.get(lists.size()/2));
//		}
//		
//		if(lists.size()%2==0)//��������Ϊż��
//		{
//			int mid11,a,b,c,d,e,f=0;
//			a=(mylist.size()/2)-1;
//			b=mylist.get(a);
//			c=mylist.size()/2;
//			d=mylist.get(c);
//			e=(b+d)/2;
//			  mid11= (mylist.get(mylist.size()/2-1)+mylist.get(mylist.size()/2))/2;
//			  
//		}
		mid=scoreDeal.Mid();
		
		//������
//		int passsum=0;double pass=0.0;
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo("60") >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
//			{
//				listPass.add(lists.get(i));
//				passsum++;
//			}
//			
//			pass=Double.valueOf(passsum) /lists.size()*100;
//			
//		}
		listPass=scoreDeal.Pass();
		pass=scoreDeal.pass;
		//������
//		int finesum=0; double fpass=0.0;
//		for(int i=0;i<lists.size();i++) {
//			if(lists.get(i).compareTo("80") >0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
//			{
//				listFine.add(lists.get(i));
//				finesum++;
//			}			
//		}
//		fpass=Double.valueOf(finesum) /lists.size()*100;
		
		
		listFine=scoreDeal.Fine();
		fine=scoreDeal.fpass;
		
		//ƽ��ֵ
//		int i;
//		for( i=0;i<lists.size();i++) {
//			sum+=Integer.parseInt(lists.get(i));
//		}
//		double average=sum/i;
		average=scoreDeal.Average();
		/////////////////
		
		//ͳ�����䣬 0-20  *��  21-40  *��
		
//		int s20=0,s40=0,s60=0,s80=0,s100=0;
//		for (String aa1 : lists) {
//			if(aa1.compareTo("21") <0)//string���ͱȽϣ�����һ����,���ش���0��ֵ
//				{s20++;}else if(aa1.compareTo("41") <0)
//				{s40++;}else if(aa1.compareTo("61") <0) 
//				{s60++;}else if(aa1.compareTo("81") <0)
//				{s80++;}else 
//				{
//					s100++;
//				}
//			
//		}
	ScoreSection scoreSection=new ScoreSection(lists);
	s20=scoreSection.s20;
	s40=scoreSection.s40;
	s60=scoreSection.s60;
	s80=scoreSection.s80;
	s100=scoreSection.s100;
		
		
		
//		List<SortA> listA = new ArrayList<SortA>();
//		SortA a1 = new SortA();
//		a1.setName("a");
//		a1.setOrder(2);
//		SortA a2 = new SortA();
//		a2.setName("b");
//		a2.setOrder(1);
//		SortA a3 = new SortA();
//		a3.setName("c");
//		a3.setOrder(5);
//		listA.add(a1);
//		listA.add(a2);
//		listA.add(a3);
//		// list�еĶ���Aʵ��Comparable�ӿ�
//		Collections.sort(listA);

		
		
		System.out.println("�ɼ�������"+lists);
		System.out.println("��߷�"+max);
		System.out.println("��ͷ�"+mix);
		System.out.println("��ֵ"+mid);
		System.out.println("ƽ��ֵ"+average);
		
		
		System.out.print("�����ͳ��");
		for (String aa1 : listPass) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("������"+pass+"%");
		System.out.println("\t");
		
		System.out.print("�����ͳ��");
		for (String aa1 : listFine) {
			System.out.print(aa1+"  ");
		}
		System.out.println("\t");
		System.out.println("������"+fine+"%");
		System.out.println("\t");
		
		System.out.println("����ֲ�");
		System.out.println("0-20��:"+s20+"  "+"21-40��:"+s40+"  "+"41-60��:"+s60+"  "+"61-80��:"+s80+"  "+"81-100��:"+s100+" ");

	}

}
