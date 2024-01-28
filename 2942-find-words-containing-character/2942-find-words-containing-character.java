class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x))){
                a.add(i);
            }
        }
        
        return a;
    }
}