# Strategy Pattern

> 행동 패턴 중 하나로, 행위를 클래스로 캡슐화 한 후, 동적으로 행위를 바꿀 수 있는 패턴

1. 구성 요소

   1. Context

      : 전략 (Strategy) 이 실행되는 부분

   2. Strategy
      : 특정한 목표를 수행하기 위한 행동 계획 (이동, 공격, 연락, 투자)

2. 코드 설명
     로봇의 움직임, 공격법 등을 하나의 인터페이스로 선언 후, 그 인터페이스를 상속하는 클래스를 로봇에 넣어줌으로써 로봇의 특성을 결정

   

3. 예시

   ### **<u>Java의 Comparator</u>**

   * Context : sort
   * Strategy : Comparator

   Arrays.sort(a : T[ ] , c : Comparator < ? super T> )

   에서 Comparator에 해당하는 부분을 필요에 따라UserDefinedComparator로 교체함.

---


코드 참고 : https://gmlwjd9405.github.io/2018/07/06/strategy-pattern.html