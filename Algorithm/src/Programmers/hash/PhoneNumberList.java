/**
 * 전화번호 목록
 */

package Programmers.hash;

import java.util.*;

/*
PhoneNumberList solution = new PhoneNumberList();

String[] phone_book = {"12","113","123"};

System.out.println(solution.solution(phone_book));
*/

public class PhoneNumberList {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;
		}

		return answer;
	}
}