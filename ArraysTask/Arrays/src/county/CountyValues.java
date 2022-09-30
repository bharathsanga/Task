package county;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountyValues {
	public static void main(String[] args) {
		County county1 = new County();
		county1.setName("Bharath");
		county1.setLocation("Adilabad");
		county1.setState("Telangana");
		county1.setZipcode(504311);
		county1.setApn(20);

		County county2 = new County();
		county2.setName("Nithin");
		county2.setLocation("Utnur");
		county2.setState("Telangana");
		county2.setZipcode(504211);
		county2.setApn(25);

		County county3 = new County();
		county3.setName("Sandeep");
		county3.setLocation("Kazipet");
		county3.setState("Telangana");
		county3.setZipcode(502305);
		county3.setApn(29);

		County county4 = new County();
		county4.setName("Raghu");
		county4.setLocation("Ameerpet");
		county4.setState("Telangana");
		county4.setZipcode(504265);
		county4.setApn(38);

		County county5 = new County();
		county5.setName("Manoj");
		county5.setLocation("Madapur");
		county5.setState("Telangana");
		county5.setZipcode(504305);
		county5.setApn(40);

		County county6 = new County();
		county6.setName("Sunil");
		county6.setLocation("Mehdipatnam");
		county6.setState("Telangana");
		county6.setZipcode(504354);
		county6.setApn(34);

		County county7 = new County();
		county7.setName("Santhosh");
		county7.setLocation("Miyapur");
		county7.setState("Telangana");
		county7.setZipcode(502145);
		county7.setApn(12);

		County county8 = new County();
		county8.setName("Tharun");
		county8.setLocation("Kompalli");
		county8.setState("Telangana");
		county8.setZipcode(502504);
		county8.setApn(9);

		County county9 = new County();
		county9.setName("Rakshan");
		county9.setLocation("Warangal");
		county9.setState("Telangana");
		county9.setZipcode(504604);
		county9.setApn(54);

		County county10 = new County();
		county10.setName("Jagadeesh");
		county10.setLocation("Khammam");
		county10.setState("Telangana");
		county10.setZipcode(504874);
		county10.setApn(44);

		County county11 = new County();
		county11.setName("Harish");
		county11.setLocation("Thirupathi");
		county11.setState("Andhra Pradesh");
		county11.setZipcode(502314);
		county11.setApn(60);

		County county12 = new County();
		county12.setName("Phani");
		county12.setLocation("Karnool");
		county12.setState("Andhra Pradesh");
		county12.setZipcode(502605);
		county12.setApn(65);

		County county13 = new County();
		county13.setName("Arjun");
		county13.setLocation("Nellor");
		county13.setState("Andhra Pradesh");
		county13.setZipcode(502504);
		county13.setApn(68);

		County county14 = new County();
		county14.setName("Rajesh");
		county14.setLocation("Amalapur");
		county14.setState("Andhra Pradesh");
		county14.setZipcode(502408);
		county14.setApn(84);

		County county15 = new County();
		county15.setName("Vishnu");
		county15.setLocation("Guntur");
		county15.setState("Andhra Pradesh");
		county15.setZipcode(502905);
		county15.setApn(71);

		County county16 = new County();
		county16.setName("Mani");
		county16.setLocation("Vizag");
		county16.setState("Andhra Pradesh");
		county16.setZipcode(502748);
		county16.setApn(98);

		County county17 = new County();
		county17.setName("Praneeth");
		county17.setLocation("Amaravathi");
		county17.setState("Andhra Pradesh");
		county17.setZipcode(502817);
		county17.setApn(75);

		County county18 = new County();
		county18.setName("Jawahar");
		county18.setLocation("Pulivendula");
		county18.setState("Andhra Pradesh");
		county18.setZipcode(502765);
		county18.setApn(93);

		County county19 = new County();
		county19.setName("Mourya");
		county19.setLocation("Rajamandry");
		county19.setState("Andhra Pradesh");
		county19.setZipcode(50987);
		county19.setApn(87);

		County county20 = new County();
		county20.setName("Vamsi");
		county20.setLocation("Tenali");
		county20.setState("Andhra Pradesh");
		county20.setZipcode(509785);
		county20.setApn(72);

		ArrayList<County> list1 = new ArrayList<County>();
		list1.add(county1);
		list1.add(county2);
		list1.add(county3);
		list1.add(county4);
		list1.add(county5);
		list1.add(county6);
		list1.add(county7);
		list1.add(county8);
		list1.add(county9);
		list1.add(county10);

		ArrayList<County> list2 = new ArrayList<County>();
		list2.add(county11);
		list2.add(county12);
		list2.add(county13);
		list2.add(county14);
		list2.add(county15);
		list2.add(county16);
		list2.add(county17);
		list2.add(county18);
		list2.add(county19);
		list2.add(county20);

		Map<String, ArrayList<County>> map1 = new HashMap<>();
		map1.put("TS", list1);
		
		Map<String, ArrayList<County>> map2 = new HashMap<>();
		map2.put("AP", list2);

		
		 System.out.println(map1);
		 System.out.println(map2);
		 
		 
//		for (Map.Entry<String, ArrayList<County>> entry : map1.entrySet()) {
//			String key = entry.getKey();
//			ArrayList<County> values = entry.getValue();
//			System.out.println(key);
//			System.out.println(values);
//		}

	}

}