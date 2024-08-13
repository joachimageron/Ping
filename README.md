

# Ping! 📲

**Ping!** est une application Android simple et pratique que j'ai développée pour mon propre usage. Son objectif principal est de permettre à mon téléphone de sonner à distance en envoyant une requête API. C'est idéal pour ces moments où je ne trouve pas mon téléphone ou quand j'ai besoin de me rappeler de quelque chose d'important. Pas de fioritures, juste l'essentiel.

## Getting Started

Ce projet a été démarré avec **@react-native-community/cli**.

### Prérequis

Avant de commencer, assure-toi d'avoir complété les instructions de configuration de l'environnement React Native jusqu'à l'étape "Creating a new application".

### Étape 1: Démarrer le Serveur Metro

Tout d'abord, tu devras démarrer Metro, le bundler JavaScript qui accompagne React Native.

Pour démarrer Metro, exécute la commande suivante à partir de la racine de ton projet React Native :

```bash
# using npm
npm start

# OR using Yarn
yarn start
```

### Étape 2: Démarrer ton Application

Laisse Metro Bundler s'exécuter dans son propre terminal. Ouvre un nouveau terminal à partir de la racine de ton projet React Native. Exécute la commande suivante pour démarrer ton application Android ou iOS :

#### Pour Android

```bash
# using npm
npm run android

# OR using Yarn
yarn android
```

#### Pour iOS

```bash
# using npm
npm run ios

# OR using Yarn
yarn ios
```

Si tout est bien configuré, tu devrais voir ta nouvelle application s'exécuter dans ton émulateur Android ou ton simulateur iOS peu de temps après, à condition d'avoir correctement configuré ton émulateur/simulateur.

### Étape 3: Modifier ton Application

Maintenant que tu as réussi à exécuter l'application, modifions-la.

Ouvre `App.tsx` dans ton éditeur de texte préféré et édite quelques lignes.

- **Pour Android** : Appuie deux fois sur la touche `R` ou sélectionne "Reload" dans le menu développeur (Ctrl + M (sur Windows et Linux) ou Cmd ⌘ + M (sur macOS)) pour voir tes modifications !
- **Pour iOS** : Appuie sur Cmd ⌘ + R dans ton simulateur iOS pour recharger l'application et voir tes modifications !

### Félicitations! 🎉

Tu as réussi à exécuter et modifier ton application React Native. 🥳

---

## Fonctionnalités de Ping! 🚀

- **Réception de Notifications via API** : Envoie une requête HTTP à l'API, et Ping! se charge du reste. Dès que l'application reçoit la notification, elle fait sonner mon téléphone.
- **Sonnerie Personnalisée** : Utilisation de la sonnerie par défaut du téléphone ou personnalisation du son à jouer lors de l'alerte.
- **Fonctionnement en Arrière-Plan** : L'application fonctionne même si elle est en arrière-plan ou que l'écran est verrouillé.
- **Notifications Haute Priorité** : Utilise Firebase Cloud Messaging (FCM) pour garantir que les notifications sont toujours reçues rapidement, même si le téléphone est en mode économie d'énergie.

## Pourquoi j'ai créé ce projet 💡

Je cherchais une solution simple pour pouvoir faire sonner mon téléphone à distance. Que ce soit pour retrouver mon appareil ou pour un rappel, Ping! est conçu pour être rapide et efficace. C'est un projet personnel, donc je n'ai pas prévu de le rendre public sur le Play Store – c'est juste pour moi, mais c'est toujours utile de l'avoir documenté ici pour référence future.

## Comment ça marche ⚙️

1. **Installation** : Installer l'APK généré directement sur mon téléphone.
2. **Configuration de Firebase** : Le projet est déjà configuré avec Firebase Cloud Messaging. Pas besoin de toucher à ça pour l'instant.
3. **Utilisation** :
   - Envoyer une requête API à l'endpoint configuré (voir le script Google Apps ou l'outil que j'utilise pour envoyer la requête).
   - Le téléphone sonnera dès la réception de la notification.

## Développement 🛠️

Le projet est développé en **React Native** sans Expo. La configuration de FCM et la gestion des notifications sont gérées directement dans le code, avec quelques ajustements dans les fichiers natifs d'Android.

### Tech Stack

- **React Native** pour le développement de l'application mobile.
- **Firebase Cloud Messaging (FCM)** pour la gestion des notifications.
- **JavaScript** et un peu de **Java** pour les ajustements Android.

## Ce qui reste à faire 🔧

- [ ] Ajouter une option pour changer la sonnerie directement depuis l'application.
- [ ] Tester sur plusieurs appareils pour s'assurer que tout fonctionne bien.
- [ ] Peut-être ajouter une interface plus conviviale pour gérer les notifications.

## Licence 📄

Ceci est un projet personnel, pas de licence formelle. Mais si un jour je décide de partager le code, je pourrais opter pour une licence MIT.

---

## Ressources Utiles 📚

Pour en savoir plus sur React Native, jette un coup d'œil aux ressources suivantes :

- [Site officiel de React Native](https://reactnative.dev/) - pour en savoir plus sur React Native.
- [Getting Started](https://reactnative.dev/docs/getting-started) - un aperçu de React Native et comment configurer ton environnement.
- [Learn the Basics](https://reactnative.dev/docs/tutorial) - une visite guidée des bases de React Native.
- [Blog](https://reactnative.dev/blog) - lis les derniers articles officiels du blog de React Native.
- [@facebook/react-native](https://github.com/facebook/react-native) - le dépôt Open Source sur GitHub pour React Native.

Si tu rencontres des problèmes, consulte la page [Troubleshooting](https://reactnative.dev/docs/troubleshooting).

