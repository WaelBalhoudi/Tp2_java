public class Test {
    public static void main(String[] args) {
        Livere l=new Livere("bonjour","wael",123,5);
        l.toSring();
        Livere l2=new Livere("bonjour1","mourad",1232,50);
        l2.toSring();
        l.setAuteur("wael balhoudi");
        System.out.println( l.getAuteur());
        System.out.println("le nombre de livre "+Livere.cte);
    }

}
