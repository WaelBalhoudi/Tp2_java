public class Liver {
    int id=0;
    float prix;
    String name,prenon,title;
    public Liver(int id, String name, String prenon, String title) {
        this.id ++;
        this.name = name;
        this.prenon = prenon;
        this.title = title;

    }
    public void tostring (){
      System.out.println("Le title de liver: "+this.title);
        System.out.println("l'auter est:"+name+" "+prenon+);
        System.out.println("prix est: "+prix);

    }
}
