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
        "nazwa": "Metodologie obiektowe",
        "ECTS": 2,
        "Sala": 216,
        "Finals": true
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

4. Pobranie przedmiotów, które odbywają się w sali 216


GET localhost:8080/API/classes?calsroom=216


Odpowiedź serwera:


200 OK
Body:

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
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "ECTS": 2,
        "Sala": 216,
        "Finals": false
    }
]
```

5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208


GET localhost:8080/API/classes?finals=false&calsroom=208


Odpowiedź serwera:


200 OK
Body:

```JSON
[
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "ECTS": 3,
        "Sala": 208,
        "Finals": false
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "ECTS": 3,
        "Sala": 208,
        "Finals": false
    }
]
```
6. Pobranie przedmiotu o identyfikatorze 3


GET localhost:8080/API/classes/3


Odpowiedź serwera:


200 OK
Body:


```JSON
{
    "id": 3,
    "nazwa": "Technologie i aplikacje webowe",
    "ECTS": 3,
    "Sala": 208,
    "Finals": false
}
```

7. Pobranie przedmiotu o identyfikatorze 15


GET localhost:8080/API/classes/15


Odpowiedź serwera:


404 Not Found
Body: brak


8. Usunięcie przedmiotu o identyfikatorze 2


DELETE localhost:8080/API/classes/2


Odpowiedź serwera:


200 OK
Body: brak


9. Pobranie wszystkich przedmiotów


GET localhost:8080/API/classes


Odpowiedź serwera:


200 OK
Body:


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

10. Usunięcie wszystkich przedmiotów


DELETE localhost:8080/API/classes


Odpowiedź serwera:


200 OK
Body: brak


11. Pobranie wszystkich przedmiotów


GET localhost:8080/API/classes


Odpowiedź serwera:


200 OK
Body: brak

