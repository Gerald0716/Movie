# Movie

Proyect: Maven
Lenguaje: Java
Spring Boot: 3.0.6
Packaging: War
Java: 17
Dependencies: MySQL Driver, Spring Data JPA


Obtener todas las películas de la aplicacion web www.themoviedb.org
Endpoint: GET /movie.
Este endpoint devuelve las películas en tendencias disponibles en la base de datos recibiendo los parámetros lenguaje, pagina, popularidad, Api Key.

Respuesta exitosa
Código de estado: 200 OK
{
    "page": 1,
    "results": [
        {
            "adult": false,
            "backdrop_path": "/nLBRD7UPR6GjmWQp6ASAfCTaWKX.jpg",
            "genre_ids": [
                16,
                10751,
                12,
                14,
                35
            ],
            "id": 502356,
            "original_language": "en",
            "original_title": "The Super Mario Bros. Movie",
            "overview": "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi.",
            "popularity": 8501.774,
            "poster_path": "/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
            "release_date": "2023-04-05",
            "title": "The Super Mario Bros. Movie",
            "video": false,
            "vote_average": 7.6,
            "vote_count": 2570
        },
        
Crear un apelicula 
Endpoint: PUT /movie/{id}

Este endpoint permite crear un registro de pelicula en la base de datos con los parametros de id, title, year, duration, duration, synopsis, id_gender, id_country.

    "id": 2,
    "title": "Rapidos y furiosos 10",
    "year": 2023,
    "duration": 120,
    "synopsis": "Fast X es una película de acción estadounidense dirigida por Louis Leterrier y escrita por Justin Lin y Dan Mazeau. Es la secuela de F9, que actúa como la décima entrega principal y el undécimo largometraje de la franquicia Fast & Furious.",
    "id_gender": 2,
    "id_country": 13
}


Obtener una película por su ID
Endpoint: GET /movie/{id}

Este endpoint permite obtener una película creada en la base de datos buscada por ID

Respuesta exitosa
Código de estado: 200 OK
{
    "id": 2,
    "title": "Rapidos y furiosos 10",
    "year": 2023,
    "duration": 120,
    "synopsis": "Fast X es una película de acción estadounidense dirigida por Louis Leterrier y escrita por Justin Lin y Dan Mazeau. Es la secuela de F9, que actúa como la décima entrega principal y el undécimo largometraje de la franquicia Fast & Furious.",
    "id_gender": 2,
    "id_country": 13
}

Actualizar una película
Endpoint: PUT /movie/{id}

Este endpoint nos permite actualizar la informacion de peliculas almacenadas en la base de datos llamadas por su ID, solo sera permitido modificar los datos title, Synopsis, Year.
{
    "id": 2,
    "title": "Rapidos y furiosos 10",
    "year": 2020,
    "duration": 120,
    "synopsis": "Fast X es una película de acción estadounidense dirigida por Louis Leterrier y escrita por Justin Lin y Dan Mazeau. Es la secuela de F9, que actúa como la décima entrega principal y el undécimo largometraje de la franquicia Fast & Furious.",
    "id_gender": 2,
    "id_country": 13
}

Eliminar una película
Endpoint: DELETE /movie/{id}

Este endpoint permite eliminar una película existente en la base de datos llamandola por su ID.

Respuesta exitosa
Código de estado: 200 OK
"Pelicula elimina correctamente."

