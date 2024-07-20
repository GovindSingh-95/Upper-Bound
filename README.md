# Upper-Bound
<h2>Question Statement</h2>
<p>
  To find an index in a sorted array such that arr[index]>target,where target can be any number.
</p>
<h2>Base Cases</h2>
<p>
<br>Consider an Array [10,20,20,30,40,50,60,70].<br>
  <br>With length of 8.<br>
<br>If Target is present in more than one index in the Array then the lowerbound of target in this case is the index greater than maximium  of the indices.Consider target as 20 , here we have 2 indices whose value is 20, and among them the maximum is 2,thus upper bound is 3 (2+1).<br>
<br>If the target is not present in the Array but satisfies the condition of "arr[0]<target" then the upper bound is that nearest number in the Array which is less than target.Consider Target=45, as 45 is not present in the array,but is greater than arr[0] and less than arr[7] and here the closest number present in the array , greater than 45 is 50 ,thus upper bound of 45 is 5.<br>
<br>If the target is less than arr[0],then simply lower bound is taken to be 0.<br>
<br>If the target is more than arr[n-1],then lower bound is taken to be n.<br>
</p>
<h2>Algorithm</h2>
<p>
  <br>Here, as we bascially need to search a particular element.So, we are gonna use Binary Search.<br>
  <br>So,we declare our Binary Search variables of int low=0 and int high=n-1.But,we also need to store the index for upper bound (let 
   that int variable be idx),it can be given any value for initialisation,but initialise it with n.<br>
  <br>Now,use while loop with condition of (low<=high),and declare a int mid=(high-low+low+low)/2.<br>
  <br>Unlike Binary Search conditions,we only have one condition over here.<br>
  <br>if (arr[mid]>target) , then update idx with value of mid and , this condition also confirms that target is greater than 
  arr[mid],thus target is not there in the indices from mid to 0. Thus,also update value of high , low=mid+1;<br>
  <br>else just update low , high=mid-1;<br>
  <br>Thus, the value of idx after this while loop is your upper bound index.<br>
  <br>We can use the Arrays.sort() function to sort the Array , if in case the Entered Array is not in non decreasing order.<br>
</p>
