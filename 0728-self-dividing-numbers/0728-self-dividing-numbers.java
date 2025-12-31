class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i<=right ; i++){
            int number = i;
            boolean check = true;
            while(number!=0){
                int remainder = number % 10;
                if(remainder == 0){
                    check = false;
                }
                else if(i%remainder != 0){
                    check = false;
                    break;
                }
                number /= 10;
            }
            if(check){
                list.add(i);
            }
        }
        return list;
    }
}