import java.awt.font.ImageGraphicAttribute;
import java.util.zip.Inflater;

public class Main {

    public static void main(String[] args) {

        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        applePieRecipe.heatOven();
        applePieRecipe.devideEgg();
        applePieRecipe.mixIngredients();
        applePieRecipe.pealApples();
        applePieRecipe.greaceBowl();
        applePieRecipe.handleDough();
        applePieRecipe.handleAppels();
        applePieRecipe.leftoverDough();
        applePieRecipe.handleLeftoverDough();
        applePieRecipe.finalStep();
        applePieRecipe.printIngredients();



    }

     static class Ingredients{
        private double amount = 0;
        private String unit = "";
        private String name = "";


        public Ingredients(){
            // empty constructor
        }

        public Ingredients(double amount, String unit, String name){
            this.amount = amount;
            this.unit = unit;
            this.name = name;
        }
         public String getName(){
             return this.name;
         }

         public void setName(String name){
             this.name = name;
         }

         public String getUnit(){
             return this.unit;
         }

         public void setUnit(String unit){
             this.unit = unit;
         }


         public double getAmount(){
             return this.amount;
         }

         public void setAmount(double amount){
             this.amount = amount;
         }
    }

     static class ApplePieRecipe{
        Ingredients roomboter = new Ingredients(200, "gram", "ongezouten roomboter");
        Ingredients bastardSuiker = new Ingredients(200, "gram", "witte bastard suiker");
        Ingredients bakmeel = new Ingredients(400, "gram", "zelfrijzend bakmeel");
        Ingredients ei = new Ingredients(1, "stuk(s)", "ei");
        Ingredients vanillesuiker = new Ingredients(8, "gram", "vanillesuiker");
        Ingredients zout = new Ingredients(1, "snuf", "zout");
        Ingredients appels = new Ingredients(1.5, "kilo", "zoetzure appels");
        Ingredients kristalSuiker = new Ingredients(75, "gram", "kristal suiker");
        Ingredients kaneel = new Ingredients(3, "theelepels", "kaneel");
        Ingredients paneermeel = new Ingredients(15, "gram", "paneermeel");

        public void heatOven () {
            System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");

        }

        public void devideEgg() {
            System.out.println("Klop het ei los en verdeel deze in twee delen. " +
                    "De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        }

        public void mixIngredients(){
            System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille");
        }

        public void pealApples() {
            System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        }

        public void greaceBowl () {
            System.out.println("Vet de springvorm in en bestrooi deze met bloem");
        }

        public void handleDough(){
            System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        }

        public void handleAppels(){
            System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        }

        public void leftoverDough(){
            System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        }

        public void handleLeftoverDough(){
            System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        }

        public void finalStep (){
            System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
        }

        public void printIngredients(){
            System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
            System.out.println(bastardSuiker.getAmount() + " " + bastardSuiker.getUnit() + " " + bastardSuiker.getName());
            System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
            System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
            System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
            System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
            System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
            System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
            System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
            System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());


        }

    }


}
