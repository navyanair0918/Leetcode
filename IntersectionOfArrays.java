import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int i,j,l;
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int k=0;
        for(i=0;i<nums1.length;i++)
        {
            for(j=0;j<nums2.length;j++) 
            {
                if(nums1[i]==nums2[j])
                {
                    for(l=0;l<k;l++)
                    {
                        if(nums1[i]==ans[l])
                        {
                            break;
                        }                                                                                                                                                                                                               
                    }
                    if(l==k)
                    {
                        ans[k] = nums1[i];
                        k++;
                    }
                    break;
                }
            }
        }
        int[] result = new int[k];
        for (i = 0; i < k; i++) 
        {
            result[i] = ans[i];
        }
          return result;          
    }
        
}
