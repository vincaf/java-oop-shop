# Java Shop
#### Repo: 
**java-oop-shop**

#### Todo:
Package `generation.italy.shop`
Classe `Prodotto` che rappresenta un singolo prodotto all'interno di un negozio.
Il prodotto e' caratterizzato dalle seguenti informazioni:
- codice - int
- nome - String
- descrizione - String
- prezzo - int
- iva - int

Nella classe, oltre alle *variabili d'istanza* generati i seguenti metodi:
- costruttore che accetta in ingresso `nome`, `descrizione`, `prezzo`
*N.B.*: il codice e' un valore a **5 cifre** calcolato casualmente
*N.N.B.*: il valore dell'*iva* e' fisso a 20 (inteso come 20%)
- metodo che restituisce il prezzo
- metodo che restituisce il prezzo incrementato dell'iva (*PERCENTUALE*)
- metodo `toString()` che dia una rappresentazione sensata dell'oggetto

Nello stesso package aggiunta una classe `Main` con metodo `main` utilizzato per creare alcuni oggetti di prova e testarne le relative funzioni a scopo di **debug**.
