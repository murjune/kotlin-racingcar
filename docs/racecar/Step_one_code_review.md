# 수정 목록
- [x] : ktFormat pre-push hook 설정
- [x] : 자동차 경주 패키징하기

## domain 쪽

- [x] : 이름 사이의 띄어쓰기를 제거
- [x] : RacingCar move 방식 동적으로 세팅할 수 있도록 수정
- [x] : RacingCar 생성자에 position 을 받을 수 있도록 수정
- [x] : RacingCars class 로 변경
- [x] : 거리 비교하는 로직 Comparable 이 아닌 다른 방식으로 수정

## controller

- [x] : view 를 생성자에서 주입 받는 형태로 수정

## View

- [x] : class 로 변경
- [x] : 기존 Domain 에서 처리한 UI 로직(format) UI로 옮기기
- [x] : InputView, OutputView -> KernelRaceCarGameInputView, KernelRaceCarGameOutputView 로 변경 (Terminal 용 view)