from davincicode.memberDAO import MemberDAO


class MemberManager:
    def __init__(self):
        self.memberDAO = MemberDAO()

    def login(self):
        # id와 pw를 입력받아 회원임을 확인한 후, 맞으면 id, 틀리면 None 리턴
        pass

    def signup(self):
        # id와 pw를 입력받아 DB에 저장
        pass
