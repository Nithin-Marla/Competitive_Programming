class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> batta=new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            batta.add(arr[i]);
        }
        return batta;
    }
}