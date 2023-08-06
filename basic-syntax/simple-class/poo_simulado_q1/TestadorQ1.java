package poo_simulado_q1;

import java.time.LocalDate;

import poo_simulado_q1.src.Tweet;
import poo_simulado_q1.src.User;
import poo_simulado_q1.src.UserBase;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem média de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		User joao			= new User("jvmoraiscb", null);
		User talles 		= new User("tallesweiler", null);
		User celso 			= new User("celsonantes", LocalDate.of(2022, 12, 7));

		joao.addTweet(new Tweet("Espero que todas as mulheres com menos de 1.70, cabelo liso ou ondulado e depressão severa tenham um ótimo dia"));
		joao.addTweet(new Tweet("Espero que todas as mulheres  com menos de 1.70, cabelo cacheado mas não tenham o nome iniciado com a letra B e nem M tenham um ótimo dia"));
		talles.addTweet(new Tweet("Espero que todas as mulheres com menos de 1.70, cabelo liso ou ondulado e depressão severa tenham um ótimo dia"));
		celso.addTweet(new Tweet("Espero que todas as mulheres com menos de 15, cabelo liso ou ondulado e depressão severa tenham um ótimo dia"));

		UserBase userBase 	= new UserBase();
		userBase.addUser(joao);
		userBase.addUser(talles);
		userBase.addUser(celso);

		System.out.printf("Porcentagem de usuários verificados: %.1f%%\n", userBase.getVerifiedUsersPercentage());
		System.out.printf("Tamanho médio dos tweets: %.2f\n", userBase.getAverageSizeOfTweets());
	}
}
