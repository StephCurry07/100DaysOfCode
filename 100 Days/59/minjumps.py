def min_jumps(arr):
    # array to store the minimum number of jumps required to reach each position
    jumps = [float('inf') for _ in arr]
    # the minimum number of jumps required to reach the first position is always 0
    jumps[0] = 0

    for i in range(len(arr)):
        # check the maximum distance we can reach from our current position
        for j in range(i + 1, min(i + arr[i] + 1, len(arr))):
            # update the minimum number of jumps required to reach position j
            # by incrementing the value by 1
            jumps[j] = min(jumps[j], jumps[i] + 1)

    return jumps[-1]
