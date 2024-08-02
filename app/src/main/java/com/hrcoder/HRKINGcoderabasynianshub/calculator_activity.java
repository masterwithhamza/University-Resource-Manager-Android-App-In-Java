package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator_activity extends AppCompatActivity {
    Button bac,bc,bb1,bb2,bsin,bcos,btan,blog,bln,bx1,bx2,bx3,bx4,bdiv,bmul,bsub,bequal,badd,bpi,bdot,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tvmain,tvsec;
    String pi="3.14159562";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setTitle("Scientific Calculator");
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bx1=findViewById(R.id.bx1);
        bx2=findViewById(R.id.bx2);
        bx3=findViewById(R.id.bx3);
        bx4=findViewById(R.id.bx4);
        bdiv=findViewById(R.id.bdiv);
        bmul=findViewById(R.id.bmul);
        bsub=findViewById(R.id.bsub);
        bequal=findViewById(R.id.bequal);
        badd=findViewById(R.id.badd);
        bpi=findViewById(R.id.bpi);
        bdot=findViewById(R.id.bdot);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
  tvmain=findViewById(R.id.tvmain);
  tvsec=findViewById(R.id.tvsec);
        //complete
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b1.getText().toString());
            }
        });
        //complete
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b2.getText().toString());
            }
        });
        //complete
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b3.getText().toString());
            }
        });
        //complete
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b4.getText().toString());
            }
        });
        //complete
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b5.getText().toString());
            }
        });
        //complete
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b6.getText().toString());
            }
        });
        //complete
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b7.getText().toString());
            }
        });
        //complete
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b8.getText().toString());
            }
        });
        //complete
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b9.getText().toString());
            }
        });
        //complete
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b0.getText().toString());
            }
        });
        //complete
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+bdot.getText().toString());
                if(!val.contains("."))
                {
                    tvmain.setText(val+bdot.getText().toString());
                }
            }
        });

        //complete
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });

        //complete
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=tvmain.getText().toString();
                val=val.substring(0,val.length()-1);
                tvmain.setText(val);
            }
        });
        //complete
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+badd.getText().toString());
                }
            }
        });
        //complete
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (last!='-')
                {
                    tvmain.setText(val+bsub.getText().toString());
                }
            }
        });
        //complete
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (!val.equals(""))
                {
                    tvmain.setText(val+bmul.getText().toString());
                }
            }
        });
        //complete
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+bdiv.getText().toString());
                }
            }
        });
        //complete
        bx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=tvmain.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        //complete
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        //complete
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        //complete
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+bpi.getText().toString());
                tvmain.setText(tvmain.getText()+pi);
                tvsec.setText(bpi.getText());
            }
        });


        //complete
        bx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int val=Integer.parseInt(tvmain.getText().toString());
              int fact=factroial(val);
              tvmain.setText(String.valueOf(fact));
              tvsec.setText(val+"!");
            }
        });
//complete
        bx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText().toString()+"^"+"(-1)");
            }
        });

        //complete
        bx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           double d=Double.parseDouble(tvmain.getText().toString());
           double square=d*d;
           tvmain.setText(String.valueOf(square));
           tvsec.setText(d+"²");
            }
        });

        //complete
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedString = val.replace('÷','/').replace('×', '*');
                double result = eval(replacedString);
                String r = String.valueOf(result);
                tvmain.setText(r);
                tvsec.setText(val);
            }
        });
        //complete

    }
    int factroial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factroial(n-1);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    //evaluation
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }
}