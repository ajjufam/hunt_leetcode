const findMedianSortedArrays = (nums1, nums2) => {
    const mergedArr = (nums1.concat(nums2));
    const sorted = mergedArr.sort((a, b) => a - b)
    const len = sorted.length;

    let median;
    if (len % 2 == 0) {
        // consider len is even = 10 [(10/2)-1])+[10/2]) / 2
        median = ((sorted[(len / 2) - 1] + sorted[len / 2]) / 2)
    } else {
        // consider len is odd = 9 ( [((9+1)/2)-1] ) = ans
        median = (sorted[((len + 1) / 2) - 1])
    }
    return median;
}

console.log(findMedianSortedArrays([1, 2], [3,4]));