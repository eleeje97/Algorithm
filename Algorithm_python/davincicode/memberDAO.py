class MemberDAO:
    def __init__(self):
        self.conn = None

    def connect(self):
        # DB connect
        pass

    def disconnect(self):
        # DB disconnect
        pass

    def insertMember(self, id, pw):
        # DB에 새로운 멤버를 추가 (insert)
        pass

    def updateMember(self, id, pw):
        # 해당 id를 가진 멤버의 비밀번호 변경 -> 할지말지?
        pass

    def deleteMember(self, id):
        # 해당 id를 가진 멤버 삭제 -> 할지말지?
        pass

    def selectMember(self, id):
        # 해당 id를 가진 멤버 조회
        pass

    def selectMembers(self):
        # 모든 멤버 조회
        pass
