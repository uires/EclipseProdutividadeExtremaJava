package br.com.caelum.empresa.modelo;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.curso.Funcionario;

public class ImportadorDeGastos {

	public List<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		List<Gasto> gastos = new ArrayList<Gasto>();
		
		while (leitor.hasNextLine()) {
			SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
			String linhas = leitor.nextLine();
			String tipoDeGastos = linhas.substring(0, 6);
			String dataGastoTxt = linhas.substring(6, 14);
			String vl = linhas.substring(14, 23);
			String mat = linhas.substring(23, 26);
			String nome = linhas.substring(26, 56);
			String dataNascTxt = linhas.substring(56);
			
			double valor = Double.parseDouble(vl);
			
			int matricula = Integer.parseInt(mat);
						
			Calendar dataNascimento = Calendar.getInstance();			
			dataNascimento.setTime(df.parse(dataNascTxt));
			
			Calendar dataDespesa = Calendar.getInstance();
			dataDespesa.setTime(df.parse(dataGastoTxt));
			
			Funcionario funcionario = new Funcionario(nome, matricula,
					dataNascimento);
			gastos.add(new Gasto(valor, tipoDeGastos, funcionario, dataDespesa));
		}
		leitor.close();
		return gastos;
	}
}