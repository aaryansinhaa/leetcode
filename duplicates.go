package main

import (
	"fmt"
	"sort"
)
func containsDuplicates(nums []int) bool {
    sort.Ints(nums)
    for i:=0;i<len(nums); i++{
        if i>0{
            if(nums[i-1] == nums[i]){
                return true;
            }
        }
    }
    return false;

}
func main() {
	var nums []int = []int {1,1,2,3,4}
	fmt.Println(containsDuplicates(nums))
}
