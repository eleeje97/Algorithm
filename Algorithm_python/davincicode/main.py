from davincicode.gameManager import GameManager
from davincicode.memberManager import MemberManager


class Game:
    def __init__(self):
        self.gameMGR = None
        self.memberMGR = MemberManager()

    def run(self):
        option = int(input('=========== 다빈치 코드 ===========\n'
                           '1: 로그인 2: 회원가입\n'
                           '번호를 선택하세요 >> '))
        if option == 1:
            id = self.memberMGR.login()
            if id is None:
                print('로그인 실패! 게임을 종료합니다.')
            else:
                self.gameMGR = GameManager(id)
                print('로그인 성공! 게임을 시작합니다.')
                self.startGame()
        elif option == 2:
            id = self.memberMGR.signup()
            self.gameMGR = GameManager(id)
            print('회원가입 완료! 게임을 시작합니다.')
            self.startGame()
        else:
            print('게임을 종료합니다.')

    def startGame(self):
        # 게임 진행
        while self.gameMGR.player.life > 0:
            self.gameMGR.showCards()
            if self.gameMGR.guess():
                # 추측이 맞았을 경우
                pass
            else:
                # 추측이 틀린 경우
                pass

        # 게임 결과
        life = self.gameMGR.player.life
        if life > 0:
            # 게임 점수 계산
            pass
        else:
            # 게임 오버
            pass

        self.gameMGR.endGame()

        # 랭킹 출력
        self.gameMGR.showRanking()


Game().run()
