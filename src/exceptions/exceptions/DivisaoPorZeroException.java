package exceptions.exceptions;

import java.io.Serializable;

public class DivisaoPorZeroException extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;

    public DivisaoPorZeroException(String message) {
        super(message);
    }
    
    /**
     * (Dica do instrutor sobre como era usado em uma empresa onde ele trabalhava)
     * 
     * Metodo especial que pode lançar um código para quando essa exceção ocorra.
     * Com o código tabelado, facilita a identificação da Exceção quando ela é especifica e
     * já é esperada.
     * 
     * @return
     */
    public int getCodigo() {
    	return 1234;
    }
	
}
