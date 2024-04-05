package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView equationTextView;
    private TextView resultTextView;
    private Button num1Button, num2Button, num3Button, num4Button, num5Button,
            num6Button, num7Button, num8Button, num9Button, num0Button, minusButton, multiplyButton,
            divideButton, addButton, equalsButton, clearButton, deleteButton, decimalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView)findViewById(R.id.resultTextView);
        equationTextView = (TextView)findViewById(R.id.equationTextView);

        clearButton = (Button)findViewById(R.id.clearButton);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();
                if (!currentEquation.isEmpty()) {
                    equationTextView.setText("");
                    resultTextView.setText("0");
                }
            }
        });

        num0Button = (Button)findViewById(R.id.num0Button);
        num1Button = (Button)findViewById(R.id.num1Button);
        num2Button = (Button)findViewById(R.id.num2Button);
        num3Button = (Button)findViewById(R.id.num3Button);
        num4Button = (Button)findViewById(R.id.num4Button);
        num5Button = (Button)findViewById(R.id.num5Button);
        num6Button = (Button)findViewById(R.id.num6Button);
        num7Button = (Button)findViewById(R.id.num7Button);
        num8Button = (Button)findViewById(R.id.num8Button);
        num9Button = (Button)findViewById(R.id.num9Button);

        decimalButton = (Button)findViewById(R.id.decimalButton);

        num0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals(num0Button.getText())) {
                    equationTextView.setText(num0Button.getText());
                }
                else {
                    equationTextView.append(num0Button.getText());
                }
            }
        });

        num1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num1Button.getText());
                }
                else {
                    equationTextView.append(num1Button.getText());
                }
            }
        });

        num2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num2Button.getText());
                }
                else {
                    equationTextView.append(num2Button.getText());
                }
            }
        });

        num3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num3Button.getText());
                }
                else {
                    equationTextView.append(num3Button.getText());
                }
            }
        });

        num4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num4Button.getText());
                }
                else {
                    equationTextView.append(num4Button.getText());
                }
            }
        });

        num5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num5Button.getText());
                }
                else {
                    equationTextView.append(num5Button.getText());
                }
            }
        });

        num6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num6Button.getText());
                }
                else {
                    equationTextView.append(num6Button.getText());
                }
            }
        });

        num7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num7Button.getText());
                }
                else {
                    equationTextView.append(num7Button.getText());
                }
            }
        });

        num8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num8Button.getText());
                }
                else {
                    equationTextView.append(num8Button.getText());
                }
            }
        });

        num9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.equals("0")) {
                    equationTextView.setText(num9Button.getText());
                }
                else {
                    equationTextView.append(num9Button.getText());
                }
            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                String[] operands = currentEquation.split("[+\\-*/]");
                String lastOperand = operands[operands.length - 1];

                if (currentEquation.isEmpty() || isOperator(currentEquation.charAt(currentEquation.length() - 1))) {
                    equationTextView.append("0" + decimalButton.getText());
                }
                else if (!lastOperand.contains(decimalButton.getText())) {
                    equationTextView.append(decimalButton.getText());
                }
            }
        });

        minusButton = (Button)findViewById(R.id.minusButton);
        addButton = (Button)findViewById(R.id.addButton);
        divideButton = (Button)findViewById(R.id.divideButton);
        multiplyButton = (Button)findViewById(R.id.multiplyButton);

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();
                int length = currentEquation.length();

                if (!currentEquation.isEmpty() && (isOperator(currentEquation.charAt(length - 1)) || currentEquation.endsWith("."))) {
                    equationTextView.setText(currentEquation.substring(0, length - 1) + minusButton.getText());
                }
                else if (!currentEquation.isEmpty() && Character.isDigit(currentEquation.charAt(length - 1))) {
                    equationTextView.append(minusButton.getText());
                }
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();
                int length = currentEquation.length();

                if (!currentEquation.isEmpty() && (isOperator(currentEquation.charAt(length - 1)) || currentEquation.endsWith("."))) {
                    equationTextView.setText(currentEquation.substring(0, length - 1) + addButton.getText());
                }
                else if (!currentEquation.isEmpty() && Character.isDigit(currentEquation.charAt(length - 1))) {
                    equationTextView.append(addButton.getText());
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();
                int length = currentEquation.length();

                if (!currentEquation.isEmpty() && (isOperator(currentEquation.charAt(length - 1)) || currentEquation.endsWith("."))) {
                    equationTextView.setText(currentEquation.substring(0, length - 1) + divideButton.getText());
                }
                else if (!currentEquation.isEmpty() && Character.isDigit(currentEquation.charAt(length - 1))) {
                    equationTextView.append(divideButton.getText());
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();
                int length = currentEquation.length();

                if (!currentEquation.isEmpty() && (isOperator(currentEquation.charAt(length - 1)) || currentEquation.endsWith("."))) {
                    equationTextView.setText(currentEquation.substring(0, length - 1) + multiplyButton.getText());
                }
                else if (!currentEquation.isEmpty() && Character.isDigit(currentEquation.charAt(length - 1))) {
                    equationTextView.append(multiplyButton.getText());
                }
            }
        });

        equalsButton = (Button)findViewById(R.id.equalsButton);

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentEquation = equationTextView.getText().toString();

                if (currentEquation.isEmpty()) {
                }
                else {
                    if (isOperator(currentEquation.charAt(currentEquation.length() - 1))) {
                        currentEquation = currentEquation.substring(0, currentEquation.length() - 1);
                    }

                    float result = calculateEquation(currentEquation);

                    if (Float.isNaN(result)) {
                        resultTextView.setText("Error");
                    }
                    else {
                        String resultString = String.valueOf(result);

                        if (resultString.endsWith(".0")) {
                            resultTextView.setText(resultString.substring(0, resultString.length() - 2));
                        }
                        else {
                            resultTextView.setText(resultString);
                        }
                    }
                }
            }
        });

    }

    public static boolean isOperator(char c) {
        return c == '*' || c == '/' || c == '+' || c == '-';
    }

    public static float calculateEquation(String equation) {
        char[] operators = {'*', '/', '+', '-'};
        String[] parts = equation.split("[-+*/]");

        float[] numbers = new float[parts.length];
        char[] operatorArr = new char[parts.length - 1];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Float.parseFloat(parts[i]);
        }

        int opIndex = 0;
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (isOperator(c)) {
                operatorArr[opIndex++] = c;
            }
        }

        for (char op : operators) {
            for (int i = 0; i < operatorArr.length; i++) {
                if (operatorArr[i] == op) {
                    float tempResult;
                    if (op == '*') {
                        tempResult = numbers[i] * numbers[i + 1];
                    }
                    else if (op == '/') {
                        tempResult = numbers[i] / numbers[i + 1];
                    }
                    else if (op == '+') {
                        tempResult = numbers[i] + numbers[i + 1];
                    }
                    else {
                        tempResult = numbers[i] - numbers[i + 1];
                    }

                    numbers[i] = tempResult;
                    for (int j = i + 1; j < numbers.length - 1; j++) {
                        numbers[j] = numbers[j + 1];
                    }
                    for (int j = i; j < operatorArr.length - 1; j++) {
                        operatorArr[j] = operatorArr[j + 1];
                    }

                    float[] tempNumbers = new float[numbers.length - 1];
                    char[] tempOperators = new char[operatorArr.length - 1];

                    System.arraycopy(numbers, 0, tempNumbers, 0, tempNumbers.length);
                    System.arraycopy(operatorArr, 0, tempOperators, 0, tempOperators.length);

                    numbers = tempNumbers;
                    operatorArr = tempOperators;

                    i--;
                }
            }
        }

        return numbers[0];
    }
}

