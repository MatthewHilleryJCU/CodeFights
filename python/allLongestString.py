def allLongestStrings(inputArray):
    answer = []
    longest = len(max(inputArray, key=len))
    for i in inputArray:
        if longest == len(i):
            answer.append(i)
    return answer


print(allLongestStrings(["aba", "a", "ad", "vcd", "aba"]))
