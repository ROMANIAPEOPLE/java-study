# Java-study  
#### 1. 자바의 정석(남궁성) 책 예제 정리  
#### 2. 자바 각종 메서드 정리


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

