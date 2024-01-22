def bestBubbleSort(arr, order):
  num= len(arr)
  swapCount = 0
  
  
  for i in range(num):
    for j in range(0, num-i-1):
      if(order == 'asc' and arr[j] > arr[j+1]) or (order == 'desc' and arr[j] < arr[j+1]):
        arr[j], arr[j+1] = arr[j+1], arr[j]
        swapCount = swapCount+1
  return swapCount


def minSwapArray(arr):
  asc_swap = bestBubbleSort(arr.copy(), 'asc')
  desc_swap = bestBubbleSort(arr.copy(), 'desc')
  
  return min(asc_swap, desc_swap)


#testing 
n = int(input())
arr = list(map(int, input().split()))

result = minSwapArray(arr)
print(result, end="")