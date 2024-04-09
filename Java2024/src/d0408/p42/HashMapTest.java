package d0408.p42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("È«±æµ¿", 85);
		map.put("µ¿Àå±º", 90);
		map.put("±Ç À²", 79);
		map.put("È«±æµ¿", 91);
		System.out.println("ÃÑ entry ¼ö : " + map.size());
		System.out.println("\tÈ«±æµ¿ : " + map.get("È«±æµ¿"));
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.remove("È«±æµ¿");
		System.out.println("ÃÑ entry ¼ö : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.clear();
		System.out.println("ÃÑ entry ¼ö : " + map.size());
	}
}
