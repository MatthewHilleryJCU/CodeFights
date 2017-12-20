def adjacentElementsProduct(arr):
    return max([arr[i] * arr[i+1] for i in range(len(arr)-1)])
