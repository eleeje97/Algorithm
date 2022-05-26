from davincicode.gameDTO import GameDTO
from davincicode.playerDTO import PlayerDTO
from davincicode.recordDAO import RecordDAO


class GameManager:
    def __init__(self, id):
        self.gameDTO = GameDTO()
        self.player = PlayerDTO(id)
        self.recordDAO = RecordDAO()

    def showCards(self):
        # 현재 카드 상태를 출력함 (숨김상태는 X로 표현)
        pass

    def guess(self):
        # 사용자에게 몇번째 카드를 추측할지, 어떤 숫자로 추측할지 입력받아서 맞는지 확인
        # 맞으면 True, 틀리면 False 리턴
        pass

    def endGame(self):
        # 사용자의 게임결과를 DB에 저장
        pass

    def showRanking(self):
        # 랭킹 조회
        pass