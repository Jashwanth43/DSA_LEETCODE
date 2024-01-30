class CustomStack {
    int arr[];
    int n;
    public CustomStack(int maxSize) {
         arr=new int[maxSize];
        n=maxSize;
    }
    public void push(int x) {
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=x;
                //System.out.println(arr[i]);
                return;
            }
        }
    }
    
    public int pop() {
        int k=-1;
       for(int i=n-1;i>=0;i--){
           if(arr[i]!=0){
               k=arr[i];
               arr[i]=0;
               return k;
           }
       }
        return k;
    }
    
    public void increment(int k, int val) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            count++;
            arr[i]=arr[i]+val;
            //System.out.println(arr[i]);
            if(count==k){
                return;
            }
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */