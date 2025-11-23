
# Spring Training Project: WaarIsMijnHuis.exe
Tijdens de training zal ik dit project maken t.b.h
van opdracht 4, maar ook vragen uit te werken of problemen
tegen te komen die ik tijdens de training kan gebruiken.

## Doel van project
Het project "WaarIsMijnHuis" is bedoeld om de woningzoektocht
te versimpelen. De huizenmakrt is turbulent en daarom maken mensen
soms niet wel overwogen beslissingen. WaarIsMijnHuis is bedoeld
om inzicht te geven op een van de grootste keuzes die we als 
volwassen gaan of hebben gemaakt en daarmee reeel beeld geven van
de échte waarde van een huis.

## Developer Guide
Op dit moment is het alleen een backend-service, maar het doel is om 
om ook een **Angular** project hierin te gaan verwerken om alles te visualiseren

### Hoe start ik hem op?
Dit Springboot project maakt gebruik van een PostGress Database
en om niet zelf een database continu te hebben draaien heb ik ervoor gekozen
om gebruik te maken van **Docker-Compose**

Opstarten: docker-compose up -d

**Wil je nu ontwikkelen?**
- Start alleen database up: docker-compose up -d database
- Start je lokale project op met de **start button** of **mvn spring-boot:run**

**LET OP!**: Je moet je backend opniuew bouwen voordat je hemt opstart: docker-compose up -d --build backend


### Hoe zit mijn database er nu uit?
Aangezien alles in een container staat kan het soms lastig zijn om
een beeld te krijgen wat nu de status is van elk van je tabellen. Daarom
de volgende commando's

- Login de container: docker exec -it <db-container-naam> psql -U <username> -d <database>
- Toon alle tabellen: \dt
- Toon specifieke tabel: \d <tablename>
- Query je data (bv): SELECT * FROM <tablename>