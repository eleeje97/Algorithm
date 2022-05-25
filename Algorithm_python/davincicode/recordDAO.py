class RecordDAO:
    def __init__(self):
        self.conn = None

    def connect(self):
        # DB connect
        pass

    def disconnect(self):
        # DB disconnect
        pass

    def insertRecord(self, id, score):
        # DB에 게임기록 저장 (insert)
        pass

    def selectRecords(self, id):
        # 해당 id의 게임기록 조회
        pass

    def selectRanking(self):
        # TOP10 랭킹 조회
        pass
