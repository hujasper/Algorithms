def SelectionSort(args):
    for i in range(len(args)):
        minindex = i
        for j in range(i+1,len(args)):
            if(args[minindex]>args[j]):
                minindex = j
        
        temp = args[minindex]
        args[minindex] = args[i]
        args[i] = temp
    return args
