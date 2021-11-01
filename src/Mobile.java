public class Mobile
{
    String color,brand;
    int camera,price;

    public Mobile(String brand, String color, int camera, int price)
    {
        this.brand=brand;
        this.color=color;
        this.camera=camera;
        this.price=price;
    }
    public static void main(String[] args)
    {
        Mobile Hari= new Mobile("iPhone 13","Pacific blue",12,80000);
        Mobile Haran= new Mobile("Xiaomi","Black",108,50000);
        Mobile Rahul= new Mobile("Samsung S21","Red",108,90000);


        System.out.println(Hari.brand+" color: "+Hari.color+" Megapixel: "+Hari.camera+" Cost: "+Hari.price);
        System.out.println(Haran.brand+" Color:  "+Haran.color+" Megapixel: "+Haran.camera+" Cost:  "+Haran.price);
        System.out.println(Rahul.brand+" Color: "+Rahul.color+" Megapixel: "+Rahul.camera+" Cost: "+Rahul.price);

    }

}
