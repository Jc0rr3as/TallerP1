import java.util.Scanner;

public class metodos {
    public producto[][] ingresarProductos(producto[][] productos, Scanner sc){
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                System.out.println("Ingrese el nombre del producto en la posición [" + i + "][" + j + "]:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto en la posición [" + i + "][" + j + "]:");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese la cantidad del producto en la posición [" + i + "][" + j + "]:");
                int cantidad = Integer.parseInt(sc.nextLine());
                productos[i][j] = new producto(nombre, precio, cantidad);
            }
        }
        return productos;
    }
    public void mostrarProductos(producto[][] productos){
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                System.out.println("Producto: " + productos[i][j].getNombre());
                System.out.println("Precio: " + productos[i][j].getPrecio());
                System.out.println("Cantidad: " + productos[i][j].getCantidad());
                System.out.println("--------------------");
            }
        }
    }
    public String buscaProducto(producto[][] productos, String nombre){
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length; j++) {
                if (productos[i][j].getNombre().equalsIgnoreCase(nombre)){
                    return "Producto encontrado en la posición [" + i + "][" + j + "]";
                }
            }
        }
        return "Producto no encontrado";
    }
}
