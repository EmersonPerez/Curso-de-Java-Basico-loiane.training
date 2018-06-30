package aula11;

public class Variaveis {
	public static void main(String[] args) {
		char o = 111;
		char i = 105;
		char interrogacao = 63;
		char u = '\u040A';  // usando tabela unicode
		System.out.println(" " + o + i + interrogacao); // aqui o + é de concatenar
		System.out.println(o + i); // aqui o + é de somar, imprime 216
		System.out.println(" " + (o + i)); // imprime 216, pois o somar tem prioridade sobre o concatenar 
		System.out.println(u); 
		System.out.println('\u040A');
		
		byte b = Byte.MAX_VALUE;
		short s = Short.MAX_VALUE;
		int in = Integer.MAX_VALUE;
		long l = Long.MAX_VALUE;
	
		byte b_ = Byte.MIN_VALUE;
		short s_ = Short.MIN_VALUE;
		int in_ = Integer.MIN_VALUE;
		long l_ = Long.MIN_VALUE;
		
		System.out.println(b_ + " " + s_ + " " + in_  + " " + l_);
		System.out.println(b + " " + s + " " + in  + " " + l);
		
		System.out.println(b + b);  // vi que soma de boa, logo converte pra int
		System.out.println(s + s);  // idem
		System.out.println(in + in); //  aqui dá erro, imprime -2. limita no int
		System.out.println(in + b);  // da erro, limita no int
		System.out.println(l + in);  // aqui limita no long
		System.out.println((long)in + in); // funciona, limita no long.
		in = in * 2; // dá -2, logo continua limitanto no int.
		System.out.println(in);
		
		System.out.println(Float.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Integer.BYTES);
		
		long a = 0x1_2____3;
		System.out.println(a);
		System.out.println("word\nf\rt"); // qual a diferença entre \n e \r?
	}
}
