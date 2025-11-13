
public class SearchInString {
    public static void main(String[] args) {
        String str = "iwillwin";
        System.out.println(search(str, 'n'));
        System.out.println(search(str, 'm'));
    }

    static int search(String str, int target){
        int n = str.length();

        if(n == 0){
            return -1;
        }

        for(int i=0; i<n; i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

}

// str.toCharArray() : convert string into char array
//  String name = "Ashutosh";
        // System.out.println(Arrays.toString(new int[]{1, 2, 3}));
        // System.out.println(Arrays.toString(name.toCharArray()));