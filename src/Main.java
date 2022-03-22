public class Main {
    public static void main(String[] args){

        BonusMilesService service = new BonusMilesService();
        int result = service.calculate( 1000, 20);
        System.out.println(" Ваши мили "  + result);




       // System.out.println(" Ваши мили "  + bonus);

    }

}
