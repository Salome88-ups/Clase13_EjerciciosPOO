public class Telefono {

    // Atributos privados
    private String marca;
    private String modelo;
    private double precio;


    // Constructor
    public Telefono(String marca, String modelo, double precio) {

        this.marca = marca;
        this.modelo = modelo;

        if(precio >= 0){
            this.precio = precio;
        }else{
            this.precio = 0;
        }
    }


    // GETTERS

    public String getMarca(){
        return marca;
    }


    public String getModelo(){
        return modelo;
    }


    public double getPrecio(){
        return precio;
    }



    // SETTERS

    public void setMarca(String marca){
        this.marca = marca;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public void setPrecio(double precio){

        if(precio >= 0){
            this.precio = precio;
        }else{
            System.out.println("Error: El precio no puede ser negativo");
        }

    }



    // Mostrar información

    public void mostrarInfo(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("---------------------");

    }

}