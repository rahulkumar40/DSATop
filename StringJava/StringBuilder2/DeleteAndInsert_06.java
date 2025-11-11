package StringBuilder2;

public class DeleteAndInsert_06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        int n = sb.length();
        System.out.println("lenght of sb : "+n);
        sb.deleteCharAt(3);                 // to delete a particular index 
        int k = sb.length(); 
        System.out.println(sb);
        System.out.println("length after deletion : "+k);

        System.out.println(sb.append("cxyz"));
        System.out.println(sb);                         // abcdfxyz , cefx (2,5)
        sb.delete(2, 6);                //delete characters from 2 to 5 
        System.out.println(sb);                 // abyz -> abgyz 

        sb.insert(2, 'g');
        System.out.println(sb);

    }
}
