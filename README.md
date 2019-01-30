

##JAVA 메소드 모음

★String class
- charAt(int index) : index위치에 있는 문자열을 리턴한다.
-compareTo(String s) : this 문자열의 순서가 빠르면  음수를, 동일하면 0, 느리면 양수를 리턴한다.
-compareTolgnoreCase(String s) : 대소문자를 구별하지 않고 문자열을 비교한다. compareTo 메소드와 리턴값이 동일하다.
-contains(CharSequence s) : 문자열 s 가 this에 들어있는지 확인한다. 참/거짓 리턴
-indexOf(String s) : 문자열 s 가 위치한 index를 return 한다. 없으면 -1
-isEmpty  : this 문자열의 길이가 0이면 true, 그렇지 않으면 false 
-lastIndexOf(String s) : indexOf와 동일한 기능. 문자열 s가 여러개면 마지막 index를 리턴
-replace(String s1, String s2) :  this 문자열에서 문자열 s1을 s1로 치환한다. 그 후 치환된 새 문자열을 리턴한다.
- split(string s)  : 문자열 s 와 일치하는 부분을 배열로 쪼개 리턴한다.
-endWith(String s) : this 문자열의 끝이 문자열 s와 일치하면 true를 리턴
-startWith(String s) : this 문자열의 처음이 문자열 s와 일치하면 true를 리턴
-substring(int begenindex) : this 문자열에서 begenindex 부터 끝까지 문자열을 리턴
-substring(int s1, int s2) : this 문자열에서 s1~s2까지 문자열을 리턴한다.
-toUpperCase() : this 문자열을 대문자로 변경하여 새 문자열을 리턴
-toLowerCase() : this 문자열을 소문자로 변경하여 새 문자열을 리턴
-String trim() : this 문자열의 공백을 제거하여 새 문자열을 리턴

★StringBuilder Class (기본적으로 this 객체 자체를 리턴)
-append(CharSequence s) : 문자열 s를 this 문자열 뒤에 추가한다. 
-charAt(int index) : index 위치의 문자열을 리턴한다.
-delete(int begin, int end) : begin ~ end 까지 문자열을 삭제한다. 
-deleteCharAt : this 문자열에서 index 위치의 문자를 삭제한다.  
-insert(int index, CharSequence s) : this 문자열의 index 위치에 문자열 s를 삽입한다.
-lastIndexOf(String s)  :  문자열 s를 찾아 index를 리턴한다. 여러개 있으면 마지막 index를 리턴한다.
-reverse() : this 문자열을 거꾸로 뒤집는다.
-setCharAt(int index, char c) :  this 문자열에서 index 위치의 문자열을 c로 변겅한다.
-substring 메소드는 별개로 this문자열이 수정되지 않는다.

★equals 메소드 재정의
@Override
public boolean equals(Object obj) {
      if(obj instanceof Person ==false )  return false;
      Person p = (Person)obj;
      return Object.equals(this.name, p.name) && this.name == p.name;

★ Arrays Class
-asList  : 배열을 list 형태로 변환
ex) List<String> stringList = Arrays.asList("one", "two");
-binarySearch(T[] a , T key)  : 배열 a 에서 key 값을 찾아 index를 리턴한다. 
key 값이 없는경우 key값을 끼워넣을 위치 (index *-1 ) -1 값으로 리턴한다.
-copyOfRange(T []a , int from, int to) : 배열 a에서 from ~ to 까지 값들로 새로운 배열을 리턴
-copyOf(T[] a, int newLength) :newLength 길이의 배열을 생성하고, a 배열의 값들을 새 배열에 복사하고, 새 배열을 리턴한다.
-equals ( T[] a1, T[] a2) :   a1과 a2를 이쿠리티 비교한다. 모두 동일할 경우 true 리턴
- deepEuqals : equals와 동일, 다차원 배열에 사용
-fill(T [ ] a , T value) :  배열의 모든 원소를 value 값으로 초기화 한다.
-fill (T [ ] a, int from, int to, T value) : 배열의 from~ to 까지 원소를 value 값으로 초기화한다.
- sort( T [ ] a ) : 정렬

