# Taw_zal
1. Dodanie przedmiotów<br>
POST localhost:8080/API/classes
```JSON
{
    "nazwa": "Technologie komponentowe i sieciowe",
    "ECTS": 2,
    "Sala": 208,
    "Finals": true
}
```

Odpowied serwera:<br>
OK 200

2. Wywoanie wszystkich wyników<br>
GET localhost:8080/API/classes
```JSON
[
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "ECTS": 2,
        "Sala": 216,
        "Finals": true
    },
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "ECTS": 1,
        "Sala": 216,
        "Finals": false
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "ECTS": 3,
        "Sala": 208,
        "Finals": false
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "ECTS": 2,
        "Sala": 216,
        "Finals": false
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "ECTS": 3,
        "Sala": 208,
        "Finals": false
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciowe",
        "ECTS": 2,
        "Sala": 208,
        "Finals": true
    }
]
```

Odpowiedź serwera:<br>
OK 200

3. Wyszukiwanie rekordów z wgzminem

GET localhost:8080/API/classes?Finals=true

```JSON
[
    {
        "id": 1,
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room_no": 216,
        "exam": true
    },
    {
        "id": 6,
        "name": "Technologie komponentowe i sieciowe",
        "ECTS": 2,
        "room_no": 208,
        "exam": true
    }
]
```

Odpowiedź serwera:<br>
OK 200

