import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        System.out.println("Bienvenido al sistema de gestión de productos");
        System.out.println("Ingrese el número de filas para la matriz de productos:");
                int filas = sc.nextInt();
                System.out.println("Ingrese el número de columnas para la matriz de productos;");
                int columnas = sc.nextInt();
                sc.nextLine();
                producto[][] p = new producto[filas][columnas];
        boolean continuar = true;
        while(continuar){
        System.out.println("Escoja la acción que desea realizar:");
        System.out.println("1. Ingresar productos");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar producto por nombre");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
                
                p = m.ingresarProductos(p, sc);
                break;
                case 2:
                    m.mostrarProductos(p);
                    break;
                    case 3:
                        System.out.println("Ingrese el nombre del producto:");
                        String nombre = sc.nextLine();
                        String resultado = m.buscaProducto(p, nombre);
                        System.out.println(resultado);
                        break;
                        case 4:
                            continuar = false;
                            System.out.println("Saliendo del sistema...");
                            break;
                            default:
                                System.out.println("Opción inválida, por favor ingrese una opción válida.");

        }    
    }
        // Aquí puedes agregar más lógica para trabajar con los productos ingresados
    }
}
