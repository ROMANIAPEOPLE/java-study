# Java-study  

<details>
  <summary>자바의신vol1</summary>
  <div markdown="1">
  
  # 자바의 신 vol1 핵심 키워드 정리

- 자바의 가장 작은 단위는 클래스

  - 메소드는 어딘가 소속이 되어있어야만 한다. 즉, 클래스(class)에 포함되어있어야 한다.
  - 클래스는 [상태]와 [행동]이 있어야만 한다.
    - 여기서 [상태]는 변수, [행동]은 메소드에 해당한다.

- 기본 생성자는  클래스를 컴파일할 때 javac를 실행하면 클래스 파일 안에 자동으로 만들어 진다.

- 클래스를 통해서 객체를 생성할 수 있다. 하나의 클래스를 만들면 그 클래스의 모습을 갖는 객체들을 여러개 생성할 수 있다. 일반적으로 클래스의 메소드나 변수들을 사용하려면 객체를 생성해야한다.

- #### 변수

  - 지역변수 : 중괄호 내에서 선언된 변수(메소드 안에 선언된 변수)

  - 매개변수 : 메소드에 넘겨주는 변수

  - 인스턴스 변수 :  클래스 안에, 메소드 밖에 선언된 변수(static이라는 키워드가 없어야 한다.)

  - 클래스 변수(전역변수) : 인스턴수 변수처럼 메소드 밖에, 클래스 안에 선언되지만 앞에 static이라는 약어가 붙는다.

  - 변수는 **참조형**과 **자료형** 으로 나뉜다.

    - new 로 초기화 하여 사용해야하는 것은 '참조자료형'

    - 그렇지않고 바로 사용 가능한 것이 '기본자료형' 이다.

    - 단, 예외로 String은 '참조자료형'인데 그냥 바로 사용 가능하다.

    - ```java
      String str = new String("hello");
      String str = "hello";
      ```

      두개다 동일한 코드이다.

  - 기본 자료형은 8개다.

    - byte,int,long,short,char
    - float,double
    - boolean

  - 자바에서는 기본적으로 숫자는 무조건 int로 생각하기 때문에 long타입의 숫자를 명시적으로 지정해 줄 때에는 반드시 숫자 가장 뒤에 L을 붙여주어야만 한다.

  - short 타입을 long으로 변환할 때에는 캐스팅을 할 필요가 없다

  - long 타입을 short타입으로 변환할 때에는 큰 타입에서 작은 타입으로 변하는 것임으로 캐스팅이 필요하다.

  - 범위가 큰 타입으로 /작은 타입으로 변환할 경우 값이 달라질 확률이 매우 높다.

- #### for/if

  - switch문은 enum type와 long을 제외한 정수형, String(java7 이후) 가 사용 가능하다.

- #### 참조자료형

  - static 메소드에는 static변수(클래스변수,전역변수)만 사용할 수 있다.

- #### 접근제어자

  - public : 누구나 접근 가능
  - protected : 같은 패키지 내에 있거나 상속받은 경우에만 접근 가능
  - pakage-private : 같은 패키지 내에 있을 때만 접근 가능(default)
  - private : 같은 클래스에서만 접근 가능

- #### 상속

  - 부모 클래스에서는 기본 생성자를 만들어 놓는 것 이외에는 상속을 위해서 아무런 작업을 할 필요 없다.
  - 자식 클래스의 생성자가 호출되면, 자동으로 부매 클래스의 매개 변수 없는 생성자가 실행
  - 자식 클래스에서는 부모 클래스에 있는 public, protected로 선언된 모든 인스턴스 및 클래스 변수와 메소드를 사용할 수 있다.
  - 접근제어자가 자식에서 확대되는것은 상관 없지만 축소되면 오류가 발생한다.
  - 

- #### 다형성

  - 형변환을 하더라도 실제 호출되는 것은 원래 객체이 있는 메소드가 호출된다.
  - 부모 클래스에 선언된 변수와 동일한 이름을 가지는 변수를 선언할 수도 있다
    - 하지만, 이렇게 엎어 쓰는 것은 권장하지 않는다.
  - 부모클래스에 선언되어 있지 않는 이름의 변수를 선언할 수 없다.



#### Object class

모든 클래스의 부모는 object로, java.lang 패키지에 선언되어 있다.	

- 자바에서는 아무런 상속도 받지 않으면 java.lang.Object 클래스를 확장한다.
- 예를들어, main 메소드 외에는 아무것도 선언되어 있지 않은 클래스에서 객체를 생성 후 toString 메소드를 호출해보면 정상적으로 호출되는것을 확인할 수 있다.
- Object 클래스에 있는 메소드들을 통해서 클래스의 기본적인 행동을 정의할 수 있다.
- 예를들어, 사람은 두말로 걷고 , 말을 하고 , 생각을 한다.(일반적인 경우) 클래스도 마찬가지로 "이정도의 메소드는 정의되어 있어야 하고 , 처리해 주어야 한다"는 것ㅇㄹ 정의하는 작업이 필요하기 때문에 Object 클래스를 상속받았다고 한다.

#### Object 클래스에서 제공하는 메소드들의 종류

오브젝트 클래스에 선언되어있는 메소드는 객체를 처리하기 위한 메소드와 쓰레드를 위한 메소드로 나뉜다. 참고로 쓰레드를 위한 메소드는 어떤 것들이 있는지만 확인해보고 추후에 학습하기로 한다.



| 메소드                            | 설명                                                         |
| --------------------------------- | ------------------------------------------------------------ |
| proteced Object clone()           | 객체의 복사본을 만들어 리턴한다.                             |
| public boolean equals(Object obj) | 현재 객체와 매개 변수로 넘겨받은 객체가 같은지 확인한다. 같으면 true, 다르면 false를 리턴한다. |
| protected void finalize()         | 현재 객체가 더 이상 쓸모가 없어졌을 때 가비지 컬렉터에 의해 이 메소드를 호출한다. 이 메소드는 따로 호출할 일이 없으므로, 신경쓰지 말고 그냥 있다는 것 정도만 알아두자. |
| public Class<?> getClass()        | 현재 객체의 Class 클래스의 객체를 리턴한다.                  |
| public int hashCode()             | 객체에 대한 해시 코드(hashCode)값을 리턴한다. 해시 코드라는 것은 "16진수로 제공되는 객체의 메모리 주소"를 말한다. |
| public String toString()          | 객체를 문자열로 표현하는 값을 리턴한다.                      |

```
*참고*
자바로 개발할 때에는 "넌 필요 없는 객체니까 죽어!" 라고 개발자가 직접 지정해 줄 수 없다. 이럴 때 필요한 것이 바로 가비지 컬렉터이며, 자바의 메모리에 있는 쓰레기를 청소하는 로봇이라고 생각하면 된다. 여러분들이 객체를 만들고, 그 객체가 어디에서 쓰인 후에 필요가 없어졌을 때, 이 로봇이 자바 프로세스 내에 있는 객체들을 뒤져 보면서 어떤 객체를 죽일지, 살릴지를 확인해서 처리해준다.
```



#### Object클래스에서 가장 많이 쓰이는 toString() 메소드

```java
public class ToString {
    public static void main(String [] args){
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
    } 
    
    public void toStringMethod(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
}
```

위 코드에서 toStringMethod 메소드의 출력결과는 모두 동일한 주소값을 출력한다. 

```java
c.inheritance.ToString@1540e19d
c.inheritance.ToString@1540e19d
plus c.inheritance.ToString@1540e19d
```

마지막 3번째 plus와 함께 출력된 주소값을 보면 알 수 있듯이, [String]을 제외한 참조 자료형에 더하기 연산을 수행하면 , 자동으로 toString() 메소드가 호출되어 객체의 위치에는 String 값이 놓이게 된다.





### interface, abstract , enum

- interface 자체를 객체생성해서 사용하면 에러가 발생한다

  - cannot be istantiated 라는 오류가 발생하는데, 쉽게 말해서 '왜 아무것도 구현해 놓지 않았는데, 얘로 초기화 하려는 것이냐?' 라는 뜻이다.

  - 그렇다면, 이 인터페이스로 객체생성을 하기 위해서는 클래스 형변환에 대해 생각해보면 된다.

  - ```java
    public interface MemberManager {
        public boolean addMember(MemberDto member);
        public boolean removeMember(String name, String phone);
        public boolean updateMember(MemberDto member);
    }
    ```

  - ```java
    MemberManager membermanager = new MemberManager(); // 에러 발생
    ```

  - ```java
    public class MemberManagerImpl implemensts MemberManager {
        @Override
        public boolean add Member(MemberDto member);
        . . .  생략
    }
    ```

  - ```java
    MemberManager member = new MemberManagerImpl();
    ```

    - 겉보기에는 member의 타입은 MemberManager이다. 그리고 MemberManagerImpl 클래스에는 인터페이스에 선언되어 있는 모든 메소드들이 구현되어 있다. 따라서 실제 member타입은 MemberManager가 되기 때문에, member에 선언된 메소드들을 사용하면 MemberManagerImpl에 있는 메소드들이 실행된다.

  - 인터페이스를 사용하는 이유는 다음과 같다.

    1. 완벽한 추상화를 달성하기 위해서
    2. 다중 상속의 기능을 사용하기 위해서
    3. 약한 결합을 위해서
    4. 다형성을 사용하기 위해서

- #### 일부 완성되어있는 abstract 클래스

  - 인터페이스도 아니다. 그렇다고 클래스라고도 하기 힘든 abstract 클래스에 대해서 알아보자.
  - abstract은 말그대로 '추상적인' 의미이다. 대부분의 일반인은 추상화를 보면 사실적인 그림보다는 그 그림이 나타내는 의미를 알기 어렵다.
  - 마찬가지로, abstract 클래스는 자바에서 마음대로 초기화하고 실행할 수 없도록 되어있다.
  - 따라서 그 abstract 클래스로 구현해 놓은 클래스로 초기화 및 실행이 가능하다.

- ##### abstract의 조건

  - 추상 클래스 선언시 abstract이라는 예약어가 클래스 앞에 추가되면 된다.

  - abstarct 클래스 안에는 abstarct으로 선언된 메소드가 0개 이상 있으면 된다.(없어도 된다)

  - 단, abstarct 메소드가 하나라도 있으면 그 클래스는 반드시 abstarct으로 선언되어야 한다.

  - abstract 클래스는 몸통이 있는 메소드가 0개 이상 있어도 전혀 상관 없으며, **static** 이나 **final** 메소드가 있어도 상관 없다.

  - 인터페이스는 모든 멤버변수가 static final인데 생략해도 자동으로 static final임.

  - abstract 클래스는 interface가 아니기떄문에 implements를 통해 구현할 수 없다.

  - 대신 상속과 동일한 개념으로 생각해서, extends를 통해 구현하면 된다.

  - abstract으로 선언되어 있는 메소드들은 반드시 구현해야 한다. 구현하지 않으면 에러가 발생한다.

  - abstract 만으로는 객체생성 할수없음!!

  - abstaract을 사용하는 이유는 **어떠한 메소드를 미리 만들어 놓고 싶은데, 그렇다고 클래스를 만들기는 좀 애매할때, 아주 공통적인 기능을 미리 구현해 놓을때 사용한다**

  - 아래 표를 통해 interface와 abstract, 그리고 class를 비교 정리해보자.

    - |                                    | 인터페이스 | abstract 클래스 | 클래스     |
      | ---------------------------------- | ---------- | --------------- | ---------- |
      | 선언 시 사용하는 예약어            | interface  | abstract        | class      |
      | 구현 안 된 메소드 포함 가능 여부   | 가능(필수) | 가능            | 불가       |
      | 구현된 메소드 포함 가능 여부       | 불가       | 가능            | 가능(필수) |
      | static/final 메소드 선언 가능 여부 | 불가       | 가능            | 가능       |

  - interface와 마찬가지로, abstract 클래스를 객체화 할 때 abstract 메소드가 존재한다면 abstract 메소드를 오버라이드 해야 객체화 할 수 있다.

- #### final

  - final은 변수 , 클래스, 메소드 모두 사용할 수 있는 키워드이다.

  - class에 final을 사용한다는 의미는, 상속을 거절하겠다는 의미이다.

  - 메소드에 final을 선언하는 경우도 class에 final을 선언하는 이유와 비슷하다. overriding을 할 수 없게 한다는 뜻이다.

  - 단, 변수에서 final을 사용하는것은 위 두개의 상황과 조금 다르다.

    - 인스턴스 변수나, 전역 변수(클래스변수) 에서는 final로 변수를 선언시 반드시 초기화를 함께 진행해줘야 한다.

    - final의 기본 의도 자체가, "더 이상 수정하지 마" 와 동일한 의미인데, 만약 전역변수나 인스턴스변수에서 초기화를 해주지 않았다면, 메소드에서 초기화를 진행해야 하기 때문이다.

    - 그렇다면, 지역변수(메소드 안)는 바로 초기화 하지 않아도 될까? 

      - ```java
        public lass FinalVariable{
            //생략
            public void method(final int parameter) {
                final int localVariable;
                localVariable = 2;
                localVariable = 3;
                parameter = 4;
            }
        }
        ```

    - 위 코드에서 localVariable = 2 로 선언할 때에는 아무런 문제가 없다. 하지만 그 다음줄인 3으로 다시 선언하는 부분에서 컴파일 에러가 발생한다. 마찬가지로 parameter도 이미 매개변수로 넘어오기 전에 final로 선언되어 있기 때문에, 다시 값을 할당하면 안된다.

    - 결국 final은 날짜,원주율과 같은 불변의 변수로만 사용해야 한다.

  - #### 객체에 선언하는 final은 ?

    - ```java
      public class FinalReferenceType {
          final MemberDto dto = new MemberDto();
          
          public static void main(String [] args){
              FinalReferenceType referenceType = new FinalReferenceType();
              referenceType.checkDto();
          }
          
          public void checkDTO() {
              System.out.println(dto);
              dto = new MemberDto();
          }
          
      }
      ```

    - 위 코드는 에러가 발생한다. 어디서 에러가 발생할지 유추해보자.

    - 바로 dto = new MemberDto();이다. 에러가 발생하는 정확한 이유를 알지 못해도, 여태껏 학습한 final의 의미를 생각해보면 대충 감이 올 것이다.

    - 즉, 기본자료형과 마찬가지로 참조 자료형도 두 번 이상 값을 할당하거나 새로 생성자를 이용하여 초기화 할 수 없다. 

    - 다음으로는 참조자료형(객체)의 필드값을 수정하도록 checkDTO() 메소드를 수정해보자.

      ```java
          public void checkDTO() {
           //   dto = new MemberDto();
              dto.name = "HAHAHAHA";
          }
      ```

    - 이 경우에는 어떨까? 오류가 발생할까?

    - 정답은 정상적으로 컴파일이 된다. 게다가 name에 할당한 값도 정상적으로 할당된다.

    - dto 객체, 즉 MemberDTO 클래스의 객체는 FinalReferenceType에서 두 번 이상 생설할 수 없다. 하지만 그 객체의 안에 있는 객체들은 final로 선언된 것이 아니기 때문에 그러한 제약이 없는것이다.

    - 즉, 해당 클래스가 final 이라고 해서 그 안에있는 인스턴스 변수나 전역 변수가 final은 아니라는 것을 기억하자.

  - #### enum 클래스

    - enum 클래스의 생성자는 default(pakage-private)  와 private 만 접근 가능하다. 다시 말해서, 각 상수를 enum 클래스 내에서 선언할 때만 이 생성자를 사용할 수 있다.
    - enum class의 부모도 Object class이다. 하지만, Enum class의 개발자들이 Object 클래스 중 4개의 메소드를 Overriding 하지 못하도록 막아놨다.





- ### 예외 처리

  - ```java
    public void arrayOutOfBoundsTryCatch() {
        int [] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        }catch(Exception e) {
            System.err.println("Exception occured.");
        }
    }
    ```

  - 위의 코드의 실행 결과, 컴파일은 정상적으로 이루어진다.

  - 단, 일반적으로 생각해보면 "This code should run 이 실행 될 것이라고 생각했을 것이다."

  - 하지만 이미 inArray[5]의 값도 출력되지 않았고, 자바의 try-catch의 try 블록 안에서 예외가 발생되면 그 이하의 문장은 실행되지 않고 바로 catch 블록으로 넘어간다.

  - 다음으로 catch문을 살펴보아야 한다. 여기서 System.out이 아닌 System.err을 사용했다.

  - 콘솔 화면에서는 별로 구분이 안되지만, 개발 도구인 IDE에서는 출력 결과가 다른 색으로 표시된다. 오류가 발생하는 부분에는 이와 같이 System.err를 사용하는 것을 생활하 하는 것이 좋다.

  - try-catch 구문 밖에 있는 문장은 "무슨 일 있었어?" 하면서 실행된다.

    1. try-catch 에서 예외가 발생하지 않을 경우
       - try 내에 있는 모든 문장이 실행되고, try-catch 문장 이후의 내용이 실행된다.
    2. try-catch 에서 예외가 발생하는 경우
       - try 내에서 예외가 발생한 이후의 문장들은 실행되지 않는다.
       - catch 내에 있는 문장은 반드시 실행되고, try-catch 문장 이후의 내용이 실행된다.

- ### try-catch 사용시 주의점

  - try 블록은 말 그대로 중괄호로 쌓여있는 블록이다.

  - 그래서 try 블록 내에서 선언한 변수를 catch에서 사용할 수 없다.

  - ```java
    public void checkVariable2() {
        try {
            int [] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e){
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
    ```

  - 컴파일이 제대로 되지 않는다. 그 이유는 무엇일까?

    - intArray라는 배열은 try 블록 안에서 생성된 것이다.
    - 따라서 catch는 intArray가 누군지 모른다.

  - 그래서, 이런 문제를 해결하기 위해서 일반적으로 catch 문장에서 사용할 변수에 대해서는 다음과 같이 try 앞에 미리 선언해 놓는다.

  - ```java
    public void checkVariable3() {
        int [] intArray = null;
        try {
            intArray = new int[5];
        }catch(Exception e){
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
    ```

    - 이렇게 변수만 미리 선언해 놓으면 컴파일도 되고 실행도 된다.

- #### 무슨 일이 생겨도 반드시 실행되는 finally 

  - 크게 설명할 필요가 없은 부분이다. finally는 try-catch 구문이 끝나고 나서 finally 구문이 있는데, 이 구문 안에 있는 문장은 무조건 실행된다.

- #### try는 한개, catch는 여러개?

  - ```java
    public void multiCatch(){
        int [] intArray = new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArraysIndex error!");
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }
    ```

  - 위 코드의 결과는 "ArrayIndex error!" 이다. 이 결과를 보고 "음.. 앞에 있는 catch만 처리되는구나!" 라고 생각할 수도 있다. 어떻게 보면 맞는 말인데 틀린 말이기도 하다.

  - catch 블록의 순서는 매우 중요하다. catch 블록은 순서를 따진다. 다음 메소드로 예를 들어보자.

  - ```java
    public void multiCatch(){
        int [] intArray = new int[5];
        try{
            System.out.println(intArray[5]);
        }catch(Exception e){
            System.out.println(intArray.length);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArraysIndex error!");
        }
    }
    ```

  - 위 메소드의 출력결과는 "has already been caught" 라는 에러가 발생한다.

  - 그 이유는 바로 Exception이 모든 에러의 부모클래스이기 때문이다.

  - 즉, Exception 은 모든 에러를 처리하므로, Exception 다음에 catch문은 있을 필요도, 있어서도 안된다는 뜻이다.

  - **만약 catch문을 사용할 때에는 Exception 클래스로 catch 하는 것을 가장 아래에 추가하도록 하자!**

- #### 모든 예외의 할아버지는 java.lang.Throwable 클래스다

  - Throwable 클래스에 선언되어 있고, Exception 클래스에서 오버라이딩한 메소드는 10개가 넘는다. 그 중에서 가장 많이 사용되는 몇몇 메소드를 살펴보자.
    1. getMessage()
       - 예외 메시지를 String 형태로 제공 받는다. 예외가 출력되었을 때 어떤 예외가 발생되었는지를 확인할 때 매우 유용하다. 즉, 개발자가 그 메시지를 활용하여 별도의 예외 메시지를 보려고 할 때 좋다.
    2. toString()
       - 예외 메시지를 String 형태로 제공 받는다. 그런데 getMessage() 메소드보다는 약간 더 자세하게, 예외 클래스 이름도 같이 제공한다.
    3. printStackTrace()
       - 가장 첫 줄에는 예외 메시지를 출력하고, 두 번째 줄 부터는 예외가 발생하게 된 메소드들의 호출 관계(스택 트레이스)를 출력해준다.
       - 이 메소드는 개발할 떄에만 사용해야 한다. 운영할 때 사용하면 엄청나게 많은 양의 로그가 쌓이기 때문이다.

- #### 예외를 던지는 throws

  - ```java
    public class ThrowSample {
        public static void main(String[] args){
            ThrowSample sample = new ThrowSample();
            sample.throwException(13);
        }
        public void throwException(int number){
            try {
                if(number > 12) {
                    throw new Exception("Number is over than 12");
                }
                System.out.println("Number is " + number);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    ```

  - 만약 number로 13이 넘어왔다면, 정상적인 처리가 불가능할 것이다.

  - 이럴 때 반드시 예외를 발생시킬 필요는 없지만, 우리는 필요에 의해서 예외를 발생시킬 수도 있다.

  - 이러한 상황에서 try 블록 내에서 throw라고 명시한 후 개발자가 예외 클래스의 객체를 생성하면 된다.

  - ```java
    public void throwsException(int number) throws Exception {
        if(number > 12){
            throw new Exception("Number is over than 12")
        }
        System.out.println("number is" + number);
    }
    ```

  - 이렇게 메소드를 선언해 놓으면, 예외가 발생했을 때 try-catch 없이도 그 메소드를 호출한 메소드로 예외 처리를 위임하는 것이기 때문에 전혀 문제가 되지 않는다.

  - **단, 이렇게 throws Exception 처리를 한 메소드는, 이 메소드를 호출한 메소드에서 반드시 try-catch 처리를 해줘야 한다.**

  - **위 방법이 싫다면, 그 호출한 메소드 마저도 throws Excpetion을 선언하면 된다. 하지만 이렇게 throws 한것을 다시 throws 하는 것은 그리 좋은 습관은 아니다. 위 방법을 지향하자**



### Nested class

- 내부 클래스 중 static Nested 클래스의 경우, 이 내부 클래스를 감싸고있는 클래스의 static 변수만 참조 가능하다.
- 그냥 내부 클래스는 이 내부 클래스를 감싸고있는 클래스의 모든 변수를 참조할 수 있다.
- 반대의 경우에도 접근이 가능한데, 이럴경우 그 클래스의 객체를 생성해서 접근하면 된다.
  - private 이라도 접근이 가능하다.





### 어노테이션이란 ?

어노테이션은 클래스나 메소드 등의 선언시에 @를 사용하는 것을 말한다. 어노테이션은 영어로 Annotation이며, 메타데이터라고 불리기도 한다. 

- 컴파일러에게 정보를 알려주거나
- 컴파일할 때와 설치시의 작업을 지정하거나
- 실행할 때 별도의 처리가 필요할 때

사용한다.

이와 같이 매우 다양한 용도로 사용할 수 있는 어노테이션은 클래스, 메소드, 변수 등 모든 요소에 선언할 수 있다.



#### 미리 정해져 있는 어노테이션들은 딱 3개뿐

자바 언어에는 사용하기 위해서 정해져 있는 어노테이션은 3개가 있고, 어노테이션을 선언하기 위한 메타 어노테이션으라는 것은 4개가 있다. 하지만 이 메타 어노테이션은 선언을 위해서 존재하기 때문에 일반적으로 사용 가능한 어노테이션은 다음의 3개 뿐이다.

- @Override
- @Deprecated
- @Supress Warnings

물론 Java 버전이 올라가면서 이 어노테이션의 개수도 자연스레 증가하게 될 것이다.



1. @Override

   해당 메소드가 부모 클래스에 있는 메소드를 Override 했다는 것을 명시적으로 선언한다.

   우리가 Override를 할 때에는 부모 클래스에 있는 메소드의 이름과 매개 변수들을 동일하게 가져가는데, 만약 자식 클래스에 여러개의 메소드가 있을 때, 어떤 메소드가 Override되었는지 쉽게 알 수 없을 수도 있고 제대로 메소드를 Override했다고 생각했는데 매게 변수가 하나 빠져있을 수도 있다. 따라서 명확하게 "이 메소드는 Override 된 거니까 만약에 내가 잘못 코딩했으면 컴파일러 니가 알려줘야해!!" 라고 지정해 주는 것이라고 생각하면 된다.

2. @Deprecated

   미리 만들어져 있는 클래스나 메소드가 더 이상 사용되지 않는 경우가 있다. 그런것을 deprecated라고 하는데, 컴파일러에게 "얘는 더이상 사용하지 않으니까 그렇게 알고있어." 라고 말하는 것과 같다.

3. @SupressWarnings 

   간혹 코딩을 하다 보면 컴파일러에서 경고를 알리는 경우가 있다. 프로그램에는 문제가 없는데, 내가 잘 알아서 하는데 이러한 경고가 나타나면 웬지 마음이 불편하다. 그럴 때 컴파일러에게 "야, 일부러 이렇게 코딩한거니까 경고하지마" 라고 말하는 것 이라고 생각하면 된다.



#### 직접 어노테이션을 선언하기 위한  [메타 어노테이션]

메타 어노테이션 이라는 것은 어노테이션을 선언할 때 사용한다. 메타 어노테이션은 총 4개가 존재한다.

- @Target
- @Retention
- @Documented
- @Inherited



1. @Target

   어노테이션을 어떤 것에 적용할지를 선언할 때 사용한다. 

   ```java
   @Target(ElementType.METHOD)
   ```

   | 요소 타입      | 대상                             |
   | -------------- | -------------------------------- |
   | CONSTRUCTOR    | 생성자 선언시                    |
   | FIELD          | enum 상수를 포함한 필드값 선언시 |
   | LOCAL_VARIABLE | 지역 변수 선언시                 |
   | METHOD         | 메소드 선언시                    |
   | PACKAGE        | 패키지 선언시                    |
   | PARAMETER      | 매개 변수 선언시                 |
   | TYPE           | 클래스,인터페이스,enum 등 선언시 |



2. @Retention

   얼마나 오래 어노테이션 정보가 유지되는지를 다음과 같이 선언한다.

   ```java
   @Retention(RetentionPolicy.RUNTIME)
   ```

   @Target 처럼 괄호 안에 지정하는 적용 가능한 대상은 다음과 같다.

   |         | 대상                                                         |
   | ------- | ------------------------------------------------------------ |
   | SOURCE  | 어노테이션 정보가 컴파일시 사라짐                            |
   | CLASS   | 클래스 파일에 있는 어노테이션 정보가 컴파일러에 의해서 참조 가능함. 하지만, 가상 머신에서는 사라짐 |
   | RUNTIME | 실행시 어노테이션 정보가 가상 머신에 의해서 참조 가능        |



3. @Documented

   해당 "어노테이션에 대한 정보다 Javadocs(API) 문서에 포함된다는 것"을 선언한다.

4. @Inherited

   모든 자식 클래스에서 부모 클래스의 어노테이션을 사용 가능하는 것을 선언한다.



```java
import java.lang.annotation.EletmentType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotaion {
    public int number();
    public String text() default "This is first annotation";
}
```

1. 먼저 Target을 살펴보자.  ElementType.METHOD를 넣어줌으로써 이 어노테이션은 메소드에 사용할 수 있다고 지정된 것이다.
2. @Retention은 어노테이션 유지 정보를 지정하는데 사용한다. 소괄호 안에 RetentionPolicy.RUNTIME으로 지정하면 실행시에 이 어노테이션을 참조하게 된다.
3. 어노테이션 이름인 UserAnnotation 앞에는 @interface가 선언되어 있다. 이걸 선언하면, @UserAnnoation으로 어노테이션 사용이 가능해진다.
4. 어노테이션 선언안에는 number메소드와 text 메소드가 있다. number 메소드의 리턴타입은 int이며 text의 리턴타입은 String 이다. 이렇게 메소드처럼 어노테이션 안에 선언해 놓으면, 이 어노테이션을 사용할 때 해당 항목에 대한 타입으로 값을 지정 가능하다.
5. text()를 보면 default라는 예약어를 쓴 뒤 문자열이 지정되어 있는 것을 볼 수 있다. default를 넣으면 이 어노테이션을 사용할때 기본값이 된다. 즉, 값을 지정하지 않아도 default 값으로 지정된다.



```java
public class UserAnnotationSample {
    @UserAnnotation(number=0)
    public static void main(String [] args){
        UserAnnotationSample sample = new UserAnnotationSample();
    }
    
    @UserAnnotation(number=1)
    public void annotationSample1(){
        
    }
    
    @UserAnnotation(number=2, text="second")
    public void annotationSample2() {
        
    }
    
    @UserAnnotation(number=3, text="third")
    public void annotationSample3() {
        
    }
}
```

이렇게 소괄호 안에 number와 text에 해당하는 어노테이션 값들을 지정해 주면 된다.

단, text는 default를 설정했기 때문에 따로 값을 지정해주지 않아도 컴파일 하는데 전혀 문제가 없당.

추가로 아래 예시처럼 Target을 두 군데 이상 설정할 수 있다.

```java
@Target({ElementType.METHOD, ElementType.TYPE})
```


  </div>
</details>





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

[자바의 신 VOL.2 . 27장 : Serializable과 NIO도 살펴 봅시다.](http://www.yes24.com/Product/Goods/8746364)
  </div>
</details>

<details>
  <summary> Web Server VS  WAS </summary>
  <div markdown="1">
   
   ### Web Server

웹 서버는 크게 소프트웨어와 하드웨어로 구분된다.

1. 하드웨어
   - Web 서버가 설치되어 있는 컴퓨터
2. 소프트웨어
   - 웹 브라우저 클라이언트로부터 HTTP 요청을 받아 정적인 컨텐츠를 제공하는 컴퓨터 프로그램

- Web Server의 기능
  - HTTP프로토콜을 기반으로 하여 클라이언트의 요청을 서비스 하는 기능
  - 요청에 따라 아래 두 가지 기능 중 적절하게 선택하여 수행한다.
  - 기능1)
    - 정적인 컨텐츠 제공
    - WAS를 거치지 않고 바로 자원을 제공
  - 기능2)
    - 동적인 컨텐츠 제공을 위한 요청 전달
    - 클라이언트 요청(Request)을 WAS에 보내고, WAS가 처리한 결과를 클라이언트에게 전달(Response) 한다.
    - 클라이언트는 일반적으로 웹 브라우저를 의미한다.
- Web Server의 대표적인 예는 아파치, Nginx 등등



### WAS

DB조회나 다양한 로직 처리를 요구하는 **동적인 컨텐츠** 를 제공하기 위해서 만들어진 Application Server

- HTTP를 통해 컴퓨터나 장치에 애플리케이션을 수행해주는 미들웨어
- 웹 컨테이너 혹은 서블릿 컨테이너라고 불린다.
- Container란 JSP, Servlet을 실행시킬 수 있는 소프트웨어를 말한다.
- 즉, WAS는 JSP, Servlet 구동 환경을 제공한다.
- 현재는 WAS가 가지고있는 Web Server도 정적인 컨텐츠를 처리하는데 있어서 성능상 큰 차이가 없다.





### Web Server와 WAS

- Web Server가 필요한 이유

  - 클라이언트(웹 브라우저)에 이미지 파일(정적 콘텐츠)를 보내는 과정을 생각해보자.
    - 이미지 파일과 같은 정적인 파일들은 웹 문서가 클라이언트로 보내질 때 함께 가는것이 아니다.
    - 클라이언트는 HTML문서를 받고 그에 맞게 필요한 이미지들을 다시 서버로 요청하면 그때서야 이미지 파일을 받아온다.
    - Web Server를 통해 정적인 파일들을 Application Server까지 가지 않고 앞단에서 빠르게 보내줄 수 있다.
  - 따라서 웹서버에서는 정적인 컨텐츠만 처리하도록 기능을 분배하여 서버의 부담을 줄여준다.

- WAS가 필요한 이유는?

  - 웹 페이지는 정적 컨텐츠와 동적 컨텐츠가 모두 존재한다.
    - 사용자의 요청에 맞게 적절한 동적 컨텐츠를 만들어서 제공해야 한다.
    - 이때 Web Server만을 이용한다면 사용자가 원하는 요청에 대한 결과값을 모두 미리 만들어놓고 서비스를 해야 한다.
    - 하지만 이렇게 하기에는 자원이 절대적으로 부족하다.
  - 따라서 WAS를 통해 요청에 맞는 데이터를 DB에서 가져와서 비즈니스 로직에 맞게 그때 그때 결과를 만들어서 제공함으로써 자원을 효율적으로 관리할 수 있다.

- 웹서버와 WAS가 필요한 이유들을 살펴보았는데, 두 개의 사용 이유는 사실 비슷하다.

  

  ### 그렇다면 WAS만 쓰면 되는거 아닌가??

  - 기능을 분리하여 서버 과부하를 방지한다.

    - WAS는 DB조회나 다양한 로직처리에 바쁘기 때문에 단순한 정적 컨텐츠는 Web Server에서 빠르게 클라이언트에 제공하는 것이 좋다.
    - 또한, WAS기본적으로 동적 컨텐츠를 제공하기 위해 존재하는 서버이다.
    - 만약 정적 콘텐츠로 WAS에게 맡긴다면, 동적컨텐츠 처리가 느려지고 이는 페이지 노출 시간이 길어진다.

  - 물리적으로 분리하여 보안을 강화한다.

    - SSL에 대한 암복호화 처리에 Web Server를 사용

  - 여러대의 WAS를 연결할 수 있다.

    - 예를 들어, 앞 단의 Web Server에서 오류가 발생한 WAS를 이용하지 못하도록 한 후 WAS를 재시작함으로써 사용자는 오류를 느끼지 못하고 이용할 수 있다.

  - 여러 웹 어플리케이션 서비스 가능

    - 예를 들어, 하나의 서버에서 PHP Application과 Java Application을 함께 사용하는 경우

    즉, 자원 이용의 효율성, 장애 극복,배포 및 유지보수성 편의를 위해 WebServer와 Was를분리한다.
  </div>
</details>
<details>
  <summary>Immutable object</summary>
  <div markdown="1">
   
   기초를 다시 한번 다듬고 가자는 의미에서 자바 기본서인 '자바의 신'을 읽다가 아래와 같은 예제 코드를 접하게 되었다.  글을 시작하기 전에 아래 코드를 보고 결과를 추측해보자.

```java
public class ImmutableExam  { 
public static void main(String[] args) {

        List<Integer> first = new ArrayList<>();
        first.add(0);
        first.add(1);
        first.add(2);

        List<Integer> second  = first;

        first.add(3);

        System.out.println(second.toString());
    }
}
```

이 글을 읽고계시는 분들 중에서도 며칠전의 나처럼 결과 값을```[0,1,2]``` 라고 라고 추측하신 분들이 분명히 있을것이다.

 하지만 이 코드의 실행 결과는```[0,1,2,3]``` 이다.😮

위 작성한 예제 코드는 '얕은 복사'로, 참조의 의한 복사가 이루어졌기 때문에 동일한 주소값을 가지는 ```first``` 와 ```second``` 모두 값이 변경되는 것이다.

```[0,1,2]```를 출력하기 위해서는 아래와 같이 코드를 작성하면 된다. 

```java
  public static void main(String[] args) {

        List<Integer> first = new ArrayList<>();
        first.add(0);
        first.add(1);
        first.add(2);
        List<Integer> second = new ArrayList<>();
        for (Integer i : first) {
            second.add(i);
        }
        first.add(3);
        System.out.println(second.toString());
    }
```

------

사실 위의 내용은  5분정도만 투자해도 바로 이해할 수 있는 내용이다. 이 글을 포스팅하는 이유는 위 내용을 공부하면서 알게된 자바의 '불변 객체'에 대해서 기록해두기 위함이다.



### Immutable Object의 정의

자바와 같은 객체 지향 프로그래밍에 있어서 불변객체(Immutable Object)는 생성 후 그 상태를 바꿀 수 없는 객체를 말한다. (위키디피아 불변 객체 정의)

- **불변 객체를 만드는 기본적인 메커니즘은 필드에 ```final``` 키워드를 선언하고, ```Setter```메소드를 구현하지 않는 것이다.**

그렇다면,  단순히 **"변수에 ```final``` 키워드만 붙이면 불변객체가 될 수 있을까? "** 아래 예제 코드를 보면서 이 질문에 대한 답을 생각해보자.

```java
//KI 라는 사람의 정보를 저장하는 객체
public class KIInformation {
    private int age;
    private String hobby;

    public KIInformation(int age, String hobby) {
        this.age =age;
        this.hobby =hobby;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String hobby) {
        this.hobby=obby;
    }
}
```

```java
public class Person {
    private final KIInformation kiInformation;

    public Person(KIInformation information) {
        this.kiInformation = information;
    }
}
```

위의 ```Person```은 **불변 객체** 일까? 

정답은 'No' 다. ```KIInformation``` 라는 참조 변수가 ```final```로 선언되었고, ```setter```메소드 역시 존재하지 않는데도 불변객체가 아닌 이유는 ```Person```객체가 포함하고 있는 참조 변수 ```KIInformation``` 객체가 불변 객체가 아니기 때문이다. 

 단순히 ```final```키워드 선언과 ```setter``` 메소드를 작성하지 않는것으로 불변 객체를 만들수 있는 경우는 객체의 필드가 모두 **원시 타입(primitive type**) 일 경우에만 성립하는 조건이다. 

즉, 참조 타입을 포함하는 객체를 불변으로 만들기 위해서는 참조 타입의 객체 또한 ```final``` 처리와 ```setter```메소드를 작성하지 말아야 한다.

 ```Person``` 객체가 불변 객체가 아닐 경우 발생할 수 있는 문제점과 불편함에 대하여 알아보자.

#### 1. 의도치 않은 사이드 이펙트(side effect) 발생

```java
 public static void main(String[] args) {
        KIInformation information = new KIInformation(26,"programming");
        Person person1 = new Person(information);

        information.setAge(27);
        information.setHobby("soccer");

        Person newPerson = new Person(information);

    }
```

맨 처음에 보았던 예제와 비슷한 내용이다.

```KIInformation``` 객체에 26 이라는 나이와 "programming" 이라는 취미를 부여하고,  ```person1```객체의 인자로 전달했다.

이 후 1년이라는 시간이 지나서 나이도 1살 먹었고, 취미도 바뀌었다. 따라서 변경된 정보로 ```newPerson``` 을 새로 만들기 위해 이전에 사용했던 ```KIInformation``` 객체를 재사용 하려고 한다. 

```setter```메소드를 이용해 27이라는 나이와  "soccer" 라는 변경된 취미로 데이터를 변경하고 ```newPerson```객체의 인자로 전달했다.

앞에서 이미 공부를 했기때문에  ```person1```객체의 값도 아래 결과처럼 우리의 의도와 다르게 데이터가 변경되었을거라고 예상할 수 있다.**즉, 불변 객체로 설계하지 않았기 때문에 사이드 이펙트가 발생한 것이다. **

```
person1 : [age=27, hobby='soccer']
newPerson : [age=27, hobby='soccer']
```





#### 2. 불필요한 방어적 복사(defensive copy) 구현

객체를 불변으로 구현하지 않았기 때문에 ```KIInformation``` 객체처럼 다른 객체에서 재사용 될 가능성이 있는 객체가 변경되는 것을 대비하여 ,객체 내부적으로 새로운 객체를 만들어 위와 같은 문제를 방지하는 코드를 의미한다.

```java
 public KIInformation addAgeAndChangeHobby(int plusAge, String hobby) {
        return new KIInformation(age+plusAge,hobby);
    }
```

이렇게 위의 코드처럼 객체 내부에서 새로운 객체를 만들어 1번과 같은 사이드 이펙트 문제를 해결하는 것이 가능하다.

```java
public static void main(String[] args) {
        KIInformation information = new KIInformation(26,"programming");
        Person person1 = new Person(information);

        Person person2 = new Person(information.addAgeAndChangeHobby(1,"soccer"));
    }
```

```
person1 : [age=26, hobby='programming']
newPerson : [age=27, hobby='soccer']
```



*하지만,* 호출자가 컴포넌트 내부를 수정하지 않으리라 *확신한다면즉,* 애초에 불변 객체로 설계한다면 이러한 방어적 복사를 *생략할 수가* 있다. 또한 방어적 복사에는 *성능 저하가* 따르고 항상 사용할 수 있지도 않다.(같은 패키지에 속하는 등의 이유로)



#### 예제를 불변으로 고쳐보자.

위에서 공부한 내용을 바탕으로 이 예젱서 사용했던 예시 클래스를 불변으로 바꾸는것은 그리 어렵지 않을것이다.

```java
public class KIInformation {
    private final int age;
    private final String hobby;

    public KIInformation(int age, String hobby) {
        this.age =age;
        this.hobby =hobby;
    }
}
```

이렇게, 참조하는 객체까지 불변으로 설계해주자.



#### 결론1 : 클래스를 불변으로 만들기 위한 규칙

1. 객체의 상태를 변경하는 메서드(setter)를 제공하지 않는다.
2. 클래스를 확장(상속)할 수 없도록 한다.
3. 모든 필드를 final로 선언한다.
4. 모든 필드를 private로  선언한다.



#### 결론2: 불변객체를 사용함으로써 얻는 이점

1. 외부에서 임의로 내부의 값을 제어할 수 없다. 따라서 객체의 자율성이 보장되며, 프로그램 내에서 변하지 않는 고정된 부분이 많아짐으로써 프로그램의 안정도를 높일 수 있다.
2. 추가적인 방어적 복사본을 만들 필요가 없다.
3. 사이프 이팩트가 발생할 확률을 줄일 수 있다.
4. 스레드에 안전하기 때문에, 스레드가 동시에 사용해도 절대 훼손되지 않는다.



------

사실 자바 기본서에 있는 내용은 어느 정도 숙지하고 있었다고 생각했는데, 한편으로는 부끄러우면서도 아직 공부가 많이 부족하다는 생각에 더 열심히 하자는 동기부여가 되었다.

이전에 학교에서 동기들과 함께 만든 프로젝트는 그저 기능 동작에만 초점을 두고 구현했었는데 여러가지 성능적 문제를 해결하는 방법에 대해 하나씩 배우는 기분이 들어 뿌듯한 시간이었다.

#### **reference**

------

[이펙티브 자바 : 17장. 변경 가능성을 최소화하라.](http://www.yes24.com/Product/Goods/65551284)
  </div>
</details>


<details>
  <summary>Context Switching 이란?</summary>
  <div markdown="1">
  
  ## Context Switching 이란?

1. 멀티프로세스 환경에서 CPU 가 어떤 하나의 프로세스를 실행하고있는데,

2. 인터럽트 요청에 의해 다음 우선순위의 프로세르를 실행해야 하는 상황이다.
3. 이때, 원래 실행중이던 기존의 프로세스의 상태 또는 레지스터 값(Context)를 저장하고,
4. CPU가 다음 프로세스를 수행하도록 프로세스의 상태 또는 레지스터값을(Context) 변경하는 작업을 말한다.

여기서 ```context```란, ```cpu가 해당 프로세스를 실행하기 위한 프로세스의 정보들``` 이다.

**Context Switching - 인터럽트**

인터럽트는 CPU가 프로그램을 실행하고 있을 때, 실행중인 프로그램 밖에서 예외 상황이 발생하여 처리가 필요한 경우 CPU에게 알려 예외 상황을 처리할 수 있도록 하는 것을 말한다.

- I/O requset (입출력 요청)
- time slice expried (CPU 시간 만료)
- fork a child(자식 프로세스를 만들 때)
- wait for an interrupt(인터럽트 처리를 기다릴 때)

추가로, Context Switching 기술이 있기 떄문에, 여러개의 프로세스가 실행되는 것 처럼 느껴진다.

따라서 COntext Switching이 너무 자주일어나게 된다면 CPU가 본래의 프로세스에서 수행하는 작업 시간은 줄어들고 오히려 context Switching하는 시간이 늘어서 온전한 성능을 내기 어렵다.

+ 멀티쓰레드 이용시, 이러한 context Switching이 자주일어난다.
+ 또한 프로세스 P0에서 P1로 교체할때, P0의 상태를 저장하고 P1의 상태를 가져와야한다. 여기서 딜레이가 발생하여 오버헤드가 발생한다.
+ 스레드는 컨텍스트 스위칭하는 속도가 빠르다. 그 이유는 PCB에 프로세스 것이 아닌 스택 및 간단한 정보만 저장하기 떄문에 가져오고 저장하는 속도가 빠르기 때문이다.
+ **결론적으로** 쓰레드가 많다는 것은 ```context switching``` 이 자주 일어난다는 뜻이고, CPU를 더 많이 사용한다는 뜻이다.
  + 예를들어, 인터넷 작업창이나 프로그램들을 여러개 띄어놓고 실행하면 느려지는것을 생각할 수 있다.
  </div>
</details>





