int cmp(int *a, int *b){
    return (*a - *b);
}
bool containsDuplicate(int* nums, int numsSize) {
    if(numsSize==1)
        return false;
    qsort(nums, numsSize, sizeof(int), cmp);
    for(int i=0;i<numsSize;i++){
        if (!(nums[i] ^ nums[i+1]))
            return true;
    }
    return false;
}
