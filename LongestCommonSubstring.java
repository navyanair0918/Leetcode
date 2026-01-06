class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        char[] pre; 
        int i,j,k;
        if(strs.length==0)
        {
            return "";
        }
        else 
        {
            pre = strs[0].toCharArray();
            for(i=0;i<strs.length;i++)
            {
               char[] a = pre;
               char[] b = strs[i].toCharArray();

               int Minlen = Math.min(a.length,b.length);
               k=0;
               while(k < Minlen && a[k]==b[k])
               {
                k++;
               } 

               pre = new char[k]; //every time new prefix is stored

               for(j=0;j<k;j++)
               {
                 pre[j]=a[j];
               }

               if(k==0)
               {
                return "";
               }
            }
        }
        return new String(pre);
    }
}
