# Java-study  
<details>
  <summary>git</summary>
  <div markdown="1">
    
   # git

### 디렉토리

- 디렉토리 생성 :   mkdir 디렉토리명
- 하위 디렉토리로 이동하기 : cd 디렉토리명
- 현재 디렉토리의 파일 목록 출럭 : ls -al
- 상위 디렉토리로 이동하기 : cd ..
  - Linux에서 부모 디렉토리를 의미하는 기호는 .. 이다.
- 디렉토리 삭제하기 : rm -rf 디렉토리명
- 파일 삭제하기 : rm 파일명
- 현재 디렉토리 경로명 확인 : pwd
- 사용자 홈 디렉토리로 이동 : cd ~



#### commit hash

- 각 commit에는 알파벳과 숫자로 이루어진 40개의 hash가 부여된다.

#### working tree 와 staging area

- git 버전 관리 대상인 소스코드 폴더를 working tree라고 부른다.
- local repository와 working tree 사이에 staging area가 존재한다.
  -  수정한 파일들 중 repository에 등록하길 원하는 자료들만 staging area에 올린다.
  - staging area에 등록된 파일의 변경사항만 repository에 기록된다.

#### working tree snapshot

- commit을 하면 working tree의 현재 상태가 local repository에 기록된다.
- 그래서 나중에 그 스냅샷 상태로 working tree를 되돌리는 것이 가능하다.
- 단, staing area에 등록된 파일들만 local repository에 기록된다.



#### working tree 내부의 파일 상태

- untracked
  - 한번도 commit 되지 않았고, 아직 staging area에 등록되지도 않은 새 파일의 상태
- modifted
  - 변경 내용이 commit 이후 수정되었지만, staging area에 다시 등록되자 않아서 다음 commit 대상이 아닌 파일의 상태로 dirty 또는 modifed 라고 부른다.
- staged
  - 한번도 commit 되지 않았지만, staging area에 등록되어있어서 다음 커밋 대상인 상태
- unmodified
  - 변경 내용이 commit된 이후로 수정되지 않은 파일들의 상태

  @ working tree에 새 파일을 생성하면 untracked 파일이다.

  @ 이 untracked 파일을 staging area에 등록하면 staged 파일이다.

  @ staged 파일을 commit 하면 unmodified  상태가 된다.

  @ unmodified  상태인 파일을 수정하면 modifted상태가 된다.

  @ modified 상태를 staging area에 등록하면 staged 상태가 된다.

  @ staged 상태 파일을 commit 하면 다시 unmodified 상태가 된다.



###  git 기초 명령

- git init : 현재 디렉토리에 local repository를 생성
- git status : working tree의 파일 상태를 확인
- git add 파일명 : staging area에 파일을 등록하기 
  - git add a.txt :  a.txt 파일을 staging area에 등록한다.
  - git add *.txt : *.txt 패턴의 파일들 중 staing 대상 파일을 staing area에 등록한다.
  - git add "*.txt" : working tree의 *.txt 패턴의 파일들 중 staging 대상 파일을 staing area에 등록한다.
  - git add * : 현재 디렉토리에 모든 staging 대상 파일을 staing area에 등록한다.
  - git add  : working tree의 모든 staging 대상 파일들을 staging area에 등록한다.
- git reset 파일명 : staing area에 등록을 취소한다.
  - git reset a.txt : a.txt 파일을 등록 취소한다.
  - git reset : staing area의 모든 파일을 등록 취소한다.
- git commit : 이 명령을 실행시 commit 메시지를 입력하기 위한 편집기가 실행된다. 저장후 편집기를 닫으면 commit이 완료된다.
  - git commit -a : modified상태의 파일이 자동으로 staging area에 등록된다.

- git log : commit 목록 보기
- git log --stat  : commit에 기록된 파일 목록과 삽입/삭제된 줄 수 보기



#### remote repository 명령

- remote repository에 연결하기
  - 현재 디렉토리의 local repository를 remote repository에 연결하기 위한 명령은
  - git remote add 별칭 URL   
  - 예) git remote add origin https://github.com/quack337/git.git
  - origin 이라는 별칭(별명)을 부여한 것
- remote repository에 최초 업로드
  - git push --set -upstream 원격자정소별칭 브랜치
  - 예) git push --set -upstream origin master
- 최초 업로드 이후
  - git push
- remote repository 다운로드
  - remote repository를 다운로드 하여 local repository를 새로 만드는 명령어는
  - git clone URL 이다.
  - 예)  git clone https://github.com/quack336/git_test1.git



#### merge conflict

- pull : 다른 팀원이 remote repository에 push 한 수정 내용을 내 pc에 가져오는 것을 pull 이라고 한다.
- 수정하고 아직 commit 하지 않은 파일이 내 작업 디렉토리에 있다면 pull할 수 없다.
- pull은 다음 두 세부 절차가 자동으로 진행된다.
  1. remote repotisory의 최신 내용이 local repository로 다운로드 된다.(fetch)
  2. 다운로드된 최신 버전과 내가 마지막으로 커밋한 버전이 병합되어 새 버전이 만들어지고 커밋된다.
- pull이 성공했다면 merge 결과 새 커밋이 내 local repository에 등록되었으므로, 이 새 커밋을 remote repository에 push해야한다.



### 브랜치란?

각각의 구현 작업 마다 독립된 브랜치를 만들어 구현 작업을 진행한다.

구현 작업이 성공적으로 마무리되면 그 작업 브랜치를 마스터(master) 브랜치에 병합한다.

즉, 구현을 성공하고 테스트를 통과한 브랜치만 마스터 브랜치에 병합해야 한다.

따라서 마스터 브랜치는 언제나 에러 없이 실행 가능하고, 안정적인 버전임이 보장된다.

어떤 새로운 기능의 구현을 시작할 때 마스터 브랜치의 코드를 새 브랜치로 복사해서 작업을 시작하면 된다.



만약 지금 구현하고 있는 작업을 잠시 중단하고, 새 작업을 시작해야 한다면, 지금 작업하던 브랜치를 잠시 그대로 놔두고 새 브랜치를 만들어 구현 작업을 시작하면 된다.



#### 마스터 브랜치

- git repository에서 master 브랜치가 디폴트 브랜치이다.
- master 브랜치는 git repository를 만들 때 자동 생성된다.
- 소스코드를 수정하고 커밋을 하면, 이 커밋은 현재 작업 브랜치에 소속된다.
- git repository에는 HEAD이름의 참조가 있는데 이 참조는 현재 작업 브랜치를 가르킨다.



#### 브랜치 명령

- git branch 브랜치이름 : 브랜치 만들기
- git branch : 브랜치 목록 보기
- git checkout 브랜치이름: 브랜치 전환하기 (이 브랜치가 현재 작업 브랜치가 된다.)
- git branch -b 브랜치이름 : 이것도 브랜치 전환하기
  - 참고로 브랜치를 만들어도 자동으로 브랜치가 전환되지 않는다.
  - 예) 마스터 브랜치로 전환하기 git checkout master
- git merge 브랜치이름 : 브랜치 병합
  - 예) issue1에서 작업한 내용을 현재 브랜치에 병합 git merge issue1
- git branch -d 브랜치이름 : 브랜치 삭제
  - 이 명령으로 삭제되는 것은 브랜치 이름 뿐이다. 브랜치에서 수행했던 커밋들은 삭제X



#### master 브랜치를 작업 브랜치에 merge하는 과정

1. 작업 브랜치에서 구현 작업을 완료했고, 꼼꼼히 테스트한다.
2. 이상이 없음을 확인했다면, 내가 구현한 작업 브랜치의 소스코드와 팀 동료가 구현한   master 브랜치의 최신 commit을 병합해야 한다.
3. 이 병합이 생각보다 오래 걸릴 수 있으므로,  master 브랜치에 병합을 하지 말고 작업 브랜치에서 병합을 진행하자
4. 즉 master 브랜치를 작업 브랜치에 병합해라.

- 먼저 내 local repository의 master 브랜치에서 pull을 하여 동료들의 작업물을 가져온다
- master 브랜치를 내 작업 브랜치에 merge한다.
- merge 과정에서 버그가 생겼을수도 있으니 다시 꼼꼼히 테스트해야 버그가 없음을 확인한다.
- 꼼꼼히 테스트해서 문제가 없으면 merge된 소스코드를 commit한다.

5. 위 작업들을 완료했으면 이제 내가 작업한 소스코드를 팀 동료들에게 공개해야 한다.
   - 작업 브랜치를 master 브랜치에 merge한다.
   - master 브랜치를 remote repository에 push한다.
  </div>
</details>


<details>
  <summary>String class</summary>
  <div markdown="1">
    ### 자바에서 가장 많이 사용하는 String 클래스

대부분의 회사에서 가장 자주 사용되고 생성되는 객체는 String과 관련된 객체이다. 

여러 회사에서 String과 관련된 객체의 사용 빈도를 조사해본 결과  몇 백 개의 객체중에서 항상 TOP5를 차지한다고 한다.

이와같은 조사 결과가 의미하는 바는, **String**은 취업 준비를 할 때에도, 개발자가 되어 실무에 투입될 때도 String 클래스에 대해서 좀 더 확실하게 공부할 필요가 있다는 뜻이다.



```java
public final class String extneds Object implements Serializable, Comparable<String>, CharSequence
```

- public final로 선언되었다. 'public'은 누구나 다 사용할 수 있는 클래스 이다. 

  여기서 final로 선언되어있으면 무엇이 다를까?

  - class에 final 키워드가 붙어있다면 **상속을 금지(확장 금지)** 라는 의미이다.
  - 다시 말해서 String 클래스는 자식 클래스를 양산할 수 없다. 그냥 있는 그대로 사용해야 한다.

- String은 Object 클래스를 상속(확장) 했다. 즉, 모든 클래스의 부모 클래스는 Object 클래스 이므로 따로 확장한 클래스는 없다는 의미이다.

- 다음으로 implements 부분을 살펴보자.

  - ```java
    implements Serializable, Comparable<String>, CharSequence
    ```

  -  String은 Serializable, Comparable, charSequence 라는 인터페이스를 구현한 클래스다.

    



#### 1. 객체의 널 체크는 반드시 필요하다.

사실 String 뿐만 아니라 모든 객체를 처리할 때에는 null 체크를 반드시 해야만 한다. 

어떤 참조 자료형도 널이 될 수 있으며, **객체가 널 이라는 것은 객체가 아무런 초기화가 되어 있지 않으며, 클래스에 선언되어 있는 어떤 메소드도 사용할 수 없다는 것을 의미한다.**

```java
public class StringNull {
    public static void main(String [] args){
        StringNull sample = new StringNull();
        sample.nullCheck(null);
    }
    
    public boolean nullCheck(String text) {
        int textLength = text.length();
        System.out.println(textLength);
        if(text == null) return true;
        else return false;
    }
    
}
```

- 바로 위의 코드는 정상적으로 컴파일은 정상적으로 되지만,  NullPointerException이 발생한다. 앞서 설명한대로 **매개변수**로 받은 text는 null인데,  null인 객체의 메소드에 접근(length()) 했기 때문이다.



- 이제 NullPointerException이 발생하지 않도록 코드를 변경해보자.

```java
public boolean nullCheck2(String text) {
    if(text==null) {
        return true;
    }else {
        int textLength = text.length();
        System.out.println(textLength);
        return false;
    }
}
```

- 이런식으로 null 체크를 하게되면 예상치 못한 NullPointerException이 발생하지 않는다.
- null체크는 아무리 강조해도 지나치지 않는 것이므로, 항상 체크하는 습관을 들여야 한다.





#### 2. 문자열이 동일한지 비교하는 클래스

String 클래스에서 제공하는 문자열이 같은지 비교하는 메소드들은 매우 많다.

| 리턴 타입 | 메소드 이름 및 매개 변수            |
| --------- | ----------------------------------- |
| boolean   | equals(Object anObject)             |
| boolean   | equalsIgnoreCase(String anotherStr) |
| int       | compareTo(String anotherStr)        |
| int       | compareToIgnoreCase(String str)     |
| boolean   | contentEquals(CharSequence cs)      |
| boolean   | contentEquals(StringBuffer sb)      |

메소드의 이름대로 분류하면 **equals**로 시작하는 메소드, **compareTo**로 시작하는 메소드, **contentEquals** 로 총 세 가지로 분류할 수 있다. 이름들은 상이하지만, 이 모든 메소드들은 **매개 변수로 넘어온 값과 String 객체가 같은지를 비교하기 위한 메소드다.** 

IgnoreCase는 말 그대로 '대소문자 무시'를 뜻한다.



위 메소드들 중 가장 많이 사용하는 equals 메소드를 살펴보자.  

- 먼저아래 메소드를 보고 어떤 결과가 나올지 생각해보자.

```java
public void checkCompare() {
    String s1 = "Cat";
    String s2 = "Cat";
    if(s1==s2) {
        System.out.println("s1==s2 result is same");
    }else { 
    	System.out.println("s1==s2 result is different.");
    }
    if(s1.equals("Cat")) {
        System.out.println("s1.equals(s2) result is same");
    }
}
```

결과부터 보자면 아래와 같다.

```
s1==s2 result is same.
s1.equals(s2) result is same
```

일반적으로 생각하기에는 두 번째 if 문만 통과할 것이라고 생각할 수 있다. 그 이유는 객체는 반드시 equals() 메서드로 비교해야 한다고 배웠기 때문이다. 올바르게 배운 것이 맞다. 객체는 반드시 equals() 메소드로 비교해야 한다.

하지만, 여기서 첫 번째 if문이 통과한 이유는 바로 자바에 **String Constant Pool** 이라는 것이 존재하기 때문이다. **String Constant Pool** 에 대해서 간단하게 이야기 하면, 자바에서는 객체들을 재사용 하기 위해 **String Constant Pool**  이라는 것이 만들어져 있고, String의 경우 동일한 값을 갖는 객체가 있으면 이미 존재하는(만든) 객체를 재사용한다. 따라서 s1과 s2의 객체는 실제로 같은 객체가 되는것이다.

- 만약에 첫 번째 if문의 결과를 다르게 출력하고 싶다면 아래 코드처럼 String 객체를 직접 생성하면 된다

  - ```java
    String s2 = new String("Cat");
    ```

  - 이렇게 String 객체를 생성하면 값이 같은 String 객체를 생성한다고 하더라도 Constant Pool의 값을 재활용하지 않고 별도의 객체를 생성하게 된다.
  
- 아래 그림을 통해 String Constant pool에 대해 정확히 이해할 수 있을 것이다.

  ![StringPooq](https://user-images.githubusercontent.com/39195377/98771141-1b94e780-2427-11eb-8657-8f65b1b9dc94.PNG)



### 3. String은 불변(immutable)의 객체이다.



**String은 최초에 한 번 생성되면 절대로 그 값이 변하지 않는다.**

```java
String str = "KH";
str = "KI HYUK";
```

위와 같이 str 이라는 String 객체를 생성한 이후에, "KH"를 "KI HYUK"로 바꾼다고 해도 실제 내부적으로는 String 객체의 값이 변경된것이 아닌, 새로운 String 객체가 생성된 것이다. 

즉, 아래 그림처럼 heap 영역을 살펴보면 처음에는 str이 "KH"를 참조하다가,  "KI HYUK" 객체를 참조하도록 재할당했을 뿐이다. 따라서 "KH"라는 단어를 갖고있는 객체는 쓰레기값(Garbage Collection)의 대상이 된다.

![String](https://user-images.githubusercontent.com/39195377/98771138-1a63ba80-2427-11eb-86a2-bddec37e2f06.PNG)



 ### 그렇다면, String은 왜 불변객체로 설계되었을까?

이 글의 맨 앞에서 소개했듯이, String은 자바에서 가장 많이 사용되는 객체이다. 그렇다는 말은 String타입의 객체들이 가장 많은 메모리를 차지한다는 뜻으로 해석할 수 있다.

결론부터 말하자면 **String 객체는 재사용 될 가능성이 높기때문에 같은 값일 경우, 어플리케이션 당 하나의 String 객체만을 생성해두어 JVM의 힙(heap)을 절약하기 위함이다.**



###### 1. String 객체의 캐싱

- 예를들어, '축구'와 관련된 웹사이트가 Java 언어로 만들어졌다고 가정해보자. 여기서 "축구" 라는 문자열이 아마도 굉장히 많이 쓰일것이다. 만약에 이 사이트가 세계적으로 유명한 사이트라면, 1초에 수백, 수천만의 HTTP request 요청을 받게 될 것이다.

- "축구"라는 값을 가지는 문자열 객체를 사용자의 요청을 처리할때마다 계속해서 한개씩 생성한다면, 힙(heap)에는 "축구"라는 값을 가진 문자열 객체가 사용자의 요청 만큼 생성되어 있을 것이다.

- 조금 더 작은 예로, 우리가 "Hello" 라는 문자열을1000번 출력한다고 가정해보자.

  ```java
  for(int i=0; i<1000; i++){
      String str = "Hello";
      System.out.println(str);
  }
  ```

  위 코드는 "Hello" 라는 값을 갖는 1000개의 String 객체를 생성하게 된다. 그러나 String의 immutable(불변)한 성질 덕분에 실제로는 "Hello"라는 문자열 객체는 단 하나만 생성된다.

  다만, "Hello"라는 참조값을 갖는 참조변수인 str변수 자체는 스택상에서 1000번 생성되었다가 사라질 뿐이다.

- 이러한 원리는 앞에서 설명한 **String Constant Pool**  이라는 특별한 공간에 의해 성립한다.

  동일한 문자열이 **String Constant Pool** 에 존재한다면, 새로 객체를 생성하지 않고 **String Constant Pool** 에 있는 객체를 사용하는 것이다.

- 결론적으로, 객체의 캐싱으로 인해 [메모리 절약]과 자주 쓰이는 값을 CPU와 가까운 곳에 위치시킴으로써 [속도 향상] 의 효과를 얻을 수 있다.

##### 2. 보안 기능

- **String이 불변이 아니라면 보안상의 문제를 야기할 수 있다.** 
  - 예를 들어, DB의 username과 password 라던가, 소켓 통신에서 host와 port에 대한 정보가 String으로 다루어지기 때문에 String이 불변이 아니라면, 해커의 공격으로부터 값이 변경될 수 있다.
  - 네트워크 연결시 포트,파일 경로, db 연결에 필요한 URL도 모두 String으로 이루어져 있다. 그런데 이러한 String이 가변적이라면 누군가가 고의로든 실수로든 a를 b로 바꿔버리면 심각한 문제를 초래할 수 있다.

##### 3. 안전성(Thread-safe)

- String 객체가 변경될 수 없다는것은 여러 쓰레드에서 동시에 특정 String 객체를 참조하더라도 안전하다는 뜻이다.
  - 만약, 여러 어플리케이션에서 특정 String 객체를 참조하고 있을때, 그 값은 절대 변하지 않으므로 안전하다고 할 수 있다.
  - 앞에서 설명했듯이, 만약 String str= "KH"에서 str = "KI HYUK"로 새로운 값을 할당한다고 해도, String 객체의 값이 변경된 것이 아니다.





#### immutable한 String을 보완하기 위한 클래스, StringBuffer와 StringBuilder의 차이점

String은 불변의 객체라고 했다. 분명 String이 불변으로 설계된대는 충분한 이유가 있고, 여러가지 장점이 있다. 하지만 String이 불변으로 설계되어서 생기는 단점도 있다.

바로 GC(Garbage Collection) 이다.  기존 문자열을 수정하게 되면 그 전에 사용하던 String 객체는 GC의 대상이 된다.



이러한 단점을 보완하기 위한 **StringBuffer**와 **StringBuilder**가 있다. 

### 1. StringBuffer

- Synchronized- 동기화를 지원한다.

  <u>동기화</u>를 지원한다는 것은 멀티스레드 환경을 지원한다는 것이다. 즉, **멀티스레드 환경에서 안전**하다는 뜻이다. (=Thread safe)

  - <u>동기화</u> : A스레드와 B스레드가 한 객체를 작업중일 때, A가 값을 바꿔버리면 B가 엉뚱한 값으로 작업을 시도할 수 있다. 여러 스레드가 한 자원을 사용하려고 할 때 다른 스레드의 접근을 막는 것을 동기화라 한다. 데이터의 무결성을 보장해준다. 다른 스레드의 접근을 막는 동기화를 지원하니, 여러 스레드(멀티 스레드)가 작업하기에 매우 안전한 환경이 만들어진다. 그래서 동기화를 지원한다는 말은 멀티스레드 환경을 지원한다는 말과 같다고 볼 수 있다.

### 2. StringBuilder

- non-Synchronized -동기화를 지원하지 않는다.

  동기화를 지원하지 않기 때문에 **단일 스레드 환경에서 사용**해야 한다. 

  또한 StringBuilder는 동기화를  고려하지 않기때문에 단일 쓰레드 환경에서 사용시 StringBuffer에 비해 **속도가 빠르다**.





#### StringBuffer와 StringBuilder 정리

- StringBuffer와 StringBuilder의 차이는 **'Thread safe 하다'** 와 **'Thread safe 하지 않다'** 는 것이다. 

- 결론적으로, StringBuffer가 StringBuilder보다 더 안전하다는 것만 기억해두자. 

- 다만 속도는 StringBuilder가 더 빠르다. ~~단순하게, 안전에는 대가가 따른다고 외우면 편하다.~~





### 결론

- String 클래스는 자바에서 가장 많이 사용되는 클래스 중 하나다. 따라서 String에 대해 깊게 공부할 필요가 있다.

- String 클래스를 잘 사용해야만 메모리를 효율적으로 사용할 수 있다

- StringBuffer와 StringBuilder를 상황에 맞게 잘 사용하자

  

  

------

#### StringBuffer와 StringBuilder 추가내용

글을 다 작성하고  StringBuffer와 StringBuilder의 적절한 상황에 대해서 더 알아보았다.

- StringBuffer와 StringBuilder는 성능으로만 보면 2배의 속도 차이를 보인다고 한다. 
- 하지만 참고한 사이트의 속도 실험 결과, append() 연산이 약 1억6천만번 일어날 때 약 2.6초  정도의 속도 차이를 보인다고 한다.
- 2.6초라는 수치가 무의미한지 유의미한지는 프로그램의 스펙에 따라 다르다.
- **따라서, 문자열 연산이 엄청나게 많이 일어나지 않는 환경이라면 StringBuffer를 이용해 thread-safe하게 구현하는 것이 좋다는 의견이 있었다.**



참고 자료

------

[자바의 신](http://www.yes24.com/Product/Goods/42643850) VOL1 14장 String class


  </div>
</details>

<details>
  <summary>Serializable</summary>
  <div markdown="1">
   # Serializable (직렬화)에 대하여

최근 학교에서 진행한  프로젝트와 토이 프로젝트를 진행하면서 자바 기초 지식에 대한 부족함을 뼈져리게 느끼게 되었다.😭

그래서 '자바의 신' 이라는 자바 기본서적을 구매해서 읽던 도중 여러 클래스에 구현되어있는 **Serializable** 이라는 interface가 도대체 어떤 역할을 하는지 궁금해서 정리해 보았다.

**(Serializable을 구현한 클래스 예)**

```java
public final class LocalDateTime
        implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable
```

```java
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence 
```



먼저 이 인터페이스를 인텔리제이에서 열어보았다. 아래와 같이 이 인터페이스의 API에는 <u>선언된 변수나 메소드가 없다</u>.

```java
package java.io;
//중략
public interface Serializable {
}
```



이 말은 즉슨 우리가 구현해야할 메소드가 없다는 뜻이다. 그렇다면 이 인터페이스는 도대체 왜 존재하는 것일까?

### 1. Serializable의 존재 이유

 우리가 개발을 하다보면, **생성한 객체를 파일로 저장**할 일이 있을 수도 있고, **저장한 객체를 읽을 일**이 생길수도 있다.  그리고 **다른 서버로 보낼 때도 있고**, **다른 서버에서 생성한 객체를 받을 일도 있을 것이다.**

이럴때 반드시 구현해야 하는 인터페이스가 바로 **Serializable** 이다.  이 인터페이스를 구현하면 JVM에서 해당 객체를 저장하거나, 다른 서버로 전송할 수 있도록 해준다.

#### 객체를 파일로 저장하는 간단한 예제를 살펴보자

이 예제 코드에서 사용될 **ObjectOutputStream** 은 자바에서 객체를 저장할때 사용하는 클래스다.

```java
public class khDTO  {
    private String name;
    private int age;
    private String address;
    public khDTO(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
       // .. 생략
    }
}
```

- 위 코드는 단순하고 평범한 DTO 클래스이다. 
- 이제 이 DTO를 저장하는 클래스를 만들자.

```java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator+"KH"+separator+"text"+separator+"KH.obj"; //설명 참고
        khDTO dto = new khDTO("JEONG",20,Incheon);
        manager.saveObject(fullPath,dto);
    }
    
    public void saveObject(String fullPath, khDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullpath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write Success");
        }catch {
             // 생략
        }
    }
```

```java
 String fullPath = separator+"KH"+separator+"text"+separator+"KH.obj"
```

- fullPath 변수는 단순히 KH/text라는 경로에 KH.obj 라는 파일로 dto를 저장한다는 것을 명시한 변수다.

```
 fos = new FileOutputStream(fullpath);  //  1
            oos = new ObjectOutputStream(fos); //  2
            oos.writeObject(dto); //  3
```

1. FileOutputStream 객체를 fullPath 경로와 파일명에 알맞게 생성한다.
2. 객체를 저장하기 위해 ObjectOutputStream 객체를 생헝했다. 이 객체에서 (1)에서 생성한 객체를 매개 변수로 넘겼다. 이렇게하면 해당 객체는 파일에 저장된다.
3. writeObject라는 메소드를 사용하여 매개 변수로 넘어온 객체를 저장한다.



이제 ManageObject 클래스를 실행해보자. 아마도 'Write Success' 라는 메시지가 출력되리라고 생각했을 것이다. 

하지만 이 클래스 실행 결과는 **NotSerializableException** 이다. 그 이유는 바로 khDTO에 Serialzable 인터페이스를 구현하지 않았기 때문이다.  

DTO 클래스에 다음과 같이 인터페이스를 구현하면 정상적으로 "Write Success" 라는 메시지가 출력될 것이다.

```java
import java.io.Serializable;
public class khDTO implements Serializable   {
}
```



#### 이번에는 반대로, 객체를 읽어어는 예제를 살펴보자

```java
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ManageObjectInput {
    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream((fullPath));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            khDTO dto = (khDTO)obj;
          }catch {
             // 생략
        }
    }
```

- 객체를 저장할때 사용했던 코드와 거의 동일하다. 단지 Output 대신 Input으로 되어있는 클래스들을 사용하면 된다.
- 이제 main() 메소드를 loadObject가 실행되도록 살짝 수정하고 실행시켜보자.

```java
 public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator+"KH"+separator+"text"+separator+"KH.obj"; //설명 참고
     //   khDTO dto = new khDTO("JEONG",20,Incheon);
     //   manager.saveObject(fullPath,dto);
     	manager.loadObject(fullPath);
    }
```

khDTO 에서 toString을 구현해 놓았기 때문에 다음과 같이 읽어 들인 객체의 내용이 출력될 것이다.

```
khDTO [name= Jeong, age = 20 , address = inchen]
```

물론 이러한 출력 결과를 얻으려면 khDTO 클래스에서 Serializable을 implements 해야 한다.



### 2. SerialVersionUID 는  Serializable과 항상 함께해야한다.

바로 위 예제 코드를 다시 한번 사용해서 SerialVersionUID가 무엇인지 알아보자.

아래와 같이 khDTO 클래스에 새로운 변수를 하나 추가해보자.

```java
public class khDTO implements Serializable {
    private String bloodType = "A";
}
```

이렇게 수정하고 바로 위 객체를 읽어오는 메소드인 loadObject를 실행해보자. 결과는 다음과 같다.

```java
java.io.InvalidClass Exception : e.serial.khDTO; local class incompatible : ... //중략
```

SerialVersionUID 가 다르다는 InvalidClassException 예외 메시지가 출력된다.  이쯤에서 SerialVersionUID 가 무엇인지 알아보자.

#### **SerialVersionUID**란?

SerialVersionUID은 해당 객체의 버전을 명시하는데 사용한다.  만약 A라는 서버에서 B라는 서버로 khDTO 라는 클래스의 객체를 전공한다고 가정해보자. 전송하는 A 서버에 khDTO 라는 클래스가 있어야 하고, 전송을 받는 B 서버에도 khDTO 라는 클래스가 있어야 한다. 그래야만 그 클래스의 객체임을 알아차리고 그 데이터를 받을 수 있다.

그런데 만약 **A 서버**가 갖고 있는 **khDTO 클래스의 변수는 3개인데**, **B서버**가 갖고있는 **khDTO 클래스의 변수는 4개**인 상황이 발생하면 어떻게될까?  <u>이러한 상황이 발생하면 자바에서는 다른 클래스로 인식하게 된다.</u>  

따라서 각 서버(여기서는 A서버와 B서버)들이 쉽게 해당 객체가 같은지 , 다른지를 확인할 수 있도록 하기 위해서 필요한 것이 SerialVersionUID 이다.

```java
static final long serialVersionUID = 1L;
```

이런식으로```static final long```  으로 선언해야하며, 변수명도 반드시 serialVersionUID로 선언해야 한다. 



이제 **SerialVersionUID**에 대해서 알아보았으니, 위에서 InvalidClassException 예외가 발생했던 클래스를 아래와 같이 수정하자.

```java
public class khDTO implements Serializable {
    static final long serialVersionUID =1L;
    private String bloodType = 1L;
    //중간 생략
    @Override
    public STring toString() {
        //toString 구현 생략
    }
}
```

이제 앞에서 주석처리 해놓았던 ```manager.saveObject(fullPath,dto);``` 메소드를 주석을 푼 후 다시 실행해보자.

그러면 아래와 같이 정상적으로 출력될 것이다.

```java
Write Success
khDTO [name = Jeong, age = 20, address = incheon , bloodType = A ]
```



이제 마지막으로,  **SerialVersionUID** 을 위 예제 처럼 지정해 놓은 상태에서 저장되어 읽는 객체가 다르다면 어떻게 될까?

``` private String bloodType``` 변수를 ``` private String bloodTypes ``` 로 변경한 다음에  ```manager.saveObject(fullPath,dto);``` 메소드를 다시 주석처리 한 후 main 메소드를 실행시켜보자.

```java
Write Success
khDTO [name = Jeong, age = 20, address = incheon , bloodTypes = null ]
```

즉, 변수의 이름이 바뀌면 저장되어 있는 객체에서 찾지 못하므로, 해당 객체는 null로 처리된다.

지금까지 살펴본 예제를 보면 **Serializable**을 구현해 놓은 상태에서 **SerialVersionUID** 을 명시적으로 지정하면 변수가 변경되거나 추가되더라도 InvalidClassException 예외가 발생하지 않는다. 

하지만 만약에 이렇게 **Serializable**을 구현한 객체의 내용이 추가되거나 변경되었는데도 아무런 예외가 발생하지 않으면 운영 상황에서 데이터가 꼬이게 되어 큰 문제를 발생시킬수도있다. 

따라서 대부분의 IDE(이클립스/인텔리제이 등등)에서는 **SerialVersionUID**를 자동으로 생성하는 기능을 제공하여 이러한 문제를 사전에 차단한다. 만약 IDE를 사용하지 않는다면, 데이터가 변경되었을때 반드시 **SerialVersionUID**도 값을 변경해야 한다.



### 3. 마지막으로 transient 

이제 정말 마지막이다. 💪

 **transient**에 대해서 알아보자. 아래 예시 코드 처럼 khDTO의 변수에 transient라는 예약어를 추가할 수 있다.

```java
transient private int  age;
```

이 상태에서 앞에서 구현했던 saveObject() 메소드를 실행하게 되면 아래와 같은 결과를 가져온다.

```java
Write Success
khDTO [name = Jeong, age = 0, address = incheon , bloodType = A ]
```

분명 age의 값을 20으로 지정하고 저장했다. 하지만 읽어낸 값을 보면 0이 출력되었다.



**transient**는 이 예제만 보고도 충분히 눈치챌 수 있는 기능이다. 바로 **transient** 을 선언한 변수는 Serializable의 대상에서 제외된다. 

다시 말해서 해당 객체는 저장 대상에서 제외되어 버린다. 즉, 이 기능은 보안상 중요한 변수나 꼭 저장해야 할 필요가 없는 변수에 사용하면 된다.





------

이렇게 직렬화에 대해서 알아보았지만, 사실 *여러 가지* 문제(보안/유지 보수성/테스트 등등) 때문에 자바에서는 직렬화를 지양한다고 한다. 하지만 꼭 알고 있어야 하는 내용이기에, 정리해 본다.



**참고 자료**

------

[우아한 형제들 기술블로그](https://woowabros.github.io/experience/2017/10/17/java-serialize.html)

[자바의 신 VOL.2 . 27장 : Serializable과 NIO도 살펴 봅시다.](
  </div>
</details>




