package Producto;

public class Main {

    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(3);

        productoControlador.agregar("Leche", 9283, 3);
        productoControlador.agregar("Arroz", 8965, 5);
        productoControlador.agregar("Azucar", 4453, 4);

        
        productoControlador.listar();

        System.out.println ( "---------------BUSCAR PRODUCTO POR EL CODIGO-----------" );

          int codigo = 9283 ;

        Producto  encontrado  ;

        encontrado = productoControlador . buscarCodigo ( codigo );

        if ( encontrado != null )
        {
            System.out.println( "codigo encontrado: " + encontrado . getCodigo ()+"---> Producto: "+encontrado.getNombres());

        }
        else {

            System.out.println ( "No se encontro el codigo del:" + codigo );
        }


            

        }
    }






