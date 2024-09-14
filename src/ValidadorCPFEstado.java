public class ValidadorCPFEstado {

    private static final String[] ESTADOS_VALIDOS = {
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
            "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
            "RS", "RO", "RR", "SC", "SP", "SE", "TO"
    };

    public static void validarCPF(String cpf) throws InformacaoInvalidaException {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new InformacaoInvalidaException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
    }

    public static void validarEstado(String estado, String cpf) throws InformacaoInvalidaException {

        if (cpf.charAt(8) == '1') {
            System.out.println("Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins;");
        } else if (cpf.charAt(8) == '2') {
            System.out.println("Pará, Amazonas, Acre, Amapá, Rondônia e Roraima;");
        } else if (cpf.charAt(8) == '3') {
            System.out.println("Ceará, Maranhão e Piauí;");
        } else if (cpf.charAt(8) == '4') {
            System.out.println("Pernambuco, Rio Grande do Norte, Paraíba");
        } else if (cpf.charAt(8) == '5') {
            System.out.println("Bahia e Sergipe;");
        } else if (cpf.charAt(8) == '6') {
            System.out.println("Minas Gerais;");
        } else if (cpf.charAt(8) == '7') {
            System.out.println("Rio de Janeiro e Espírito Santo;");
        } else if (cpf.charAt(8) == '8') {
            System.out.println("São Paulo;");
        } else if (cpf.charAt(8) == '9') {
            System.out.println("Paraná e Santa Catarina;");
        } else if (cpf.charAt(8) == '0') {
            System.out.println("Rio Grande do Sul");
        } else {
            System.out.println("Estado invalido");
        }

        for (String estadoValido : ESTADOS_VALIDOS) {
            if (estadoValido.equals(estado)) {
                return;
            }
        }
        throw new InformacaoInvalidaException("Estado inválido. Deve ser uma sigla válida de estado brasileiro.");
    }

    static class InformacaoInvalidaException extends Exception {

        public InformacaoInvalidaException() {
            super();
        }

        public InformacaoInvalidaException(String message) {
            super(message);
        }
    }

}
