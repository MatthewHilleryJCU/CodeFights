def sortSetAscending(sequence):
    return sequence == sorted(sequence) and len(sequence) == len(set(sequence))

def almostIncreasingSequence(sequence):
    for x in range(len(sequence) - 1):
        if not sortSetAscending(sequence[x:x+2]):
            sansA, sansB = list(sequence), list(sequence)
            del sansA[x]
            del sansB[x+1]
            return sortSetAscending(sansA) or sortSetAscending(sansB)
    return True