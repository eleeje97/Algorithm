class GameDTO:
    def __init__(self):
        # 0~13사이의 숫자 중 랜덤으로 숫자 네 개를 골라 card_list에 정렬하여 저장
        self.card_list = []

        # 카드 공개 여부 (처음에는 모두 숨김 상태)
        self.hidden_card = [True, True, True, True]

