class Person:
    def __init__(self, firstName, lastName, idNumber):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber

    def printPerson(self):
        print("Name:", self.lastName + ",", self.firstName)
        print("ID:", self.idNumber)


class Student(Person):
    Scores = []
    Grade = ''

    def __init__(self, FirstName, LastName, IdNumber, Scores):
        Person.__init__(self, FirstName, LastName, IdNumber)
        self.Scores = Scores

    def calculate(self):
        avg = 0
        Grade = ''

        for score in self.Scores:
            avg += score

        avg /= len(self.Scores)

        if avg <= 100 and avg >= 90:
            self.Grade = 'O'
        elif avg < 90 and avg >= 80:
            self.Grade = 'E'
        elif avg < 80 and avg >= 70:
            self.Grade = 'A'
        elif avg < 70 and avg >= 55:
            self.Grade = 'P'
        elif avg < 55 and avg >= 40:
            self.Grade = 'D'
        else:
            self.Grade = 'T'

        return self.Grade


line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input())  # not needed for Python
scores = list(map(int, input().split()))
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())
