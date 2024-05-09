package smartv;
public class Principal {
    public static void main(String[] args) {
        Smartv tv = new Smartv();
        tv.setLigada(true);
        System.out.println(tv.getLigada());
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
        
        System.out.println(tv.getCanal());
        tv.descerCanal();
        System.out.println(tv.getCanal());
        
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.subirCanal();
        
        System.out.println(tv.getLigada());
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
        
    }
}
