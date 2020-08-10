package br.com.cursoudemy.appium.enuns;

public enum Usuarios implements Users{
    TEST_USER_1{
        public String email(){return "testMobile@aprendendoappium.com";}

        public String senha(){return "2345meia78";}

        public String nome(){return "Aprendendo Automação Mobile"; }
    },
    TEST_USER_2{
        @Override
        public String senha() {
            return null;
        }

        @Override
        public String nome() {
            return null;
        }

        @Override
        public String email() {
            return null;
        }
    };
}
