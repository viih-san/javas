public class MonitoramentoPaciente {

    public static void main(String[] args) {

        //dados do paciente 
        double temperatura = 40.0;
        double oxigenaçao = 100;
        double pressao = 12.8; 

        //verifição do paciente 
        if ( temperatura >= 40.0 || oxigenaçao <= 85 || pressao <= 6.4) {
            System.out.println(" ALERTA VERMELHO: Intervenção Imediata ");
        } else if (temperatura >= 38.5 || oxigenaçao <= 88 || pressao <= 9.6) {
            System.out.println(" ALERTA AMARELO: Monitoramento Intensivo ");
        } else if (temperatura >= 37.5 || oxigenaçao <= 90 || pressao <= 10.7) {
            System.out.println(" STATUS VERDE: Paciente estável ");
        } else {
            System.out.println(" Paciente estável ");
        }

    }
}