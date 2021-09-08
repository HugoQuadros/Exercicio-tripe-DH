public class Tripe {

    private boolean dobrado;
    private float alturaMinima;
    private float alturaMaxima;
    private float alturaAtual;

    //getters e setters
    public boolean isDobrado() {
        return dobrado;
    }
    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }
    public float getAlturaMinima() {
        return alturaMinima;
    }
    public void setAlturaMinima(float alturaMinima) {
        this.alturaMinima = alturaMinima;
    }
    public float getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public float getAlturaAtual() {
        return alturaAtual;
    }
    public void setAlturaAtual(float alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    //construtor
    public Tripe(boolean dobrado, float alturaMinima, float alturaMaxima, float alturaAtual){
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    //métodos
    public void definirAltura(int novaAltura){
        this.setAlturaAtual(novaAltura);
    }

    public void dobrar(){
        this.setDobrado(true);
    }

    public void desdobrar(){
        this.setDobrado(false);
    }

    public void guardar(){
        this.setDobrado(true);
        this.setAlturaAtual(getAlturaMinima());
    }

    public boolean prontoParaGuardar(){
        if(isDobrado() && getAlturaAtual()==getAlturaMinima()){
            System.out.println("Seu tripé está pronto para ser guardado");
               return true;
        }
        else{
            return false;
        }
    }

    public void usar(){
        this.setDobrado(false);
        this.setAlturaAtual(getAlturaMaxima()*0.6f);
    }

    public boolean prontoParaUsar(){
        if(!isDobrado() && getAlturaAtual()>getAlturaMaxima()*0.5){
            System.out.println("Seu tripé está pronto para ser usado");
            return true;
        }
        else{
            return false;
        }
    }
}
