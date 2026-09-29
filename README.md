# Auto Check – Android Testversion

Diese Version setzt das gewünschte Startmenü um:

- Startbild als Werkstatt-/Supercar-Szene
- AUTO CHECK Logo fährt von oben in ca. 2,5 Sekunden ein
- drei linke Buttons fahren von links ein
- drei rechte Buttons fahren von rechts ein
- alle sechs Animationen laufen innerhalb von ca. 2,5 Sekunden
- MEIN AUTO ist rot hervorgehoben
- alle Buttons sind anklickbar und öffnen aktuell einen einfachen Dialog
- Portrait-Layout für Handy
- Hintergrund und Logo sind lokal im APK enthalten

## GitHub

1. Auf GitHub ein neues Repository anlegen, z. B. `AutoCheck`.
2. Den Inhalt dieses Ordners hochladen.
3. Commit auf `main` machen.
4. Unter **Actions** den Workflow **Build Auto Check APK** öffnen.
5. Nach dem Build unter **Artifacts** `AutoCheck-debug-apk` herunterladen.
6. Die enthaltene `app-debug.apk` auf dem Android-Handy öffnen und installieren.

## Lokal bauen

Mit JDK 17 und Gradle 8.9:

```bash
gradle assembleDebug
```

APK:
`app/build/outputs/apk/debug/app-debug.apk`
