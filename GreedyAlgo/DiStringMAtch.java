public class DiStringMAtch {
    public static void main(String[] args){
        String s="IDID";
        int result[]=diStringMatch(s);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
    
    public static int[] diStringMatch(String s) {
        int len=s.length();
        int[] arr=new int[len+1];
        int start=0;
        int last=s.length();
        for(int i=0;i<arr.length-1;i++){
            if(s.charAt(i)=='I'){
                arr[i]=start;
                start++;
            }
            else{
                arr[i]=last;
                last--;
            }
        }
        arr[arr.length-1]=start;
        return arr;
        
    }
}
    

