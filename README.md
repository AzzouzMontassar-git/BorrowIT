# BorrowIT

BorrowIT est une application web complète permettant la location d’items (objets, équipements, etc.).  
Elle est composée d’un backend développé avec **Spring Boot** et d’un frontend développé avec **Angular**.

---

## Description du projet

Cette application facilite la gestion de la location d’items entre utilisateurs. Elle permet :

- La création, consultation et gestion des items disponibles à la location.
- L’inscription et authentification des utilisateurs.
- La gestion des demandes et réservations de location.
- Le suivi des locations en cours et terminées.

---

## Architecture

- **Backend** : Spring Boot (Java)  
  - REST API pour gérer la logique métier, les données utilisateurs, les items, et les transactions.
  - Sécurisation avec Spring Security (authentification et autorisation).
  - Base de données relationnelle (MySQL, PostgreSQL ou autre).

- **Frontend** : Angular  
  - Interface utilisateur dynamique et responsive.
  - Consommation des API REST du backend.
  - Gestion des sessions et tokens JWT pour la sécurité.

---

## Fonctionnalités principales

- Gestion des items à louer : ajout, modification, suppression, recherche.
- Gestion des utilisateurs : inscription, connexion, profils.
- Processus de location : demande, acceptation, suivi, retour.
- Notifications et alertes (optionnel selon implémentation).
- Dashboard utilisateur avec historique et statut des locations.

---

## Technologies utilisées

- Spring Boot
- Spring Security (JWT)
- Hibernate / JPA
- MySQL (ou autre base relationnelle)
- Angular 12+
- TypeScript, HTML, CSS
- Maven / Gradle (pour le backend)
- Node.js, npm (pour le frontend)

---

## Installation & Déploiement

### Backend

1. Cloner le dépôt backend :

```bash
git clone https://github.com/ton-utilisateur/BorrowIT-backend.git
