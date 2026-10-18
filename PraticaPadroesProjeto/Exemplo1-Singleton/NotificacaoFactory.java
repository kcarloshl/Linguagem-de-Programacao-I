public class NotificacaoFactory {
    
    public static void main(String[] args) {
        
    }
}

interface Notificacao {

    void enviar();
}

class EmailNotificacao implements Notificacao {

    @Override
    public void enviar () {
        System.out.println();
    }
}