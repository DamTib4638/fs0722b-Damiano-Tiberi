/* DDL - CREAZIONE TABELLE DEL DB */

CREATE TABLE CLIENTI (
	NUMERO_CLIENTE SERIAL PRIMARY KEY,
	NOME VARCHAR NOT NULL,
	COGNOME VARCHAR NOT NULL,
	ANNO_NASCITA INT8 NOT NULL,
	REGIONE_RESIDENZA VARCHAR NOT NULL
);

-- DROP TABLE CLIENTI;
-- DROP TABLE PRODOTTI;
-- DROP TABLE FORNITORI;
-- DROP TABLE FATTURE;

CREATE TABLE FATTURE (
	NUMERO_FATTURA SERIAL PRIMARY KEY,
	TIPOLOGIA VARCHAR NOT NULL,
	IMPORTO "numeric" NOT NULL,
	IVA "numeric" NOT NULL,
	ID_CLIENTE INT8 NOT NULL,
	ANNO_FATTURA INT8 NOT NULL,
	NUMERO_FORNITORE INT8 NOT NULL,
	CONSTRAINT CLIENTI_FK FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTI (NUMERO_CLIENTE),
	CONSTRAINT FORNITORI_FK FOREIGN KEY (NUMERO_FORNITORE) REFERENCES FORNITORI (NUMERO_FORNITORE)
);

CREATE TABLE PRODOTTI (
	ID_PRODOTTO SERIAL PRIMARY KEY,
	DESCRIZIONE VARCHAR NOT NULL,
	IN_PRODUZIONE BOOLEAN NOT NULL,
	IN_COMMERCIO BOOLEAN NOT NULL,
	ANNO_ATTIVAZIONE INT8 NOT NULL,
	ANNO_DISATTIVAZIONE INT8 NOT NULL
);

CREATE TABLE FORNITORI (
	NUMERO_FORNITORE SERIAL PRIMARY KEY,
	DENOMINAZIONE VARCHAR NOT NULL,
	REGIONE_RESIDENZA VARCHAR NOT NULL
);

/* DQL - INTERROGAZIONI AL DB */

-- SELECT GENERICHE
SELECT * FROM CLIENTI;
SELECT * FROM FATTURE;
SELECT * FROM FORNITORI;
SELECT * FROM PRODOTTI;

-- PRIMA SELECT
SELECT NOME, COGNOME FROM CLIENTI WHERE ANNO_NASCITA = 1982;

-- SECONDA SELECT
SELECT NUMERO_FATTURA FROM FATTURE WHERE IVA = 20;

-- TERZA SELECT
SELECT COUNT(NUMERO_FATTURA), SUM(IMPORTO) FROM FATTURE GROUP BY ANNO_FATTURA;

-- QUARTA SELECT
SELECT DESCRIZIONE FROM PRODOTTI WHERE ANNO_ATTIVAZIONE = 2017 AND (IN_PRODUZIONE=TRUE OR IN_COMMERCIO=TRUE);

-- QUINTA SELECT
SELECT COUNT(NUMERO_FATTURA), ANNO_FATTURA FROM FATTURE WHERE IVA = 20 GROUP BY ANNO_FATTURA;

-- SESTA SELECT
SELECT ANNO_FATTURA FROM FATTURE WHERE TIPOLOGIA = 'A' GROUP BY ANNO_FATTURA HAVING COUNT(TIPOLOGIA) >= 2;

-- SETTIMA SELECT
SELECT FO.DENOMINAZIONE, FA.NUMERO_FATTURA, FA.IMPORTO, FA.IVA, FA.ANNO_FATTURA
FROM FATTURE FA, FORNITORI FO
WHERE FO.NUMERO_FORNITORE = FA.NUMERO_FORNITORE;

-- OTTAVA SELECT
SELECT SUM(FA.IMPORTO)
FROM CLIENTI CL, FATTURE FA
WHERE CL.NUMERO_CLIENTE = FA.ID_CLIENTE
GROUP BY CL.REGIONE_RESIDENZA;

-- NONA SELECT

SELECT CL.NUMERO_CLIENTE
FROM CLIENTI CL, FATTURE FA
WHERE CL.NUMERO_CLIENTE = FA.ID_CLIENTE
AND ANNO_NASCITA = 1980
AND FA.IMPORTO > 50;

-- DECIMA SELECT

SELECT NOME || '-' || COGNOME AS DENOMINAZIONE FROM CLIENTI WHERE REGIONE_RESIDENZA = 'Lombardia';

/* DML - INSERIMENTO DATI NEL DB */

INSERT INTO CLIENTI (NOME, COGNOME, ANNO_NASCITA, REGIONE_RESIDENZA)
				VALUES ('Damiano', 'Tiberi', 1982, 'Trentino Alto Adige');
				
INSERT INTO CLIENTI (NOME, COGNOME, ANNO_NASCITA, REGIONE_RESIDENZA)
				VALUES ('Manuel', 'Ferrucci', 1982, 'Campania');
				
INSERT INTO CLIENTI (NOME, COGNOME, ANNO_NASCITA, REGIONE_RESIDENZA)
				VALUES ('Francesco', 'Pastore', 2002, 'Liguria');
				
INSERT INTO CLIENTI (NOME, COGNOME, ANNO_NASCITA, REGIONE_RESIDENZA)
				VALUES ('Stefano', 'Gavioli', 1980, 'Emilia Romagna');
				
INSERT INTO CLIENTI (NOME, COGNOME, ANNO_NASCITA, REGIONE_RESIDENZA)
				VALUES ('Riccardo', 'Damiani', 1999, 'Lazio');

INSERT INTO PRODOTTI (DESCRIZIONE, IN_PRODUZIONE, IN_COMMERCIO, ANNO_ATTIVAZIONE, ANNO_DISATTIVAZIONE)
				VALUES ('Borraccia', FALSE, FALSE, 1990, 2000);
				
INSERT INTO PRODOTTI (DESCRIZIONE, IN_PRODUZIONE, IN_COMMERCIO, ANNO_ATTIVAZIONE, ANNO_DISATTIVAZIONE)
				VALUES ('Tastiera', TRUE, FALSE, 1995, 1996);
				
INSERT INTO PRODOTTI (DESCRIZIONE, IN_PRODUZIONE, IN_COMMERCIO, ANNO_ATTIVAZIONE, ANNO_DISATTIVAZIONE)
				VALUES ('Monitor', TRUE, TRUE, 2008, 2009);
				
INSERT INTO PRODOTTI (DESCRIZIONE, IN_PRODUZIONE, IN_COMMERCIO, ANNO_ATTIVAZIONE, ANNO_DISATTIVAZIONE)
				VALUES ('Mouse', FALSE, TRUE, 2017, 2020);
				
INSERT INTO PRODOTTI (DESCRIZIONE, IN_PRODUZIONE, IN_COMMERCIO, ANNO_ATTIVAZIONE, ANNO_DISATTIVAZIONE)
				VALUES ('Penna', FALSE, FALSE, 2017, 2020);

INSERT INTO FORNITORI (DENOMINAZIONE, REGIONE_RESIDENZA) 
				VALUES ('BRT', 'Lazio');
				
INSERT INTO FORNITORI (DENOMINAZIONE, REGIONE_RESIDENZA) 
				VALUES ('UPS', 'Umbria');
				
INSERT INTO FORNITORI (DENOMINAZIONE, REGIONE_RESIDENZA) 
				VALUES ('Poste', 'Abruzzo');
				
INSERT INTO FORNITORI (DENOMINAZIONE, REGIONE_RESIDENZA) 
				VALUES ('Amazon', 'Sardegna');
				
INSERT INTO FORNITORI (DENOMINAZIONE, REGIONE_RESIDENZA) 
				VALUES ('SDA', 'Toscana');

INSERT INTO FATTURE (TIPOLOGIA, IMPORTO, IVA, ID_CLIENTE, ANNO_FATTURA, NUMERO_FORNITORE)
				VALUES ('A', 60, 20, 1, 1990, 2);
				
INSERT INTO FATTURE (TIPOLOGIA, IMPORTO, IVA, ID_CLIENTE, ANNO_FATTURA, NUMERO_FORNITORE)
				VALUES ('B', 70, 10, 2, 1980, 5);
				
INSERT INTO FATTURE (TIPOLOGIA, IMPORTO, IVA, ID_CLIENTE, ANNO_FATTURA, NUMERO_FORNITORE)
				VALUES ('A', 50, 15, 2, 2000, 3);
				
INSERT INTO FATTURE (TIPOLOGIA, IMPORTO, IVA, ID_CLIENTE, ANNO_FATTURA, NUMERO_FORNITORE)
				VALUES ('C', 30, 30, 3, 2010, 3);
				
INSERT INTO FATTURE (TIPOLOGIA, IMPORTO, IVA, ID_CLIENTE, ANNO_FATTURA, NUMERO_FORNITORE)
				VALUES ('A', 20, 25, 4, 1970, 1);