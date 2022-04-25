## 워들 게임  

###  요구사항 정리  
- [ ] 6x5 격자를 통해서 5글자 단어를 6번 만에 추측한다.
    - [ ] 게임의 기회는 6회 이다.
    - [X] 맞출 수 있는 단어의 길이는 5자이다.
    - [X] 입력받은 단어의 길이는 5자이다.
- [ ] 정답과 답은 words.txt에 존재하는 단어야 한다.
- [ ] 정답은 매일 바뀌며 ((현재 날짜 - 2021년 6월 19일) % 배열의 크기) 번째의 단어이다.
- [ ] 플레이어가 답안을 제출하면 프로그램이 정답과 제출된 단어의 각 알파벳 종류와 위치를 비교해 판별한다.
- [ ] 판별 결과는 흰색의 타일이 세 가지 색(초록색/노란색/회색) 중 하나로 바뀌면서 표현된다. 
  - [X] 소문자와 대문자 구분하지 않는다.
  - [X] 맞는 글자는 초록색, 위치가 틀리면 노란색, 없으면 회색
  - [ ] 두 개의 동일한 문자를 입력하고 그중 하나가 회색으로 표시되면 해당 문자 중 하나만 최종 단어에 나타난다.

### 도메인  
- Answer ( 오늘의 정답 )
- Word ( 입력받은 문자열 )
- Character ( 문자 )
- Characters ( 문자 일급콜렉션 )

### 패키지 구조
- Common
- View
- Controller
- Model