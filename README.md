<h1 align="center">
DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI
</h1>

<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
</p>

<h1 id="objetivo">
	<img src="https://img.icons8.com/external-tal-revivo-color-tal-revivo/24/000000/external-readme-is-a-easy-to-build-a-developer-hub-that-adapts-to-the-user-logo-color-tal-revivo.png"/>
  Descrição
</h1>
Olá! Seja bem-vindo (a) à terceira etapa do processo de seleção para a Academia Capgemini 2022. O objetivo dessa etapa é testar os seus conhecimentos em lógica de programação. Para isso, preparamos três questões com diferentes níveis de dificuldade. A implementação das questões pode ser feita em qualquer linguagem, porém a utilização de Java será um diferencial.

<h2 id="question01">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 01
</h2>

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:
```
n = 6
```

Saída:
```
     *
    **
   ***
  ****
 *****
******
```
Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.printf("n = ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			int step = i;
			int complement=n;
			
			while (step < n) {
				System.out.printf(" ");
				step++;
			}
			
			while (complement+i > n) {
				System.out.printf("*");
				complement--;
			}
			System.out.println("");
		}
		scan.close();
	}
}
```


<h2 id="question02">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 02
</h2>

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

Possui no mínimo 6 caracteres.
Contém no mínimo 1 dígito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


Exemplo:

Entrada:
```
Ya3
```

Saída:
```
3
```

Explicação:

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final String password = scan.next();		
		final int size = 6;
		if(password.length() < size) {
			System.out.println(size - password.length());
		}else {
			System.out.println("0");
		}
		scan.close();
	}
}
```

<h2 id="question03">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 03
</h2>

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo 1)

Entrada:
```
ovo
```

Saída:
```
2
```

Explicação:

A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente.



Exemplo 2)

Entrada:
```
ifailuhkqq
```

Saída:
```
3
```

Explicação:

A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int anagrams = 0, checking1 = 0, checking2 = 0;
		String subString1, subString2;

		for (int i = 1; i < str.length(); i++) {
			checking1 = i;

			for (int j = 0; checking1 <= str.length(); j++) {
				subString1 = str.substring(j, checking1);
				checking2 = i + j + 1;

				for (int c = j + 1; checking2 <= str.length(); c++) {
					if (checking2 == str.length()) {
						subString2 = str.substring(c);
					} else {
						subString2 = str.substring(c, checking2);
					}
					char[] array1 = subString1.toCharArray();
					char[] array2 = subString2.toCharArray();
					Arrays.sort(array1);
					Arrays.sort(array2);
					if (Arrays.equals(array1, array2)) {
						anagrams++;
					}
					checking2++;

				}
				checking1++;
			}
		}
		System.out.println(anagrams);
		sc.close();
	}
}
```


<h1 id="tecnologias-dependencias">
<img height="30" src="https://img.icons8.com/fluency/50/000000/administrative-tools.png"/>
	Tecnologias e Dependências
</h1>

<a name = "tech_stack"></a>

- Java 17 - Versão do Java utilizada
- STS - IDE utilizada

<h1 id="desenvolvedor">
<img height="30" src="https://img.icons8.com/color/48/000000/devpost.png"/>
  Desenvolvedor
</h1>

<table align="center">
  <tr>
    <td align="center"><a href="https://github.com/oneyottabyte"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/oneyottabyte" width="100px;" alt=""/><br /><sub><b>Dorian Vieira</b></sub></a><br /><a href="https://github.com/oneyottabyte" title="Dorian Vieira"></a></td>
  </tr>
</table>
