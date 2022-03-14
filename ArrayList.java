

public class ArrayList {

	public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        ArrayList list1 = new ArrayList<>();

        list.add(10);//Integer
        list.add(100);
        list.add(1000);
        
        list1.addAll(list);
        System.out.println(list1);
	}

}
