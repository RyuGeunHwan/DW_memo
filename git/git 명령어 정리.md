## git 사용방법/명령어 git 관련

### SSH 키 생성

    => ssh-keygen -t rsa -C "이메일 입력"
    * 키 생성 경로 C:\Users\사용자이름\.ssh
    .pub파일로 저장

### 저장소 첫 파일 올리는 방법

    git init  (최초 한번만 입력)(폴더를 만들고 init을 입력하면 그 폴더는 깃저장소가 됨)
    git add .
    git config --global user.name"사용자 이름 입력"
    git config --global user.email"이메일 입력"
    (git config --global core.autocrlf true//오류 발생시 입력)
    git remote add origin (파일 올릴 주소 코드)
    git commit -m "나 오늘 공부했어!"
    git push origin master

### 파일 및 내용 다운로드,추가 및 수정

    1. git clone+깃허브 주소  =   깃허브 내용 다운로드
    2. git add .   =   파일 추가
    3. git commit -m '(fix(수정), feat(추가) : 내용)'    =   현재까지 내용 저장
    4. git push origin master       =     깃허브에 업로드

### git에서 많이 사용하는 단축키

    1. git init : git 저장소 생성 / 깃허브에서 다운받지 않고 처음부터 할 것이면 init
    2. git remote <주소> : 저장하여할 곳이 어딘지 알려주는 용도
    3. git clone <깃허브 주소> : github에 있는 파일 다운로드 / 깃허브에서 다운받아서 사용할거면 clone
    4. git add . : 작업한 내용 추가
    ###5. git commit : 실제 변경 내용 확정
    ###6. git push : github에 업로드
    ###7. git pull : github에 업로드된 파일과 동기화

## 알아두면 좋은 git 명령어

```
    1. git log --oneline : commit 히스토리 확인
    2. git reset --hard <commit_id> : 이전 커밋으로 되돌아가기
    3.  강제로 pull 받기 :
        3-1. git fetch --all
        3-2. git reset --hard origin/master
        3-3. git pull origin master

    4. "LF will be replaced by CRLF... " 에러 발생시 조치
        4-1. git config --global core.autocrlf true

    5. 강제로 push 하기 : git push origin +master

    6. git remote -v : 업로드 주소 확인 가능
    ex)origin  https://github.com/RyuGeun/DW_memo.git (fetch)
    origin  https://github.com/RyuGeun/DW_memo.git (push)

    7. 자동pull 막아주는 명령어
    깜빡하고 코딩을 먼저 해버렸을 경우 git 해당 명령어 사용

    git config --global pull.rebase true

    기존pull은 pull하면 자동으로 받아짐.
    자동으로 pull받아지면 작업한 코드에 덮어쓰기가 되어버림.(주의)

    해당 명령어를 사용하게 되면 자동으로 pull되는거 막아줌.(한번만 설정해주면 됨.)
    에러메세지 : 너 pull안받고 작업 먼저 했어. 지금까지 작업한거 commit하고 pull받아!
```

## 유용한 git 명령어

```
1. 자동pull 막아주는 명령어
** git config --global pull.rebase true
    1-1) 깜빡하고 코딩을 먼저 해버렸을 경우 git 해당 명령어 사용
    1-2) 기존pull은 pull하면 자동으로 받아짐.
    1-3) 자동으로 pull받아지면 작업한 코드에 덮어쓰기가 되어버림.(주의)
    1-4) 해당 명령어를 사용하게 되면 자동으로 pull되는거 막아줌.(한번만 설정해주면 됨.)
    1-5) 에러메세지 : 너 pull안받고 작업 먼저 했어. 지금까지 작업한거 commit하고 pull받아!
```

## 깃허브 명령어 정리

```
깃 최초 설치 시 입력해야하는 명령어

1. SSH 키 생성
   => ssh-keygen -t rsa -C "이메일 입력"

   - 키 생성 경로 C:\Users\사용자이름\.ssh
     .pub파일로 저장

2. github 사용자이름, 이메일 등록
    => git config --global user.name "사용자 이름 입력"
    => git config --global user.email "이메일 입력"

깃 자주 사용하는 명령어

1. git init : git 저장소 생성
2. git clone : github에 있는 파일 다운로드
3. *git add : 작업한 내용 추가
4. *git commit : 실제 변경 내용 확정
5. *git push : github에 업로드
6. *git pull : github에 업로드된 파일과 동기화


알아두면 좋은 깃 명령어

1. git log --oneline : commit 히스토리 확인
2. git reset --hard <commit_id> : 이전 커밋으로 되돌아가기
3.  강제로 pull 받기 :
    3-1. git fetch --all
    3-2. git reset --hard origin/master
    3-3. git pull origin master

4. "LF will be replaced by CRLF... " 에러 발생시 조치
    4-1. git config --global core.autocrlf true

5. 강제로 push 하기 : git push origin +master


저도 라떼 추가요
라떼 말고 아아 추가요
```
