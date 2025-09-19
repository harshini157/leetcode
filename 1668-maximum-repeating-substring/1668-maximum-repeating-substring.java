class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb=new StringBuilder();
        int k=0;
        while(true){
            sb.append(word);
            if(sequence.contains(sb)){
                k++;
            }
            else 
            break;
        }
        return k;
        }
    }
