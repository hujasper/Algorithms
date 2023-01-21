def quicksort(array):
    low = 0
    high = len(array)-1

    

    # Function to find the partition position
    def partition(array,low,high):


        # Choose the rightmost element as pivot
        pivot = array[high]

        # Pointer for greater element
        leftPointer = low - 1

        # Traverse through all elements
        # compare each element with pivot
        for rightPointer in range(low, high):
            print('compare ' + str(array[rightPointer]) +'<= '+str(pivot))
            if array[rightPointer] <= pivot:
                
                leftPointer = leftPointer + 1
                if(leftPointer!=rightPointer):
                    (array[leftPointer], array[rightPointer])=(array[rightPointer], array[leftPointer])
                print('compare happend' + str(array))

        #leftPointer needs to be plus 1
        leftPointer = leftPointer + 1


        # Swap the pivot element with
        # e greater element specified by leftpointer
        print(array)
        (array[leftPointer], array[high]) = (array[high], array[leftPointer])

        print(array)
        
        # Return the position from where partition is done
        print('partition was done in index ' + str(leftPointer) + ' which is number ' + str(array[leftPointer]))
        print("-------")
        return leftPointer

    # Function to perform quicksort


    def quick_sort(array, low, high):
        if low < high:

            # Find pivot element such that
            # element smaller than pivot are on the left
            # element greater than pivot are on the right
            pi = partition(array, low, high)

            # Recursive call on the left of pivot
            quick_sort(array, low, pi - 1)

            # Recursive call on the right of pivot
            quick_sort(array, pi + 1, high)
    

    quick_sort(array,low,high)
    return array


