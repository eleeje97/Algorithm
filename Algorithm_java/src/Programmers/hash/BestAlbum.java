/**
 * 베스트 앨범
 * 
 * genreMap에 <장르, 총 재생횟수>를 저장
 * Song 클래스 생성 - 고유번호, 장르, 재생횟수를 속성으로 가짐
 * Song 클래스는 Comparable 인터페이스를 구현
 * allSongs 리스트에 모든 노래 저장
 * 총 재생횟수가 많은 순서로 장르 정렬
 * 장르별로 노래 재생횟수 많은 순서로 정렬 -> templist
 * 정렬된 리스트에서 상위 2곡의 노래를 bestAlbum에 추가
 */

package Programmers.hash;

import java.util.*;

/*
BestAlbum solution = new BestAlbum();
String[] genres	= {"classic", "pop", "classic", "classic", "pop"}; //"classic", "classic", "classic", "pop"
int[] plays = {500, 600, 150, 800, 2500}; //500, 600, 150, 800, 2500
//answer: [4, 1, 3, 0]

int[] answer = solution.solution(genres, plays);
for (int i : answer) {
	System.out.print(i + " ");
}
*/

public class BestAlbum {
	public int[] solution(String[] genres, int[] plays) {        
        HashMap<String, Integer> genreMap = new HashMap<String, Integer>();
        ArrayList<Song> allSongs = new ArrayList<Song>();
        
        ArrayList<Song> bestAlbum = new ArrayList<Song>();
        
        
        // genreMap에 <장르, 총 재생횟수>를 저장, Song 인스턴스를 생성하여 allSongs에 추가
        for (int i = 0; i < genres.length; i++) {
        	genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0) + plays[i]);
        	allSongs.add(new Song(i, genres[i], plays[i]));
		}
        

        // 장르 정렬
        Iterator<String> it = sortByValue(genreMap).iterator();
        ArrayList<Song> templist = new ArrayList<Song>(); // 장르별 노래를 임시로 담을 리스트
        while(it.hasNext()) {
        	String genre = it.next();
        	templist.clear();
        	for (Song song : allSongs) {
				if(song.genre.equals(genre)) {
					templist.add(song);
				}
			}
        	
        	templist.sort(null); // 장르별 노래 정렬
        	
        	// 베스트 앨범에 상위 2곡 추가 (노래가 한 곡인 경우, 첫번째 곡만 추가)
        	bestAlbum.add(templist.get(0));
        	if(templist.size() != 1) {
        		bestAlbum.add(templist.get(1));
        	}
        }
        
        
        int[] answer = new int[bestAlbum.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = bestAlbum.get(i).index;
		}
        
        
        return answer;
    }
	
	
	// 장르를 총 재생횟수가 많은 순서로 정렬하는 메소드
	public static List<String> sortByValue(final HashMap<String, Integer> map) {

        List<String> list = new ArrayList<String>();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
            	Integer v1 = map.get(o1);
            	Integer v2 = map.get(o2);
            	
                return v2.compareTo(v1);
            }

        });

        return list;
    }
	
	
	class Song implements Comparable<Song> {
		int index;
		String genre;
		int play_num;
		
		
		public Song(int index, String genre, int play_num) {
			super();
			this.index = index;
			this.genre = genre;
			this.play_num = play_num;
		}


		
		// 재생횟수가 많을 수록, 재생횟수가 같을 경우 고유번호가 작을 수록 우선
		@Override
		public int compareTo(Song comp) {
			// TODO Auto-generated method stub
			if(this.play_num == comp.play_num)
				return this.index > comp.index ? 1 : -1;
				
			return this.play_num < comp.play_num? 1 : -1;
		}
		
		
	}
}
