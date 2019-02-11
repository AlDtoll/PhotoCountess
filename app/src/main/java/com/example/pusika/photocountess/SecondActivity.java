package com.example.pusika.photocountess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText lastName;
    EditText firstName;
    EditText middleName;
    EditText phone;
    AutoCompleteTextView city;
    AutoCompleteTextView street;
    EditText house;
    EditText flat;
    EditText index;
    EditText build;

    boolean isError = true;
    TextView price;

    CheckBox vkCheckBox;
    CheckBox fbCheckBox;
    CheckBox insCheckBox;

    private static final int REQUEST_ACCESS_TYPE = 1;
    static final String ACCESS_MESSAGE = "ACCESS_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lastName = findViewById(R.id.lastName);
        firstName = findViewById(R.id.firstName);
        middleName = findViewById(R.id.middleName);
        phone = findViewById(R.id.phone);


        city = findViewById(R.id.city);
        String[] cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
        city.setAdapter(adapter);
        street = findViewById(R.id.street);
        String[] streets = getResources().getStringArray(R.array.streets);
        ArrayAdapter<String> streetsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, streets);
        street.setAdapter(streetsAdapter);

        vkCheckBox = findViewById(R.id.vkCheckbox);
        fbCheckBox = findViewById(R.id.fbCheckbox);
        insCheckBox = findViewById(R.id.instagramCheckbox);

        price = findViewById(R.id.price);

        house = findViewById(R.id.house);
        flat = findViewById(R.id.flat);
        index = findViewById(R.id.index);
        build = findViewById(R.id.build);
        String[] data = {"Выбор подписки", "На 1 месяц: 1 фото в неделю", "На 3 месяца: 1 фото в неделю", "На 1 месяц: 2 фото в неделю", "На 3 месяца: 2 фото в неделю"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        stringArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
        // заголовок
        spinner.setPrompt("Выбор подписки");
        // выделяем элемент
        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        price.setText("Стоимость услуги составит: 100 р");
                        break;
                    case 2:
                        price.setText("Стоимость услуги составит: 270 р");
                        break;
                    case 3:
                        price.setText("Стоимость услуги составит: 190 р");
                        break;
                    case 4:
                        price.setText("Стоимость услуги составит: 500 р");
                        break;
                    default:
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        lastName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    lastName.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    lastName.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        firstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    firstName.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    firstName.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        middleName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    middleName.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    middleName.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        city.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    city.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    city.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        street.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    street.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    street.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        house.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    house.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    house.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        index.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    index.setError("Необходимо заполнить поле");
                    isError = true;
                } else {
                    index.setError(null);
                    isError = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }



    public void onClick(View v) {
        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

        if (lastName.getText().length() == 0) {
            lastName.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            lastName.setError(null);
            isError = false;
        }
        if (firstName.getText().length() == 0) {
            firstName.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            firstName.setError(null);
            isError = false;
        }
        if (middleName.getText().length() == 0) {
            middleName.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            middleName.setError(null);
            isError = false;
        }
        if (city.getText().length() == 0) {
            city.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            city.setError(null);
            isError = false;
        }
        if (street.getText().length() == 0) {
            street.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            street.setError(null);
            isError = false;
        }
        if (house.getText().length() == 0) {
            house.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            house.setError(null);
            isError = false;
        }
        if (index.getText().length() == 0) {
            index.setError("Необходимо заполнить поле");
            isError = true;
        } else {
            index.setError(null);
            isError = false;
        }
        if (!isError) {
            emailIntent.setType("plain/text");
            // Кому
            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
                    new String[]{"fotobabushke@yandex.ru"});
            // Зачем
            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                    "Подписчик");
            // О чём
            String profiles = "";
            String vk = "";
            if (vkCheckBox.isChecked()) {
                vk = ((EditText) findViewById(R.id.vk)).getText().toString() + "; ";
            }
            profiles = profiles + vk;
            String fb = "";
            if (fbCheckBox.isChecked()) {
                fb = ((EditText) findViewById(R.id.fb)).getText().toString() + "; ";
            }
            profiles = profiles + fb;
            String instagram = "";
            if (insCheckBox.isChecked()) {
                instagram = ((EditText) findViewById(R.id.instagram)).getText().toString();
            }
            profiles = profiles + instagram;

            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
                    "ФИО адресата: " + lastName.getText().toString() + " " +
                            firstName.getText().toString() + " " +
                            middleName.getText().toString() + "\n" +
                            "Адрес для доставки: г." + city.getText().toString() + " ул. " + street.getText().toString() + "\n" +
                            "Профили соцсетей: " + profiles + "\n" +
                            price.getText().toString() + "\n" +
                            "Мобильный для запроса: " + phone.getText().toString());
            // Поехали!
//            SecondActivity.this.startActivity(Intent.createChooser(emailIntent,
//                    "Отправка письма для бабуси..."));
            SecondActivity.this.startActivityForResult(emailIntent, REQUEST_ACCESS_TYPE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ACCESS_TYPE) {
//            if (resultCode == RESULT_OK) {
            Toast toast = Toast.makeText(this, "На указанный вами номер мобильного в течении двух часов придет сообщение с реквизитами для оплаты", Toast.LENGTH_LONG);
            toast.show();
//            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        finish();
    }
}
