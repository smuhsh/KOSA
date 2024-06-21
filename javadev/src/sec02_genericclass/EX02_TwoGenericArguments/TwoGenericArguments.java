package sec02_genericclass.EX02_TwoGenericArguments;
/*
 * 작성일:2024-06-21
 * 작성자:황석현
 * 개요: 교재p593, 594
 * 		제네릭 타입 변수 2개를 가진 제네릭 클래스의 선언 및 활용
 * */
public class TwoGenericArguments {
	public static void main(String[] args) {
		KeyValue<String, Integer>kv1 = new KeyValue();
		
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key :" + key1 + "value :" + value1);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key:"+ key2 + " value:" +value2);
		
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key:" + key3);		
		
	}

}
