def findMedianSortedArrays(nums1,nums2):
    merged_arr = nums1 + nums2
    sorted_arr = sorted(merged_arr)

    length=len(sorted_arr)

    median=0
    if(length%2==0):
        median= ((sorted_arr[(length // 2) - 1] + sorted_arr[length // 2]) / 2)
    else:
        median = (sorted_arr[((length + 1) // 2) - 1])

    return median

print(findMedianSortedArrays([1,2],[3,5]))