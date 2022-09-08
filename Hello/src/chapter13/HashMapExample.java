package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동 키가 같기 때문에 제일 마지막에 저장한 값으로 대체(덮어쓰기) //<->Set은 뒤의 값을 제거
		System.out.println(map.size());// 저장된 총 Entry 수

		Integer hongValue = map.get("홍길동");
		System.out.println(hongValue);
		System.out.println();

		// 모든 요소 출력
		// 1. Entry를 이용
		// 1-1 iterator 이용
		Iterator<Entry<String, Integer>> entryIterator = map.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		// 1-2 foreach문 이용
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// 2. Key를 이용
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + ":" + map.get(key));
		}
		// foreach문 이용
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}

		// 3. value를 직접 이용
		Collection<Integer> values = map.values();
		for (Integer value : values) { // value값만 가져올 수 있음
			System.out.println(value);
		}
		// 반복문
		// 1. for i문
		for (int i = 0; i < args.length; i++) {
			// 2. for each문
			for (Integer integer : values) {
				// 3. foreach 함수 사용

			}

			values.forEach(System.out::println); // 람다
		}
	}
}

