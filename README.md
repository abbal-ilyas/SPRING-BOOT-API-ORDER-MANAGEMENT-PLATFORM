# Gestion de Commandes (Backend) avec Spring Boot et MySQL 📦

## Description ℹ️

Le backend de la plateforme de gestion des commandes est une API RESTful construite avec Spring Boot qui fournit des fonctionnalités pour gérer efficacement les enregistrements de commandes et tous composants liées a ce processus. .

## Fonctionnalités 🚀

- **Opérations CRUD** : Opérations de création, lecture, mise à jour et suppression pour gérer les informations des commandes et tous composants liées a ce processus.
- **Suivi des Commandes** : Enregistrer et récupérer les enregistrements des commandes.
- **Authentification et Autorisation** : Sécurisation des endpoints de l'API avec des mécanismes d'authentification et d'autorisation.
- **Contrôle d'Accès Basé sur les Rôles** : Définition des rôles et des permissions pour restreindre l'accès à des endpoints spécifiques.
- **Documentation de l'API** : Documentation interactive de l'API utilisant Swagger UI.

## Prérequis 🛠️

Assurez-vous d'avoir les éléments suivants installés :

- Java Development Kit (JDK) 21
- Apache Maven
- MySQL Database

## Installation ⚙️

1. Cloner le dépôt :

    ```bash
    git clone https://github.com//abbal-ilyas/SPRING-BOOT-API-ORDER-MANAGEMENT-PLATFORM.git
    ```

2. Naviguer vers le répertoire du projet :

    ```bash
    cd SPRING-BOOT-API-ORDER-MANAGEMENT-PLATFORM
    ```

3. Construire le projet :

    ```bash
    mvn clean install
    ```

4. Lancer l'application :

    ```bash
    mvn spring-boot:run
    ```

## Configuration 🔧

- Configuration de la base de données : Mettez à jour `application.properties` avec les détails de connexion de votre base de données MySQL.
- Configuration de la sécurité : Personnalisez les paramètres de sécurité dans `SecurityConfig.java`.

## Utilisation 📝

- Accéder à  l'API sur `http://localhost:8080/` 
- Utiliser les méthodes HTTP appropriées (GET, POST, PUT, DELETE) pour interagir avec l'API.
- Les endpoints sécurisés peuvent nécessiter une authentification. Obtenez un jeton d'accès en utilisant le mécanisme d'authentification fourni.

## Contribution 🤝

Les contributions sont les bienvenues ! Veuillez ouvrir une issue ou soumettre une pull request pour toute amélioration ou correction de bogue.

## Licence 📚

Ce projet est uniquement à des fins éducatives dans le cadre universitaire. Vous êtes libre d'utiliser, de modifier et de distribuer le code à des fins académiques. Cependant, l'utilisation commerciale et la redistribution en dehors du contexte universitaire ne sont pas autorisées sans permission explicite.
