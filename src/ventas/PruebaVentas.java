package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa",30.00);
        var producto2 = new Producto("zapatos",60.00);
        var producto3 = new Producto("guantes",20.00);
        var producto4 = new Producto("chanclas",20.00);
        var producto5 = new Producto("bufanda",20.00);
        var producto6 = new Producto("diadema",10.00);
//        System.out.println(producto1);
//        System.out.println(producto2);
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostarOrden();

        var orden2= new Orden();

        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);

        orden2.mostarOrden();
    }
}
