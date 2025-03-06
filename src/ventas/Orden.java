package ventas;

public class Orden{
        private final int idOrden;
        private Producto[] productos;
        private int contadorProductos;
        private static final int MAX_PRODUCTOS = 10;
        private static int contadorOrdenes;

        public Orden(){
            this.idOrden = ++Orden.contadorOrdenes;
            this.productos = new Producto[Orden.MAX_PRODUCTOS];
        }

        public void agregarProducto(Producto producto){
            if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++]= producto;
        }else{
                System.out.println("Se ha superado el max."+ Orden.MAX_PRODUCTOS);
            }
        }

        public double calcularTotal(){
               double precioTotal = 0;
               for( var i = 0; i<contadorProductos;i++){
                   var producto = this.productos[i];
                   precioTotal+=producto.getPrecio();
               }
               return  precioTotal;
        }

        public  void mostarOrden(){
            System.out.println("Id orden: "+this.idOrden);
            var totalOrden= this.calcularTotal();
            System.out.println("\t totla de la orden: $"+totalOrden);
            System.out.println("\tProductos de la Orden: ");
            for(var i= 0; i<this.contadorProductos;i++){
                System.out.println("\t\t" +this.productos[i]);
            }

        }

}

