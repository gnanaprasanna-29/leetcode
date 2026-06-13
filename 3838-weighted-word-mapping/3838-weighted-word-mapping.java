class Solution{
    public String mapWordWeights(String[] x,int[] y){
        StringBuilder b=new StringBuilder();
        for(String v:x){
        int s=0;
            for(char d:v.toCharArray())
             s+=y[d-'a'];            
            b.append((char)('z'-(s%26)));
        }
return b.toString();
    }
}
