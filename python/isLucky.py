def isLucky(n):
    string = str(n)
    length = len(string)
    half_length = int(length/2)
    first_half = string[0:half_length].lower()
    second_half = string[half_length:].upper()
    int_first_half = int(first_half)
    int_second_half = int(second_half)

    return int_first_half, int_second_half
    # if sum(int_first_half == int_second_half)
    #     return True


print (isLucky(2332323))
