package com.hacompany.calculadora;



import com.hacompany.calculadora.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
	int numAnt = 0;
	boolean botaoClicado = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
	}
	//----Teste para usar somente uma função-----
	/*public void adicionar(View view){
		Button bt1 = (Button) findViewById(R.id.num1);
		Button bt2 = (Button) findViewById(R.id.num2);
		Button bt3 = (Button) findViewById(R.id.num3);
		Button bt4 = (Button) findViewById(R.id.num4);
		Button bt5 = (Button) findViewById(R.id.num5);
		Button bt6 = (Button) findViewById(R.id.num6);
		Button bt7 = (Button) findViewById(R.id.num7);
		Button bt8 = (Button) findViewById(R.id.num8);
		Button bt9 = (Button) findViewById(R.id.num9);
		Button bt0 = (Button) findViewById(R.id.num0);
		
		
	}*/
	
	public void adicionar1(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "1");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "1");
		}

	}
	public void adicionar2(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "2");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "2");
		}

	}
	public void adicionar3(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "3");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "3");
		}

	}
	public void adicionar4(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "4");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "4");
		}

	}
	public void adicionar5(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "5");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "5");
		}

	}
	public void adicionar6(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "6");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "6");
		}

	}
	public void adicionar7(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "7");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "7");
		}

	}
	public void adicionar8(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "8");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "8");
		}

	}
	public void adicionar9(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "9");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "9");
		}

	}
	public void adicionar0(View view){
		TextView texto = (TextView) findViewById(R.id.textView1);
		texto.setText(texto.getText() + "0");
		if(botaoClicado==true){
			texto.setText("");
			botaoClicado = false;
			texto.setText(texto.getText() + "0");
		}

	}
	public void somar(View view){

		if(botaoClicado==false){
			TextView texto = (TextView) findViewById(R.id.textView1);
			String numStr = texto.getText().toString();
			int num = Integer.parseInt(numStr);
			int res = num + numAnt;
			Toast.makeText(MainActivity.this, numAnt + "+" + num + " = " + res, Toast.LENGTH_LONG).show();
			texto.setText(res + "");
			numAnt = res;
			botaoClicado = true;
			
		}



	}


}
