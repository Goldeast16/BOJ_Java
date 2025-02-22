package bronze.bronze3;
// Stream 문법 배움

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N30958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        int maxValue = 0;

        for (int i = 0; i < N; i++) {
            char ch = input.charAt(i);

            if(Character.isAlphabetic(ch)) {
                String key = String.valueOf(ch);

                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        System.out.println(maxValue);

        /*
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        scanner.close();
        // 전체 과정: 문자열을 IntStream으로 변환 후 char로 매핑 -> 문자 필터링 -> 그룹핑 후 개수 세기
        Map<Character, Long> counting = input.chars()
                // -> 각 문자를 int로 스트림 처리
                .mapToObj(c -> (char) c)
                // int를 char로 변환
                .filter(c -> c >= 'a' && c <= 'z')
                // 소문자 필터링
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
                // 그룹핑하여 개수 세기

        // 전체 과정: counting의 long 값만 추출하여 collection으로 반환 후 stream 변환 -> Long 객체를 기본형 long으로 변환 -> 최대값 찾기 -> 없으면 0 반환
        long maxFrequency = counting.values().stream()
                // counting의 long 값만 추출하여 collection으로 반환 후 stream 변환
                .mapToLong(Long::longValue)
                // Long 객체를 기본형 long으로 변환
                .max()
                // 최대값 찾아서 반환
                .orElse(0);
                // 만약 없으면 0 반환

        System.out.println(maxFrequency);
         */
    }
}
