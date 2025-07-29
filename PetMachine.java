    public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;



    public void takerAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater() {
        if (water == 38){
            System.out.println("A capacidade da água da maquina está no máximo");
            return;
        }

        water += 2;
    }
    public void addShampoo() {
        if (shampoo == 10){
            System.out.println("A capacidade da shampoo da maquina está no máximo");
            return;
        }

        shampoo += 2;
    }
    // aqui a baixo na parte do shampoo e água foi usado alt+insert, indo em Getter
    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }
    //criou essa parte acima

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

        if (!this.clean){
            System.out.println("A maquina está suja para colocar o pet é necessário limpá-la ");
            return;
        }
        if  (!hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na maquina nesse momento");
            return;
        }

    }

    public void  removePet(){

        if (this.pet == null){
            System.out.println("Nenhum pet está na máquina!");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
        this.pet = null;

    }
//        this.clean = this.pet.isClean();
//        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
//        this.pet = null;
//    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }


}
