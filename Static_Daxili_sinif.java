package AbstracSinif.Static_Daxili_Sinifler_Static_Inner_Class;

public class Static_Daxili_sinif {
    public static void main(String[] args) {
        CerviceSinifi cerviceSinifi = new CerviceSinifi();
        cerviceSinifi.sadeDeyisken = 7;
        cerviceSinifi.method();
        CerviceSinifi.staticDeyisken = 10;
        CerviceSinifi.staticmethod();

        CerviceSinifi.IcSinif icSinif = new CerviceSinifi.IcSinif();
        icSinif.IcadeDeyisken= 3;
        icSinif.Icmethod();
        CerviceSinifi.IcSinif.Icstaticmethod();
        CerviceSinifi.IcSinif.IcstaticDeyisken = 100;


    }
}
