public class AppStart {
    public static void main(String args[]){
        Size size = Size.MEDIUM;
        System.out.println("Name: MEDIUM");
        System.out.println("toString(): '" + size.toString() + "'");
        System.out.println("Ordem: " + size.ordinal());
        System.out.println("Valor minimo: " + size.getMinValue());
        System.out.println("Valor máximo: " + size.getMaxValue());
        System.out.println("Código: '" + size.getCode() + "'");
    }
}
