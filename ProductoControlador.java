package Producto;


public class ProductoControlador {

    private Producto producto[];

    private int contador;

  

    public ProductoControlador(int size)
    {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void agregar(String nombres, int codigo, int precio)
    {
        this.producto[this.contador] = new Producto(nombres, codigo, precio);

        this.contador++;
    }

    public  Producto  buscarCodigo ( int  codigo )
    {
        int i  ; 

        for (i = 0 ; i < this . contador ; i ++)
        {
            if ( this . producto [ i ]. getCodigo () == ( codigo ))
            {
                break ;
            }
        }

        if ( i == this . contador )
        {
            return null ;

        } 
        else{

            return this.producto [ i ];
        }
    }
   

    public void listar()
    {
        System.out.println("----------Productos---------- ");

        for(Producto p :producto){

            
            System.out.println(p.getNombres());
         }
       }
}

    
       