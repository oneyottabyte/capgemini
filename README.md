<p align="center">
<img src="https://user-images.githubusercontent.com/59287246/155930748-26d3d0b3-866e-4fce-9489-aaf54533a7dd.png"/>
</p>

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
<details>
<summary>Veja Aqui</summary>
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
</details>

<h2 id="question02">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 02
</h2>

<details>
<summary>Veja Aqui</summary>
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
</details>

<h2 id="question03">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 03
</h2>

<details>
<summary>Veja Aqui</summary>
	
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
</details>





<h1 align="center">
DESAFIO DE PROGRAMAÇÃO 2 - ACADEMIA CAPGEMINI
</h1>

<h2 id="question01">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 01
</h2>

<details>
<summary>Veja Aqui</summary>
A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

Exemplo:

Entrada:
```
arr = [9, 2, 1, 4, 6]
```

Saída:
```
4
```
Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
import java.util.*;

public class MiddleNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> arr = new ArrayList<>();

		System.out.print("arr=");
		String numeros = scan.nextLine();

		arr = extractNumbersForArray(numeros);

		Collections.sort(arr);
		
		System.out.println(calculateMedian(arr));

		scan.close();

	}

	public static List<Integer> extractNumbersForArray(String str) {
		List<Integer> arr = new ArrayList<>();

		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher match = pattern.matcher(str);

		while (match.find()) {
			arr.add(Integer.parseInt(match.group().trim()));
		}

		return arr;
	}

	public static Integer calculateMedian(List<Integer> arr){
		
		int sizeArray = arr.size();
		int median;
		
		if(sizeArray % 2 == 0) {
			int j = ((arr.size()) / 2);
			int i = j - 1;
			median = (arr.get(j) + arr.get(i)) / 2;
			return median;
		}
		
		median = ((sizeArray + 1) / 2) - 1;
		return arr.get(median); 
	}
}
```
</details>

<h2 id="question02">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 02
</h2>

<details>
<summary>Veja Aqui</summary>
	
Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

Exemplo:

Entrada:
```
n = [1, 5, 3, 4, 2]
```

Saída:
```
3
```
Explicação:
Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
public class VectorPairElements {

	public static void main(String[] args) {

		int[] n = {1, 5, 3, 4, 2};
		int x = 2, count = 0;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length; j++) {
				if(n[i] - n[j] == x) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
```
</details>

<h2 id="question03">
<img height="30" src="https://img.icons8.com/color/48/000000/documents.png"/>
  Questão 03
</h2>
	
<details>
<summary>Veja Aqui</summary>
	
Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

√T <= linha <= coluna <= √T

 - Considere T, como o tamanho do texto.
 - Se certifique de que linhas x colunas >= .
 - Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:

Exemplo 1)

Entrada:
```
s = tenha um bom dia
```

Saída:
```
taoa eum nmd hbi
```

Explicação:

Depois de remover os espaços, a string tem 13 caracteres. √13 está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:
```
tenh
aumb
omdi
a
```
O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.


Exemplo 2)

Entrada:
```
s = ola mundo
```

Saída:
```
omd luo an
```

Explicação:

Depois de remover os espaços a string tem 8 caracteres. √8 está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
```
ola

mun

do
```

Para testar, você pode copiar o código abaixo e executar em sua IDE preferida ou um Compilador online.
Indico este (marque a opção Interactive) : https://www.jdoodle.com/online-java-compiler/

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryptor {

	public static void main(String[] args) throws IOException {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.print("s = ");
		String s = br.readLine();

		System.out.println(encryptString(s));
	}

	public static String encryptString(String s) {
		
		s = s.replace(" ", "");

		int sizeString = s.length();
		int row, column;
		row = (int) Math.floor(Math.sqrt(sizeString));
		column = (int) Math.ceil(Math.sqrt(sizeString));

		if (row * column < sizeString) {
			row = column;
		}

		String arr[] = s.split("");
		String grid[][] = new String[row][column];
		int count = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (count < sizeString) {
					grid[i][j] = arr[count];
					count++;
				}
			}
		}

		s = "";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (grid[j][i] != null)
					s += grid[j][i];
			}
			s += " ";
		}

		return s.trim();
	}
}
```
</details>

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
