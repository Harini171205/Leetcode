class Solution(object):
    def minimumOperations(self, nums):
        temp=0
        l=len(nums)
        for i in nums:
            if(i%3!=0):
                t=i-1
                if(t%3==0):
                    i=t
                    temp=temp+1
                t=i+1
                if(t%3==0):
                    i=t
                    temp=temp+1
        return temp