from abc import ABC,abstractmethod
class Entertainment:
    def __init__(self,price):
        self.price=price
    @abstractmethod
    def watch(self):
        pass
