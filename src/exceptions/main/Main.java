package exceptions.main;

import exceptions.exceptions.DivisaoPorZeroException;
import exceptions.exceptions.ParametroInvalidoException;

public class Main {

	public static void main(String[] args) throws Exception {

		int x = 10;
		int y = 0;
		int z = 0;

		try {
			z = dividir(x, y);
		} catch (ParametroInvalidoException | DivisaoPorZeroException pie) {
			if(pie instanceof ParametroInvalidoException) { 
				System.out.println("Caiu no ParametroInvalidoException");
				System.out.println(((ParametroInvalidoException) pie).getCodigo());
			} else {
				System.out.println("Caiu no ParametroInvalidoException");
			}
			//System.exit(1); // Para a execução do programa quando uma exceção estoura.
			
		} finally { //Sem exceção, não passa no catch mas sempre no finally(Exceto quando uma exceção é lançada no próprio catch). Com exceção, passa no Catch e no Finally
			System.out.println("Chegou no Finally");
		}

		System.out.println(z);
	}

	public static Integer dividir(Integer x, Integer y) throws ParametroInvalidoException, DivisaoPorZeroException {
		
		if (x == null || y == null) {
			throw new ParametroInvalidoException("Os parâmetros não podem ser nulos");
		}
		
		if (y == 0) {
			// throw new IllegalArgumentException("Não é possível divisão por 0.");
			throw new DivisaoPorZeroException("Não é possível divisão por 0.");
		}

		return x / y;
	}

}
