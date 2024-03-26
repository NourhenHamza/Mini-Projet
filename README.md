# Mini-Projet
## -Chat Service
Ce projet contient un serveur de chat simple implémenté en Java utilisant des sockets. Le serveur permet à plusieurs clients de se connecter et de communiquer entre eux via des messages texte.

#### Déploiement
Ouvrez un terminal.
Naviguez jusqu'au répertoire contenant le code source de l'application de chat.
Compilez les fichiers source à l'aide de la commande javac *.java.
Lancez le serveur en exécutant la commande java ChatServer.
#### Test
Ouvrez un autre terminal.
Naviguez vers le même répertoire contenant le code source de l'application de chat.
Lancez un client en exécutant la commande java ChatClient.
Répétez l'étape 3 pour lancer plusieurs clients et simuler une conversation.

Les clients peuvent maintenant se connecter au serveur à l'aide de l'adresse IP et du port spécifiés dans le code.

Le serveur de chat peut être étendu pour prendre en charge des fonctionnalités supplémentaires telles que:
Gestion des noms d'utilisateur pour identifier les clients.
## -Task Manager

Ce projet est une application de gestion de tâches qui permet à un utilisateur d'ajouter, de supprimer et de consulter une liste de tâches.

####  Déploiement
Ouvrez le projet dans IntelliJ IDEA.
Assurez-vous que toutes les dépendances sont résolues.
Exécutez TaskListServer.java pour démarrer le serveur.
#### Test
Exécutez TaskListClient.java pour démarrer le client.
Utilisez le menu pour ajouter, supprimer ou afficher les tâches.
Testez la suppression de tâches inexistantes pour vérifier que le programme les gère correctement.

Une fois l'application exécutée, le client affiche un menu avec les options suivantes :

1. **Ajouter une nouvelle tâche** : Permet à l'utilisateur d'ajouter une nouvelle tâche à la liste.
2. **Supprimer une tâche existante** : Permet à l'utilisateur de supprimer une tâche existante de la liste.
- Si l'utilisateur essaie de supprimer une tâche qui n'existe pas dans la liste, un message s'affiche indiquant que la tâche n'existe pas et elle n'est pas supprimée de la liste.
3. **Récupérer la liste complète des tâches** : Affiche la liste complète des tâches actuellement enregistrées.
4. **Quitter** : Permet à l'utilisateur de quitter l'application.