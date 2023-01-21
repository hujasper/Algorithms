def quicksort(array):
    low = 0
    high = len(array)-1

    

    # Function to find the partition position
    def partition(array,low,high):
        
        #we could pivot anywhere, lets just do the highest point 
        pivot = array[high]

        lp = low -1

        for rp in range(low,high):
            if(array[rp]<=pivot):
                #increment
                lp = lp +1
                #Swap
                (array[lp],array[rp]) = (array[rp],array[lp])

        lp = lp +1
        
        (array[lp],array[high]) = (array[high],array[lp])

        return lp






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