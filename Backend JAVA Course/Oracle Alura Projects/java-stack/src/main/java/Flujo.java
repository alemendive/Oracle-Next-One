public class Flujo {

        public static void main(String[] args) {
            System.out.println("Inicio del main");
            try{
                metodo1();
            } catch(MiException ex) {
                String msg = ex.getMessage();
                System.out.println("Exception " + msg);
                ex.printStackTrace();
            }

            System.out.println("Fin del main");
        }

        private static void metodo1() throws MiException {
            System.out.println("Inicio del metodo1");
            metodo2();
            System.out.println("Fin del metodo1");
        }

        private static void metodo2() throws MiException{
            System.out.println("Inicio del metodo 2");
            throw new MiException("dio error");

        }
    }

