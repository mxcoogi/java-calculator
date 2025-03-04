# Java Calculator 프로젝트

## 프로젝트 개요

#### **프로젝트 명**: 계산기 프로젝트
#### **프로젝트 목적**
- 기본적인 사칙연산 기능을 수행하는 계산기를 개발
- 절차적 프로그래밍을 이해한다
- 객체지향 프로그래밍을 이해한다
- OOP 기법을 사용하여 프로그램의 유지 보수성을 높인다

#### **사용언어**: 자바

---

## 요구사항
####  절차적 프로그래밍 (LV1) 객체지향 프로그래밍(LV2)

### 1. 필수 기능
- **0 이상의 정수를 입력받기** 👌
  - 정수는 한번에 한개씩 입력 받는다
- **사칙연산 기호 입력받기**  👌
  (예: `+`, `-`, `*`, `/`)
- **콘솔 기반 인터페이스**  👌
  사용자와의 상호작용을 콘솔에서 진행
- **예외처리**  👌
  잘못된 입력이나 계산 오류를 처리 (예: 0으로 나누기)
- **종료 버튼**  👌
  계산기를 종료하는 기능
  - 어디서든 종료 가능하게 👌
  - 계산이 끝난 후 종료 가능하게👌

### 2. 도전 기능
- **Enum, Generic, Lambda, Stream을 활용한 계산기**  
  최신 자바 기술을 사용하여 코드의 품질을 높이고, 유지보수를 용이하게 함
- **정수범위(int)를 넘어선 실수범위(double) 계산**  
  실수 계산을 지원하여 더 정확한 결과 제공
- **괄호 사용, 제곱근, 제곱 등 여러 연산 추가하기**  
  고급 수학 연산을 지원하여 사용자가 더 복잡한 계산을 할 수 있도록 함

---

## 시스템 설계

### 1. **UI 설계**
- **콘솔 기반**  
  사용자가 입력하는 숫자와 연산자를 처리하고 결과를 콘솔에 출력합니다.

### 2. **클래스 구조**

- `App.java` : 메인 클래스
- 
- `Calculator.java`: 계산기의 핵심 로직을 담당
    - 연산 기능 수행 (사칙연산, 실수 계산)
    - 예외 처리
 
- `ConsoleIO.java` : 사용자 입력을 처리
    - inputNum : 정수입력 처리
    - inputOp : 연산자 입력 처리
- `Operator.java` : 연산처리 클래스

- `Box.java` : 숫자형 클래스를 담는 제너릭 클래스
---

## 개발 일정

| **단계**  | **내용**                                   
|---------|------------------------------------------
| **1단계** | 요구 사항 분석 및 설계 👌
| **2단계** |  LV1 필수기능 구현 👌
| **3단계** |  LV2 필수기능 구현 👌
| **4단계** | 예외 처리 및 유효성 검사 👌                           
| **5단계** | 도전 기능 구현 (Enum, Generic, Lambda, Stream) 👌
| **6단계** | 고급 연산 추가 (괄호, 제곱근, 제곱 등) 

---

## 기술적 난이도 및 리스크

### 기술적 난이도
- Java의 **Lambda**, **Stream**, **Generic**, **Enum** 등 고급 기능을 활용하는 데 익숙하지 않다면 어려울 수 있음.
- 계산기 연산을 처리하는 핵심 로직과 예외 처리 구현 시 복잡한 로직이 필요할 수 있음.

### 리스크
- 사용자 입력 처리에서 발생할 수 있는 다양한 예외를 제대로 처리하지 않으면 프로그램이 예기치 않게 종료될 수 있음.
- 실수 범위(double)에 대한 계산을 정확히 처리하기 어려울 수 있음. 
- 여러 연산을 추가하면서 프로그램의 복잡성이 증가할 수 있음.

---

## Commit Message Convention
Udacity 의 Commit Convention

### 커밋 메세지 형식
```
type: Subject

body

footer
```
#### 메시지 type은 아래와 같이 분류된다. 아래와 같이 소문자로 작성한다.
- feat : 새로운 기능 추가
- fix : 버그 수정
- docs : 문서 내용 변경
- style : 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우 등
- refactor : 코드 리팩토링
- test : 테스트 코드 작성
- chore : 빌드 수정, 패키지 매니저 설정, 운영 코드 변경이 없는 경우 등

#### Subject (제목)
- Subject(제목)은 최대 50글자가 넘지 않고, 마침표와 특수기호는 사용하지 않는다.
- 영문 표기 시, 첫글자는 대문자로 표기하며 과거시제를 사용하지 않는다. 그리고 간결하고 요점만 서술해야 한다.
```
Added (X) → Add (O)
```
___
#### Body (본문)
- Body (본문)은 최대한 상세히 적고, 무엇을 왜 진행했는 지 설명해야 한다. 만약 한 줄이 72자가 넘어가면 다음 문단으로 나눠 작성하도록 한다.
___
#### Footer (꼬리말)
- Footer (꼬리말)은 이슈 트래커의 ID를 작성한다.
- 어떤 이슈와 관련된 커밋인지(Resolves), 그 외 참고할 사항이 있는지(See also)로 작성하면 좋다.
___
#### example
```
feat: Summarize changes in around 50 characters or less

More detailed explanatory text, if necessary. Wrap it to about 72
characters or so. In some contexts, the first line is treated as the
subject of the commit and the rest of the text as the body. The
blank line separating the summary from the body is critical (unless
you omit the body entirely); various tools like `log`, `shortlog`
and `rebase` can get confused if you run the two together.

Explain the problem that this commit is solving. Focus on why you
are making this change as opposed to how (the code explains that).
Are there side effects or other unintuitive consequences of this
change? Here's the place to explain them.

Further paragraphs come after blank lines.

 - Bullet points are okay, too

 - Typically a hyphen or asterisk is used for the bullet, preceded
   by a single space, with blank lines in between, but conventions
   vary here

If you use an issue tracker, put references to them at the bottom,
like this:

Resolves: #123
See also: #456, #789
```