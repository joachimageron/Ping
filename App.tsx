// src/PingScreen.tsx
import React from 'react';
import {View, Text, StyleSheet, Button, NativeModules} from 'react-native';

const {AlarmModule} = NativeModules;

const PingScreen: React.FC = () => {
  const logMessage = () => {
    AlarmModule.logMessage('un super message');
  };
  
  const setAlarm = () => {
    // Exemple : définir une alarme à 7h30 avec un message "Réveil"
    const now = new Date();
    const h = now.getHours();
    const m = now.getMinutes() + 1;
    AlarmModule.setAlarm(h, m, "Réveil");
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Ping!</Text>
      <Text style={styles.subtitle}>Waiting for a Ping...</Text>
      <Button title="Log Message" onPress={logMessage} />
      <Button title="Set Alarm" onPress={setAlarm} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f5f5f5',
  },
  title: {
    fontSize: 32,
    fontWeight: 'bold',
    marginBottom: 20,
  },
  subtitle: {
    fontSize: 18,
    color: '#666',
    marginBottom: 40,
  },
});

export default PingScreen;
