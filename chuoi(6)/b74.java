
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				answer++;
			}
		}
		System.out.print(answer);