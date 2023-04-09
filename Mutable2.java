public class Mutable2 {
    public static void main(String []args)
    {
       // StringBuffer sb=new StringBuffer();
        //System.out.println(sb.capacity());

       // StringBuilder sb=new StringBuilder();
        //System.out.println(sb.capacity());

       // StringBuffer sb=new StringBuffer();
        //sb.append("abcdefghijklmnop");
        //System.out.println(sb.capacity());//capacity means how many characters kept or add.
        //sb.append("qr");
        //System.out.println(sb.capacity());
        //System.out.println(sb.length());//length means how characters r present.

       // StringBuffer sb2=new StringBuffer("Sachin");
       // System.out.println(sb2);
       // System.out.println(sb2.capacity ());
       // System.out.println(sb2.charAt(1));
        //sb2.setCharAt(1,'A');
        //System.out.println(sb2);

        StringBuilder sb2=new StringBuilder(150);
        sb2.append("java");
        System.out.println(sb2);
        sb2.trimToSize();
        System.out.println(sb2.capacity());
    }
}
